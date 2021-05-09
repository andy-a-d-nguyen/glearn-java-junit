package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LightSaberTests {

    LightSaber lightSaber;

    @Test
    void setChargeTest() {
        lightSaber = new LightSaber(1);
        lightSaber.setCharge(50.0d);

        assertEquals(50.0d, lightSaber.getCharge(), "should set correct charge");
    }

    @Test
    void getChargeTest() {
        lightSaber = new LightSaber(2);

        assertEquals(0.0d, lightSaber.getCharge(), "should return correct charge");
    }

    @Test
    void setColorTest() {
        lightSaber = new LightSaber(3);
        lightSaber.setColor("blue");

        assertEquals("blue", lightSaber.getColor(), "should set correct color");
    }
    
    @Test
    void getColorTest() {
        lightSaber = new LightSaber(4);
        
        assertEquals("green", lightSaber.getColor(), "should return correct color");
    }

    @Test
    void getJediSerialNumberTest() {
        lightSaber = new LightSaber(5);

        assertEquals(5, lightSaber.getJediSerialNumber(), "should return correct serial number");
    }

    @Test
    void useTest() {
        lightSaber = new LightSaber(6, 100.0d);
        lightSaber.use(60.0f);

        assertEquals(90, lightSaber.getCharge(), "should reduce charge");
    }

    @Test
    void getMinutesRemainingTest() {
        lightSaber = new LightSaber(7, 100.d);
        lightSaber.use(60.0f);

        assertEquals(540, lightSaber.getMinutesRemaining(), "should return remaining time limit");
    }

    @Test
    void rechargeTest() {
        lightSaber = new LightSaber(8, 50.0d);
        lightSaber.recharge();

        assertEquals(100.0d, lightSaber.getCharge(), "should recharge lightsaber");
    }
}
