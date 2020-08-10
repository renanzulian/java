package com.renanzulian.quakeparser;

class Player {
    private int id;
    private String name;
    private int kills;

    Player(int id) {
        this.id = id;
        this.name = "Unknown";
        this.kills = 0;
    }

    Player(int id, String name) {
        this(id);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKills() {
        return kills;
    }

    public void addKill() {
        this.kills++;
    }

    public void removeKill() {
        this.kills--;
    }
}