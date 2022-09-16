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
    StudentsSC s3 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    StudentsSC s4 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    StudentsSC s5 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    StudentsSC s6 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    StudentsSC s7 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    

    System.out.println(q1);
    System.out.println(s1+"\n");
    System.out.println(s2+"\n");
    System.out.println(s3+"\n");
    System.out.println(s4+"\n");
    System.out.println(s5+"\n");
    System.out.println(s6+"\n");
    System.out.println(s7+"\n");

    arrList.add(s1.getStudentAnswer());
    arrList.add(s2.getStudentAnswer());
    arrList.add(s3.getStudentAnswer());
    arrList.add(s4.getStudentAnswer());
    arrList.add(s5.getStudentAnswer());
    arrList.add(s6.getStudentAnswer());
    arrList.add(s7.getStudentAnswer());
    
    System.out.println(poll.getStat());

    //System.out.println(s1.getStudentAnswer());
    //System.out.println(s1.getStudentAnswer());




}
}