package com.renanzulian.quakeparser;

import java.util.ArrayList;
class Game {
    private int id;
    private int kills;
    private ArrayList<Player> players;

    Game(int id){
        this.id = id;
        this.kills = 0;
        players = new ArrayList<Player>();
    }

    public int getId() {
        return id;
    }

    public int getKills() {
        return kills;
    }

    public void addKill(int deadId, int killerId) {
        if (killerId == 1022) {
            Player dead = this.findPlayer(deadId);
            dead.removeKill();
        } else {
            Player killer = this.findPlayer(killerId);
            killer.addKill(); 
        }
        this.kills++;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(int playerId) {
        this.players.add(new Player(playerId));
    }

    public Player findPlayer(int id) {
        return this.players.stream()
            .filter(p -> p.getId() == id)
            .findAny()
            .orElse(null);
    }

    public Player findPlayer(String name) {
        return this.players.stream()
            .filter(p -> p.getName() == name)
            .findAny()
            .orElse(null);
    }

    @Override
    public String toString() {
        String gameData = String.format("game_%d:\n\tkills: %d\n\tscores: \n", this.getId(), this.getKills());
        String playerData = new String();
        for (Player player : this.players) {
            playerData += String.format("\t\t%s\n", player.toString());
        }
        return gameData + playerData;
    }

}