import java.util.*;

/**
 * This class creates random alphanumeric Strings with custom lengths
 */
public class AlphanumericGenerator {
    /**
     * This method creates the student ID randomly picked from a default set String
     * notSoRandom
     * 
     * @param lengthOfID integer that defines the length of the String to be
     *                   returned
     * @return Randomly generated ID of type String
     */
    public String IDGenerator(int lengthOfID) {
        String notSoRandom = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder s = new StringBuilder(lengthOfID);

        int i;
        for (i = 0; i < lengthOfID; i++) {
            int ch = (int) (notSoRandom.length() * Math.random()); // generates a random number using Math.random()
            s.append(notSoRandom.charAt(ch)); // adds a random character one by one at the end of s
        }
        return s.toString();
    }// end IDGenerator

    /**
     * This method randomly picks a letter from an integer parameter
     * 
     * @param numberOfChoices integer that depends on the number of choices from the
     *                        quesion
     * @return Single letter of type String
     */
    public String ABCDGeneratorSC(int numberOfChoices) {
        Random rand = new Random();
        char c = (char) (rand.nextInt(numberOfChoices) + 'A');
        String string = Character.toString(c);
        return string;
    }// end ABCDGeneratorSC

    /**
     * This method randomly generates a String for multiple choice questions. If
     * there are four options,
     * it can choose, of the four options, different ones at different amounts.
     * 
     * @param numberOfChoices integer defining the limit of choices
     * @return a String of all options that were chosen
     */
    public String multipleAnswerGenerator(int numberOfChoices) {
        Random randomNumberOfTimesToGenerate = new Random();
        int numberOfTimeToGenerate = randomNumberOfTimesToGenerate.nextInt(numberOfChoices - 1) + 1;

        StringBuilder strbuild = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < numberOfTimeToGenerate + 1; i++) {
            char c = (char) (rand.nextInt(numberOfChoices) + 'A');
            String string = Character.toString(c);
            strbuild.append(string);
        }
        String singleStringAnswer = strbuild.toString();
        return singleStringAnswer;
    }// end multipleAnswerGenerator
}
