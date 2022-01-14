package com.neutrinosys.java.foundations.solutions.section7_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise3Test {

    @Test
    public void trailMix() {
        String spoon = Exercise3.spoonerize("trail mix");
        assertEquals("mail trix", spoon);
    }

    @Test
    public void soundBite() {
        String spoon = Exercise3.spoonerize("sound bite");
        assertEquals("bound site", spoon);
    }

    @Test
    public void flatCap() {
        String spoon = Exercise3.spoonerize("flat cap");
        assertEquals("cat flap", spoon);
    }

    @Test
    public void sadBallad() {
        String spoon = Exercise3.spoonerize("sad ballad");
        assertEquals("bad sallad", spoon);
    }

    @Test
    public void masterPlan() {
        String spoon = Exercise3.spoonerize("master plan");
        assertEquals("plaster man", spoon);
    }

    @Test
    public void trailSnacks() {
        String spoon = Exercise3.spoonerize("trail snacks");
        assertEquals("snail tracks", spoon);
    }

    @Test
    public void crushingBlow() {
        String spoon = Exercise3.spoonerize("crushing blow");
        assertEquals("blushing crow", spoon);
    }

}