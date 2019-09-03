import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Passenger passenger;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 100);
        passenger = new Passenger();
    }

    @Test
    public void checkBusSetup(){
        assertEquals("Edinburgh", bus.getDestination());
        assertEquals(100, bus.getCapacity());
        assertEquals(0, bus.getPassengerCount());
    }
}
