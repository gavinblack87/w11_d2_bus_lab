import java.util.ArrayList;

public class BusStop {


    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }
    public String getName() {
        return name;
    }
    public int getQueueLength(){
        return this.queue.size();
    }

    public void addPerson(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removePerson() {
        return this.queue.remove(0);

    }
}
