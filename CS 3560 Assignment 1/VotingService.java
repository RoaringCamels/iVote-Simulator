import java.util.*;
import java.util.stream.Collectors;

public class VotingService {
    private int type; // 0 = SC, 1 = MC
    private int numberOfChoices;
    private ArrayList<String> stat;

    public VotingService(int type, int numberOfChoices, ArrayList<String> stat) {
        this.type = type;
        this.numberOfChoices = numberOfChoices;
        this.stat = stat;
    }

    // -----------------DEFAULT METHODS-----------------
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

    public String toString() {
        return "The poll states that poll type: " + type + "\nWith " + numberOfChoices
                + " possible choices, all being: " + stat;
    }// end DEFUALT METHODS

    /**
     * This method converts a String into an array, counts its characters using a
     * HashMap
     * and returns the occurance of that character
     * 
     * @param inputTotalFinalChoice
     */
    public void letterCounter(String inputTotalFinalChoice) {
        // Creating a HashMap containing the char as a key and occurances as the value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // converting the given string to char array
        char[] stringArray = inputTotalFinalChoice.toCharArray();

        // checking each char of the newly made array
        for (char c : stringArray) {
            // if char is present in the charCountMap, inrement that char's count by 1
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // if char is not present in the charCountMap, put that char into charCountMap
                // with 1 as its value
                charCountMap.put(c, 1);
            }
        }

        // printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }// end letterCounter

    /**
     * This method converts ArrayList<String> as a String
     * 
     * @param inputArray
     * @return inputArray as listString of type String
     */
    public String printArrayListToString(ArrayList<String> inputArray) {
        String listString = inputArray.stream().map(Object::toString).collect(Collectors.joining(""));
        return listString;
    }// end printArrayListToString
}