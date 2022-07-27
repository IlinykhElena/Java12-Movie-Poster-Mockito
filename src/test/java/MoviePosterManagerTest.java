import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviePosterManagerTest {

    @Test
    public void shouldFindAll() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");

        String[] actual = manager.findAll();
        String[] expected = {"film1", "film2", "film3"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllIfNothingAdded() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindAllIfOnlyOneAdded() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addFilm("film1");

        String[] actual = manager.findAll();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastIfLimit10() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String[] actual = manager.findLast();
        String[] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
                "film10",
                "film9",
                "film8",
                "film7",
                "film6",
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimit10AndNothingAdded() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] actual = manager.findLast();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimit10AndOnlyOneAdded() {
        MoviePosterManager manager = new MoviePosterManager();
        manager.addFilm("film1");

        String[] actual = manager.findLast();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLastIfLimitNot10() {
        MoviePosterManager manager = new MoviePosterManager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");
        manager.addFilm("film13");
        manager.addFilm("film14");
        manager.addFilm("film15");

        String[] actual = manager.findLast();
        String[] expected = {
                "film15",
                "film14",
                "film13",
                "film12",
                "film11",
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitNot10AndNothingAdded() {
        MoviePosterManager manager = new MoviePosterManager(5);

        String[] actual = manager.findLast();
        String[] expected = {};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitNot10AndOnlyOneAdded() {
        MoviePosterManager manager = new MoviePosterManager(5);
        manager.addFilm("film1");

        String[] actual = manager.findLast();
        String[] expected = {"film1"};

        assertArrayEquals(expected, actual);
    }
}
