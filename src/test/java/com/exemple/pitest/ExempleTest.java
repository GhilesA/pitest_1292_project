package com.exemple.pitest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExempleTest {

    @Test
    void testSum() {
        Exemple exemple = new Exemple();


        assertEquals(2, exemple.sum(1, 1));
    }
}
