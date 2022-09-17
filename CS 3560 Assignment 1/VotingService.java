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

    public void letterCounter(){
        Map<String, Integer> map = new HashMap<String,Integer>();

        for(String i: this.stat){
            Integer j = map.get(i);
            map.put(i, (j == null) ? 1: j + 1) ;
        }

        for(Map.Entry<String, Integer> val:map.entrySet()){
            System.out.println("Choice " + val.getKey() + " " + " was chosen "+ val.getValue() + " times.");
        }
    }

    
}