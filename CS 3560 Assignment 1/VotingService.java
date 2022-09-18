import java.util.*;
import java.util.stream.Collectors;

public class VotingService {
    private int type; //0 = SC, 1 = MC
    private int numberOfChoices;
    private ArrayList<String> stat;

    public VotingService(int type, int numberOfChoices, ArrayList<String> stat){
        this.type = type;
        this.numberOfChoices = numberOfChoices;
        this.stat = stat;
    }

    //-----------------DEFAULT METHODS-----------------
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
    public String toString(){
        return "The poll states that poll type: " + type + "\nWith " + numberOfChoices + " possible choices, all being: " + stat;
    }//end DEFUALT METHODS

    public void letterCounter2(String input){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] stringArray = input.toCharArray();

        for (char c:stringArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c,1);
            }
        }

        for(Map.Entry entry:charCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public String printArrayListToString(ArrayList<String> inputArray){       
        String listString = inputArray.stream().map(Object::toString).collect(Collectors.joining(""));
        ArrayList<String> temp = new ArrayList<String>();
        temp.add(listString);
        this.stat = temp;
        return listString;
    }
}