import java.util.*;

public class VotingService {

    private int counter;
    private int numberOfChoices;
    private ArrayList<String> stat;

    public VotingService(int counter, int numberOfChoices, ArrayList<String> stat){
        this.counter = counter;
        this.numberOfChoices = numberOfChoices;
        this.stat = stat;
    }

    public int getCounter() {
        return counter;
    }
    public int getNumberOfChoices() {
        return numberOfChoices;
    }
    public ArrayList<String> getStat() {
        return stat;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }
    public void setStat(ArrayList<String> stat) {
        this.stat = stat;
    }

    public ArrayList<String> poll = new ArrayList<String>();

    public void add(String a){
        poll.add(a);
    }


    
}