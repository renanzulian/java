package com.renanzulian.quakeparser;

import static org.junit.Assert.assertTrue;

import com.github.javafaker.Faker;

import org.junit.Test;

public class GameTest {
    Faker faker = new Faker();

    private Game gameFactory() {
        return new Game();
    }

    @Test
    public void shouldInstanceADefaultGame() {
        Game game = this.gameFactory();
        assertTrue(game instanceof Game);
    }
}