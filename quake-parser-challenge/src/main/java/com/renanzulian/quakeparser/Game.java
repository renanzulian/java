package com.renanzulian.quakeparser;

import java.util.ArrayList;
class Game {
    private int id;
    private int kills;
    private ArrayList<Player> activePlayers;
    private ArrayList<Player> deactivePlayers;

    Game(int id){
        this.id = id;
        this.kills = 0;
        activePlayers = new ArrayList<Player>();
        deactivePlayers = new ArrayList<Player>();
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
        return activePlayers;
    }

    public void addPlayer(int playerId) {
        this.activePlayers.add(new Player(playerId));
    }

    public Player findPlayer(int id) {
        return this.activePlayers.stream()
            .filter(p -> p.getId() == id)
            .findAny()
            .orElse(null);
    }

    public Player findDeactivePlayer(String playerName) {
        return this.deactivePlayers.stream()
            .filter(p -> p.getName() == playerName)
            .findAny()
            .orElse(null);
    }

    @Override
    public String toString() {
        String gameData = String.format("game_%d:\n\tkills: %d\n\tscores: \n", this.getId(), this.getKills());
        String playerData = new String();
        for (Player player : this.activePlayers) {
            playerData += String.format("\t\t%s\n", player.toString());
        }
        return gameData + playerData;
    }

    public void toDisconnectPlayer(int playerId) {
        Player player = this.findPlayer(playerId);
        if (player != null) {
            this.activePlayers.remove(player);
            this.deactivePlayers.add(player);
        } else {
            System.out.println(String.format("Player %d not found.", playerId));
        }
        
    }

    public void toReconnectPlayer(String playerName) {
        Player player = this.findDeactivePlayer(playerName);
        if (player != null) {
            this.deactivePlayers.remove(player);
            this.activePlayers.add(player);
        } else {
            System.out.println(String.format("Player %s not found.", playerName));
        }
        
    }

}