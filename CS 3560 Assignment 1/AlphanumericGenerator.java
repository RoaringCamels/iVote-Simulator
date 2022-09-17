import java.util.*;

public class AlphanumericGenerator{
    public String IDGenerator(int lengthOfID){
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder s = new StringBuilder(lengthOfID);

        int i;
        for (i = 0; i < lengthOfID; i ++){
            int ch = (int)(str.length()*Math.random()); //generates a random number using Math.random()
            s.append(str.charAt(ch)); //adds a random character one by one at the end of s
        }
    return s.toString();
    }

   public String ABCDGeneratorSC (int numberOfChoices){
        Random rand = new Random();
        char c = (char)(rand.nextInt(numberOfChoices) + 'A');
        String string = Character.toString(c);
        return string;
    }

    public String multipleAnswerGenerator (int numberOfChoices){
        Random randomNumberOfTimesToGenerate = new Random();
        int numberOfTimeToGenerate = randomNumberOfTimesToGenerate.nextInt(numberOfChoices-1)+1;

        ArrayList<String> answers = new ArrayList<String>();
        Random rand = new Random();

        for(int i = 0; i < numberOfTimeToGenerate; i++){
        char c = (char)(rand.nextInt(numberOfChoices) + 'A');
        String string = Character.toString(c);
        answers.add(string);
        }
        String listToString = String.join(" ", answers);
        //this.studentAnswer = listToString;
        return listToString;

    
}}

