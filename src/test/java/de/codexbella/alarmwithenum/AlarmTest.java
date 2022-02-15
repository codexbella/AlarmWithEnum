package de.codexbella.alarmwithenum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {
    @Test
    void shouldBeOkBecauseZeroPeoplePlusRed(){
        assertEquals("Alles cool.", Alarm.customerCheck(0, AlertLevel.RED));
    }

    @Test
    void shouldBeOkBecauseZeroPeoplePlusYellow(){
        assertEquals("Alles cool.", Alarm.customerCheck(0, AlertLevel.YELLOW));
    }

    @Test
    void shouldBeOkBecauseZeroPeoplePlusGreen(){
        assertEquals("Alles cool.", Alarm.customerCheck(0, AlertLevel.GREEN));
    }

    @Test
    void shouldBeOkBecauseExactly30PeopleAndYellow(){
        assertEquals("Alles cool.", Alarm.customerCheck(30, AlertLevel.YELLOW));
    }

    @Test
    void shouldBeOkBecauseGreen(){
        assertEquals("Alles cool.", Alarm.customerCheck(31, AlertLevel.GREEN));
    }

    @Test
    void shouldNotBeOkBecauseMoreThanZeroPeoplePlusRed(){
        assertEquals("Alarm! -- Alarm!", Alarm.customerCheck(1, AlertLevel.RED));
    }

    @Test
    void shouldNotBeOkBecauseMoreThan30People(){
        assertEquals("Alarm! -- Alarm!", Alarm.customerCheck(31, AlertLevel.YELLOW));
    }

    @Test
    void shouldBeWrongInputAtRed(){
        assertEquals("Fehler: Negative Anzahl an Kunden nicht möglich.", Alarm.customerCheck(-1, AlertLevel.RED));
    }

    @Test
    void shouldBeWrongInputAtYellow(){
        assertEquals("Fehler: Negative Anzahl an Kunden nicht möglich.", Alarm.customerCheck(-1, AlertLevel.YELLOW));
    }

    @Test
    void shouldBeWrongInputAtGreen(){
        assertEquals("Fehler: Negative Anzahl an Kunden nicht möglich.", Alarm.customerCheck(-1, AlertLevel.GREEN));
    }
}