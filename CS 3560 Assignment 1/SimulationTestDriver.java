import java.util.*;
public class SimulationTestDriver {

    

public static void main(String[] args) {
    AlphanumericGenerator generate = new AlphanumericGenerator(); //object that randomly creates the ID and answers
    ArrayList<String> arrList = new ArrayList<String>(); //arraylist object to input for VotingService

    //Question with number of choices
    Question q1 = new Question(0,"Sushi, KBBQ, Buffet, Blank, Blank and Blank?", 6);

    //object that keeps track of the stats
    VotingService poll = new VotingService(0,q1.getNumberOfChoices(),arrList);
    
    //creating the student objects
    Student s1 = new Student(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
    Student s2 = new Student(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
    Student studentTest = new Student(generate.IDGenerator(6), generate.multipleAnswerGenerator(q1.getNumberOfChoices()));

    System.out.println(q1.printChoices());
    
    //prints the students id and their answers
    System.out.println(s1+"\n");
    System.out.println(s2+"\n");
    System.out.println(studentTest+"\n");
    
    //adds the students answer onto the arraylist
    arrList.add(s1.getStudentAnswer());
    arrList.add(s2.getStudentAnswer());
    arrList.add(studentTest.getStudentAnswer());

    System.out.println(poll.getStat());
    //System.out.println(poll.printArrayListToString(arrList));
    poll.letterCounter2(poll.printArrayListToString(arrList));
}
}