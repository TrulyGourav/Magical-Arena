package com.example.arena;
import com.example.arena.constants.ExceptionMessages;

import java.util.Random;

public class Dice {
    private final int sides;
    private final Random random;

    public Dice(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_SIDE_VALUE.getMessage());
        }
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }
}

