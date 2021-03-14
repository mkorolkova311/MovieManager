package manger;

import domain.MovieItem;
import manager.MovieManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    public void shouldMovieAddTest() {
        MovieManager manager = new MovieManager(1);
        MovieItem movieItem = new MovieItem(1, "Titanic", 1, 1);
        manager.add(movieItem);
        assertEquals(manager.getlastLimit()[0].getMovieName(), movieItem.getMovieName());
    }
    @Test
    public void shouldLast10Movies() {
        MovieManager manager = new MovieManager();
        MovieItem movieItem = new MovieItem(1, "Titanic", 1, 1);
        MovieItem movieItem1 = new MovieItem(2, "KillBill", 2, 2);
        MovieItem movieItem2 = new MovieItem(3, "Charlie's Angels", 3, 3);
        MovieItem movieItem3 = new MovieItem(4, "Beethoven", 4, 4);
        MovieItem movieItem4 = new MovieItem(5, "The Green Mile", 5, 5);
        MovieItem movieItem5 = new MovieItem(6, "The Lion King", 6, 6);
        MovieItem movieItem6 = new MovieItem(7, "Taxi", 7, 7);
        MovieItem movieItem7 = new MovieItem(8, "Home Alone", 8, 8);
        MovieItem movieItem8 = new MovieItem(9, "Home Alone 2", 9, 9);
        MovieItem movieItem9 = new MovieItem(10, "The Great Gatsby", 10, 10);
        MovieItem movieItem10 = new MovieItem(11, "Dorian Gray", 11, 11);
        manager.add(movieItem);
        manager.add(movieItem1);
        manager.add(movieItem2);
        manager.add(movieItem3);
        manager.add(movieItem4);
        manager.add(movieItem5);
        manager.add(movieItem6);
        manager.add(movieItem7);
        manager.add(movieItem8);
        manager.add(movieItem9);
        manager.add(movieItem10);
        assertEquals(manager.getlastLimit().length, 10 );
    }

    @Test
    public void shouldRemoveById() {
        MovieManager manager = new MovieManager(2);
        MovieItem movieItem1 = new MovieItem(2, "KillBill", 2, 2);
        MovieItem movieItem2 = new MovieItem(3, "Charlie's Angels", 3, 3);
        manager.add(movieItem1);
        manager.add(movieItem2);
        manager.removeById(2);
        assertEquals(1,manager.getlastLimit().length);
    }
}


