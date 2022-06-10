package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @org.testng.annotations.Test
    public void shouldTestRemainBoundaryValuesOne() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldTestRemainBoundaryValuesFour() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void shouldTestRemainBoundaryValuesTwo() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void shouldTestRemainBoundaryValuesThree() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }


    @org.testng.annotations.Test
    public void shouldTestRemainBoundaryValuesFive() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void shouldTestRemainCriticalPath() {
        org.testng.Assert.assertEquals(service.remain(350), 650);
    }
}