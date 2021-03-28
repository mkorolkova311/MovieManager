package manager;

import domain.MovieItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    public void shouldMovieAddTest() {
        MovieManager manager = new MovieManager(1);
        MovieItem movie = new MovieItem(1, "Titanic", 1, 1);
        manager.add(movie);
        MovieItem[] actual = manager.getlastLimit();
        MovieItem[] expected = new MovieItem[]{movie};
        assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldLast10Movies() {
        MovieManager manager = new MovieManager(3);
        MovieItem movie0 = new MovieItem(1, "Titanic", 1, 1);
        MovieItem movie1 = new MovieItem(2, "KillBill", 2, 2);
        MovieItem movie2 = new MovieItem(3, "Charlie's Angels", 3, 3);
        MovieItem movie3 = new MovieItem(4, "Beethoven", 4, 4);
        manager.add(movie0);
        manager.add(movie1);
        MovieItem[] actual = manager.getlastLimit();
        MovieItem[] expected1 = new MovieItem[]{movie1,movie0};
        assertArrayEquals(actual, expected1);
        manager.add(movie2);
        manager.add(movie3);
        actual = manager.getlastLimit();
        MovieItem[] expected2 = new MovieItem[]{movie3,movie2,movie1};
        assertArrayEquals(actual, expected2);
    }

    @Test
    public void shouldRemoveById() {
        MovieManager manager = new MovieManager(2);
        MovieItem movie1 = new MovieItem(1, "Titanic", 1, 1);
        MovieItem movie2 = new MovieItem(2, "KillBill", 2, 2);
        MovieItem movie3 = new MovieItem(3, "Charlie's Angels", 3, 3);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.removeById(2);
        MovieItem[] actual = manager.getlastLimit();
        MovieItem[] expected = new MovieItem[]{movie3,movie1};
        assertArrayEquals(actual,expected);
    }
}


