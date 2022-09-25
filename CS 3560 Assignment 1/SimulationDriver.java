import java.util.*;

public class SimulationDriver {
        public static void main(String[] args) {
                // -----------------SINGLE CHOICE QUESTION-----------------
                // Creating the question & student ID's
                Question q1 = new Question(0, "Would you rather go to sushi or KBBQ?", 2);
                Question q2 = new Question(1,
                                "Do you like Disneyland, Six Flags, Universal, Lego Land or Knotts Berry Farm?", 5);

                Student s0 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s1 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s2 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s3 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s4 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s5 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s6 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s7 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s8 = new Student(5, q1.getType(), q1.getNumberOfChoices());
                Student s9 = new Student(5, q1.getType(), q1.getNumberOfChoices());

                // Creating the answer storge to store all the answers from the students
                ArrayList<String> answerStorage = new ArrayList<String>();

                // Creating the VotingService object
                VotingService voteSerice = new VotingService(q1.getType(), q1.getNumberOfChoices(), answerStorage);

                // Print Question and Student Answers
                System.out.println(q1.printChoiceSC(q1.getType()));

                System.out.println(s0 + "\n");
                System.out.println(s1 + "\n");
                System.out.println(s2 + "\n");
                System.out.println(s3 + "\n");
                System.out.println(s4 + "\n");
                System.out.println(s5 + "\n");
                System.out.println(s6 + "\n");
                System.out.println(s7 + "\n");
                System.out.println(s8 + "\n");
                System.out.println(s9 + "\n");

                // Adds the students answers onto the storage
                answerStorage.add(s0.getStudentAnswer());
                answerStorage.add(s1.getStudentAnswer());
                answerStorage.add(s2.getStudentAnswer());
                answerStorage.add(s3.getStudentAnswer());
                answerStorage.add(s4.getStudentAnswer());
                answerStorage.add(s5.getStudentAnswer());
                answerStorage.add(s6.getStudentAnswer());
                answerStorage.add(s7.getStudentAnswer());
                answerStorage.add(s8.getStudentAnswer());
                answerStorage.add(s9.getStudentAnswer());

                // Printing the results
                voteSerice.letterCounter(answerStorage);
                System.out.println();
                // -----------------END SINGLE CHOICE QUESTION-----------------

                // -----------------MULTIPLE CHOICE QUESTION-----------------\
                // Those same stuednts changed their answer for the second question
                s0.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s1.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s2.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s3.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s4.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s5.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s6.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s7.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s8.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());
                s9.randomSetStudentAnswer(q2.getType(), q2.getNumberOfChoices());

                // Clearing the answerStorage to store the new values
                answerStorage.clear();

                answerStorage.add(s0.getStudentAnswer());
                answerStorage.add(s1.getStudentAnswer());
                answerStorage.add(s2.getStudentAnswer());
                answerStorage.add(s3.getStudentAnswer());
                answerStorage.add(s4.getStudentAnswer());
                answerStorage.add(s5.getStudentAnswer());
                answerStorage.add(s6.getStudentAnswer());
                answerStorage.add(s7.getStudentAnswer());
                answerStorage.add(s8.getStudentAnswer());
                answerStorage.add(s9.getStudentAnswer());

                // Printing the question and the new answers of the student
                System.out.println(q2.printChoiceSC(q2.getType()));

                System.out.println(s0 + "\n");
                System.out.println(s1 + "\n");
                System.out.println(s2 + "\n");
                System.out.println(s3 + "\n");
                System.out.println(s4 + "\n");
                System.out.println(s5 + "\n");
                System.out.println(s6 + "\n");
                System.out.println(s7 + "\n");
                System.out.println(s8 + "\n");
                System.out.println(s9 + "\n");

                // Printing the Results
                voteSerice.letterCounter(answerStorage);
                // -----------------END MULTIPLE CHOICE QUESTION-----------------
        }
}
