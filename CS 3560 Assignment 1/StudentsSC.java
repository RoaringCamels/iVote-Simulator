 import java.util.*;
 public class StudentsSC {
    
    private String ID;
    private String studentAnswer;

    //-----------------DEFAULT METHODS-----------------
    public StudentsSC (String newID, String newAnswer){
        this.ID = newID;
        this.studentAnswer = newAnswer;
    }
     public void setID (String newID){
        this.ID = newID;
    }
    public void setStudentAnswer (String newAnswer){
        this.studentAnswer = newAnswer;
    }
    public String getID (){
        return this.ID;
    }
    public String getStudentAnswer (){
        return this.studentAnswer;
    }
    public String toString(){
        return "Student ID: " + ID + "\nChooses answer: " + studentAnswer;
    }// end DEFAULT METHODS

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

    public String multipleAnswerGenerator (int numberOfChoices){
        Random randomNumberOfTimesToGenerate = new Random();
        Random randomNumberOfAnswersChosen = new Random();
        int numberOfTimesToGenerate = 
        ArrayList<Characters> answers = new ArrayList<Characters>();
        for(int i = ; i < 0;)


    }
}
