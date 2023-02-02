package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    private GameStore store = null;
    Game game1 = null;
    Game game2 = null;
    Game game3 = null;
    Game game4 = null;
    Game game5 = null;
    Game game6 = null;


    @BeforeEach
    public void beforeEach() {
        store = new GameStore();
        game1 = store.publishGame("Mario", "Arcade");
        game2 = store.publishGame( "Invaders", "Arcade");
        game3 = store.publishGame("Top Gun", "Simulator");
        game4 = store.publishGame("F1", "Simulator");
        game5 = store.publishGame("KungFu", "Fighting");
        game6 = store.publishGame("Mortal Combat", "Fighting");

    }

    @Test
    public void shouldSumGenreIfOneGame() {

        Player player = new Player("Petya");
        player.installGame(game1);
        player.play(game1, 3);

        int expected = 3;
        int actual = player.sumGenre(game1.getGenre());
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSumGenreIfTwoGames() {

        Player player = new Player( "Petya");
        player.installGame(game1);
        player.installGame(game2);
        player.play(game1 , 5);
        player.play(game2 , 4);

        int expected = 9;
        int actual = player.sumGenre(game1.getGenre());
        assertEquals(expected, actual);

    }
    @Test
    public void shouldSumGenreIf


}
