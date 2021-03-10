package manager;

import domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getlast10() {
        int a = 10;
        if  (items.length < 10) {
            a = items.length;
        }
        MovieItem[] result = new MovieItem[a];

        for (int i = 0; i < a; i++){
            int index = items.length - i - 1;
            result[i] = items[index];
        }
    return result;
    }

    public void removeById(int id){
        int length = items.length - 1;
        MovieItem[] tmp = new MovieItem[length];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getMovieId() != id){
                tmp[index] = item;
                index ++;
            }
        }
        items = tmp;
    }
}
