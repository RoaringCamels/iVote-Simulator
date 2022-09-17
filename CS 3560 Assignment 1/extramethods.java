import java.util.*;
public class extramethods {
    /**
     * This method creates a random, single String of a letter for an answer dependent on the range of int numberOfChoices
     * @param numberOfChoices
     * @return a String string with a single random letter
     */
    public String singleAnswerGenerator (int numberOfChoices){
        Random random = new Random();
        char c = (char)(random.nextInt(numberOfChoices) + 'A');
        String string = Character.toString(c);
        return string;
    }
}
