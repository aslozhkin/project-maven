package com.javarush.games.racer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectionTest {

    @Test
    @Disabled
    void values() {
        assertEquals(3, Direction.values().length);
    }
}