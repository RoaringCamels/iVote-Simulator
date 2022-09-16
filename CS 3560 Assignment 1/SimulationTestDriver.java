import java.util.*;
public class SimulationTestDriver {

    

public static void main(String[] args) {
    AlphanumericGenerator generate = new AlphanumericGenerator(); //object that randomly creates the ID and answers
    ArrayList<String> arrList = new ArrayList<String>(); //arraylist object to input for VotingService

    //Question with number of choices
    QuestionSingleChoice q1 = new QuestionSingleChoice("Sushi, KBBQ, Buffet, Blank, Blank and Blank?", 6);

    //object that keeps track of the stats
    VotingService poll = new VotingService(0,q1.getNumOfChoice(),arrList);
    
    //creating the student objects
    StudentsSC s1 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    StudentsSC s2 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    

    System.out.println(q1);
    System.out.println(s1+"\n");
    System.out.println(s2+"\n");

    arrList.add(s1.getStudentAnswer());
    arrList.add(s2.getStudentAnswer());

    System.out.println(poll.getStat());

    //System.out.println(s1.getStudentAnswer());
    //System.out.println(s1.getStudentAnswer());




}
}