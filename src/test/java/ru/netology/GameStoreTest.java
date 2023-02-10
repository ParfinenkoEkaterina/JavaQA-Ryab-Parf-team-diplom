package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }
    @Test
    public void ShouldShowIfContainGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("katana Zero", "Slasher");

        boolean expected = true;
        boolean actual = store.containsGame(game);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAddPlayTime() {
        GameStore store = new GameStore();

        String playerName = "Dima";
        int hours = 1;

        store.addPlayTime(playerName, hours);
        store.addPlayTime(playerName, hours);

        Assertions.assertEquals(hours * 2, store.getSumPlayedTime());

    }
    // другие ваши тесты
}
