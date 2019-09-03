import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    BusStop stop;
    Passenger passenger;

    @Before
    public void setup(){
        stop = new BusStop("codeclan");
        passenger = new Passenger();
    }
    @Test
    public void checkSetup(){
        assertEquals("codeclan", stop.getName());
        assertEquals(0, stop.getQueueLength());
    }
    @Test
    public void addPersonToQueue() {
        stop.addPerson(passenger);
        assertEquals(1, stop.getQueueLength());
    }
    @Test
    public void removePersonFromQueue(){
        stop.addPerson(passenger);
        stop.removePerson();
        assertEquals(0, stop.getQueueLength());
    }

}
