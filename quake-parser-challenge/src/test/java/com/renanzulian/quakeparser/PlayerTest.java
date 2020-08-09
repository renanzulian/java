package com.renanzulian.quakeparser;

import static org.junit.Assert.assertTrue;

import com.github.javafaker.Faker;

import org.junit.Test;

public class PlayerTest {
    Faker faker = new Faker();

    private Player playerFactory() {
        int randomId = faker.random().nextInt(100);
        return new Player(randomId);
    }
    
    @Test
    public void shouldCreateADefaultPlayer() {
        Player player = this.playerFactory();
        assertTrue(player instanceof Player);
        assertTrue(player.getName() == "Unknown");
        assertTrue(player.getKills() == 0);
    }

    @Test
    public void shouldAddKills() {
        int randomInt = faker.random().nextInt(5, 20);
        Player player = this.playerFactory();

        for (int i = 0; i < randomInt; i++) {
            player.addKill();
        }
        assertTrue(player.getKills() == randomInt);
    }

    @Test
    public void shouldUpdatePlayerName() {
        Player player = this.playerFactory();
        String randomName = faker.name().firstName();

        player.setName(randomName);
        assertTrue(player.getName() == randomName);
    }
}