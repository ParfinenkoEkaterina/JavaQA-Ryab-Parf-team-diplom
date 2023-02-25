package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameStoreTest {
    private GameStore store = null;

    @BeforeEach
    public void beforeEach() {
        store = new GameStore();
    }

    @Test
    public void shouldAddGame() {

        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    public void ShouldShowIfContainGame() {
        Game game = store.publishGame("katana Zero", "Slasher");

        boolean expected = true;
        boolean actual = store.containsGame(game);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnFalseIfNotContainGame() {
        Game game = store.publishGame("Zero", "Tuc");
        Game game1 = new Game("LED", "dfg", null);
        boolean expected = false;
        boolean actual = store.containsGame(game1);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnFalseIfGameNotExist() {
        Game game = new Game("Zero", "Tuc", null);


        boolean expected = false;
        boolean actual = store.containsGame(game);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddPlayTime() {

        String playerName = "Dima";
        int hours = 1;

        store.addPlayTime(playerName, hours);
        store.addPlayTime(playerName, hours);

        Assertions.assertEquals(hours * 2, store.getSumPlayedTime());

    }

    @Test
    public void shouldGetMostPlayer() {
        String playerOne = "Olya";
        String playerTwo = "Kolya";
        int hours1 = 2;
        int hours2 = 1;

        store.addPlayTime("Olya", hours1);
        store.addPlayTime("Kolya", hours2);

        Assertions.assertEquals("Olya", store.getMostPlayer());
    }

    // другие ваши тесты
    @Test
    public void shouldGetSumPlayedTime() {
        String playerOne = "Olya";
        String playerTwo = "Kolya";
        int hours1 = 2;
        int hours2 = 1;

        store.addPlayTime("Olya", hours1);
        store.addPlayTime("Kolya", hours2);
        Assertions.assertEquals(3, store.getSumPlayedTime());
    }
}
