/**
 * SimulationTestDriver
 */
public class SimulationTestDriver {

    

public static void main(String[] args) {
    QuestionSingleChoice q1 = new QuestionSingleChoice("Sushi,KBBQ or Buffet?", 3);
    AlphanumericGenerator generate = new AlphanumericGenerator();
    StudentsSC s1 = new StudentsSC(generate.IDGenerator(5),"B");
    StudentsSC s2 = new StudentsSC(generate.IDGenerator(5),"B");
    

    //System.out.println(q1);
    System.out.println(s1);
    System.out.println(s2);
    //System.out.println(num1.IDGenerator(5));
}
}