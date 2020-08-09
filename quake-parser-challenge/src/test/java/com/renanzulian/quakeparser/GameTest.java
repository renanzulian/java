package com.renanzulian.quakeparser;

import static org.junit.Assert.assertTrue;

import com.github.javafaker.Faker;

import org.junit.Test;

public class GameTest {
    Faker faker = new Faker();

    private Game gameFactory(int numberOfPlayers) {
        int randomId = faker.random().nextInt(100);
        Game game = new Game(randomId);
        for (int i = 0; i < numberOfPlayers; i++) {
            game.addPlayer(new Player(i));
        }
        return game;
    }

    private Game gameFactory() {
        int quantityPlayers = faker.random().nextInt(5, 20);
        return this.gameFactory(quantityPlayers);
    }

    @Test
    public void shouldInstanceADefaultGame() {
        Game game = this.gameFactory();
        assertTrue(game instanceof Game);
        assertTrue(game.getKills() == 0);
    }

    @Test
    public void shouldHaveALotOfPlayers() {
        int numberOfPlayers = faker.random().nextInt(5, 20);
        Game game = this.gameFactory(numberOfPlayers);
        assertTrue(game.getPlayers().size() == numberOfPlayers);
    }

    @Test
    public void shouldFindAPlayer() {
        Game game = this.gameFactory();
        int randomId = faker.random().nextInt(5);
        Player player = game.findPlayer(randomId);
        assertTrue(player.getId() == randomId);
        assertTrue(player.getName() == "Unknown");
    }
}