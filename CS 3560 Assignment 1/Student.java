import java.util.*;

public class Student {
    private String ID;
    private String studentAnswer;

    public Student(int newIDLength, int questionType, int numberOfChoices) {
        this.ID = randomIDGenerator(newIDLength);
        randomSetStudentAnswer(questionType, numberOfChoices);
    }

    // -----------------DEFAULT METHODS-----------------
    public void setID(String newID) {
        this.ID = newID;
    }

    public void setStudentAnswer(String studenAnswer) {
        this.studentAnswer = studenAnswer;
    }

    public String getID() {
        return this.ID;
    }

    public String getStudentAnswer() {
        return this.studentAnswer;
    }

    public String toString() {
        return "Student ID: " + this.ID + "\nChooses answer: " + this.studentAnswer;
    }// end DEFAULT METHODS

    /**
     * This method creates a random answer choice letter depending if it SC or MC
     * and set the answer to this.studentAnswer
     * 
     * @param questionType
     * @param numberOfChoices
     */
    public void randomSetStudentAnswer(int questionType, int numberOfChoices) {
        if (questionType == 0) {
            this.studentAnswer = SCGenerator(numberOfChoices);
        } else if (questionType == 1) {
            this.studentAnswer = MCGenerator(numberOfChoices);
        }
    }// end randomSetStudentAnswer

    /**
     * This method creates the student ID randomly picked from a default set String
     * notSoRandom
     * 
     * @param lengthOfID integer that defines the length of the String to be
     *                   returned
     * @return Randomly generated ID of type String
     */
    private String randomIDGenerator(int lengthOfID) {
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
    private String SCGenerator(int numberOfChoices) {
        // creating the random object
        Random rand = new Random();
        // conversion of an integer to its correspconding ascii letter into a character
        char c = (char) (rand.nextInt(numberOfChoices) + 'A');
        // convert the character into a String
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
    private String MCGenerator(int numberOfChoices) {
        // we need 2 randomly generated numbers: One is for the randomly picked a
        // letter, and the other is
        // amount of times we are randomly picking a letter. we must also consuder that
        // there are no repeats

        // first random object to determine which random letter we are picking
        Random rand = new Random();
        // second random object determines how many times we call rand
        Random randomNumberOfTimesToGenerate = new Random();
        int numberOfTimeToGenerate = randomNumberOfTimesToGenerate.nextInt(numberOfChoices - 1) + 1;
        // like before, the ascii conversion is in the variable type of character.
        // therefore we need a stringbuilder
        // to combine the characters into one string
        StringBuilder strbuild = new StringBuilder();

        // this for loop creates the string of random letters
        for (int i = 0; i < numberOfTimeToGenerate + 1; i++) { // as long as we are less than numberOfTimeToGenerate
            char c = (char) (rand.nextInt(numberOfChoices) + 'A');// we pick a random letter of type char
            String string = Character.toString(c);// convert the letter pf type char into a type String
            strbuild.append(string);// combine all the letters of type String into one String
        } // end for loop
        String singleStringAnswer = strbuild.toString();// stringBuilder is a type itself but the conversion is easy

        // as mentioned earlier, we must consider no repetition
        // the easiest way is using a character array, traversing it and adding it onto
        // another StringBuilder (that i can think of)
        char[] chars = singleStringAnswer.toCharArray(); // convert the string we created earlier into an array of
                                                         // characters
        Set<Character> charSet = new LinkedHashSet<Character>();// creating a linked HashSet
        for (char c : chars) {// enhanced for loop; we travers the entire array of characters
            charSet.add(c);// and add it into the HashSet
        }
        StringBuilder sb = new StringBuilder();// StringBuider object
        for (Character character : charSet) {// enhanced for loop traverses the entire HashSet
            sb.append(character);// each element of the charSet is called 'character' and is appended onto the
                                 // String Builder
        }
        singleStringAnswer = sb.toString();// converts the stringbuilder into a string
        return singleStringAnswer;
    }// end multipleAnswerGenerator

}
