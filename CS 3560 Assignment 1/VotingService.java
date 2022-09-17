import java.util.*;

public class VotingService {

    private int type; //0 = SC, 1 = MC
    private int numberOfChoices;
    private ArrayList<String> stat;

    public VotingService(int type, int numberOfChoices, ArrayList<String> stat){
        this.type = type;
        this.numberOfChoices = numberOfChoices;
        this.stat = stat;
    }

    public int getType() {
        return type;
    }
    public int getNumberOfChoices() {
        return numberOfChoices;
    }
    public ArrayList<String> getStat() {
        return stat;
    }
    public void setType(int counter) {
        this.type = counter;
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
            System.out.println("Element " + val.getKey() + " " + " was chosen "+ val.getValue() + " times.");
        }
    }

    
}