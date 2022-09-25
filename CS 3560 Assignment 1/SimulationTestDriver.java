import java.util.*;

public class SimulationTestDriver {
    /**
     * This class is the TestDriver
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Question with number of choices
        Question q1 = new Question(1, "Sushi, KBBQ, Buffet, Blank, Blank and Blank?", 6);

        // objects that keeps track of the stats
        ArrayList<String> stats = new ArrayList<String>();
        VotingService poll = new VotingService(q1.getType(), q1.getNumberOfChoices(), stats);

        // creating the student objects
        Student student1 = new Student(5, q1.getType(), q1.getNumberOfChoices());
        Student student2 = new Student(10, q1.getType(), q1.getNumberOfChoices());
        Student student3 = new Student(20, q1.getType(), q1.getNumberOfChoices());

        // prints the students id and their answers
        System.out.print(student1 + "\n");
        System.out.print(student2 + "\n");
        System.out.print(student3 + "\n");

        // adds the students answer onto the arraylist
        stats.add(student1.getStudentAnswer());
        stats.add(student2.getStudentAnswer());
        stats.add(student3.getStudentAnswer());

        System.out.println(stats);

        // print the poll - total amount of the letters that were picked
        poll.letterCounter(stats);
    }
}