/**
 * SimulationTestDriver
 */
public class SimulationTestDriver {

    

public static void main(String[] args) {
    QuestionSingleChoice q1 = new QuestionSingleChoice("Sushi,KBBQ, Buffet, Blank, Blank and Blank?", 6);
    AlphanumericGenerator generate = new AlphanumericGenerator();
    StudentsSC s1 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    StudentsSC s2 = new StudentsSC(generate.IDGenerator(5),generate.ABCDGeneratorSC(q1.getNumOfChoice()));
    

    System.out.println(q1);
    System.out.println(s1+"\n");
    System.out.println(s2+"\n");
    
}
}