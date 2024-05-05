package com.example.arena;

import com.example.arena.constants.ExceptionMessages;
import com.example.arena.exception.InvalidValueException;

public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    public Player(String name, int health, int strength, int attack) {
        if (health <= 0 || strength <= 0 || attack <= 0) {
            throw new InvalidValueException(ExceptionMessages.INVALID_CRED_VALUE.getMessage());
        }
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int getAttackDamage(int diceRoll) {
        return attack * diceRoll;
    }

    public int getDefenseStrength(int diceRoll) {
        return strength * diceRoll;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0) {
            throw new InvalidValueException(ExceptionMessages.INVALID_CRED_VALUE.getMessage());
        }
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (health <= 0) {
            throw new InvalidValueException(ExceptionMessages.INVALID_CRED_VALUE.getMessage());
        }
        this.strength = strength;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (health <= 0) {
            throw new InvalidValueException(ExceptionMessages.INVALID_CRED_VALUE.getMessage());
        }
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}

