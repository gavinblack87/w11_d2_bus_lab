import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Passenger passenger;
    Passenger passenger2;

    @Before
    public void setUp(){
        bus = new Bus("Edinburgh", 100);
        passenger = new Passenger();
        passenger2 = new Passenger();
    }

    @Test
    public void checkBusSetup(){
        assertEquals("Edinburgh", bus.getDestination());
        assertEquals(100, bus.getCapacity());
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void addPassenger(){
        bus.addPassenger(passenger);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void overCapacity() {
        bus = new Bus("Edinburgh", 1);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger2);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void removePassenger() {
        bus.addPassenger(passenger);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());
    }
}
