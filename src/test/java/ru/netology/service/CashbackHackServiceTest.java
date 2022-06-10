package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @org.junit.Test
    public void shouldTestRemainBoundaryValuesOne() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldTestRemainBoundaryValuesTwo() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void shouldTestRemainBoundaryValuesThree() {
        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void shouldTestRemainBoundaryValuesFour() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }


    @org.junit.Test
    public void shouldTestRemainBoundaryValuesFive() {
        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.junit.Test
    public void shouldTestRemainCriticalPath() {
        org.junit.Assert.assertEquals(650, service.remain(350));
    }
}