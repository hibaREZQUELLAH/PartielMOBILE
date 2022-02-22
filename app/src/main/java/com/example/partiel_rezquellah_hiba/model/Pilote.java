package com.example.partiel_rezquellah_hiba.model;

import java.io.Serializable;

public class Pilote implements Serializable {
    private int id;
    private String name;

    public Pilote(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
