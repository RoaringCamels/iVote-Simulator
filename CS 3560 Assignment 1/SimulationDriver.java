import java.util.*;

public class SimulationDriver {
    public static void main(String[] args) {
        AlphanumericGenerator generate = new AlphanumericGenerator();
        ArrayList<String> q1Answers = new ArrayList<String>();
        ArrayList<String> q2Answers = new ArrayList<String>();

        //Creating the question
        Question q1 = new Question(0,"Pick a place to eat: Sushi or KBBQ",2); //One choice question
        Question q2 = new Question(1,"For those that apply, pick where you would go to: Disneyland, Universal Studios or Magic Mountain",3);

        //Initializing the poll
        VotingService poll = new VotingService(0, q1.getNumberOfChoices(), q1Answers);

        //Poll was taken from a total of 10 students w/ their answers for question 1 
        Student student1 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student2 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student3 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student4 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student5 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student6 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student7 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student8 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student9 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));
        Student student10 = new Student(generate.IDGenerator(8), generate.ABCDGeneratorSC(q1.getNumberOfChoices()));

        //Adds the students answers onto the storage
        q1Answers.add(student1.getStudentAnswer());
        q1Answers.add(student2.getStudentAnswer());
        q1Answers.add(student3.getStudentAnswer());
        q1Answers.add(student4.getStudentAnswer());
        q1Answers.add(student5.getStudentAnswer());
        q1Answers.add(student6.getStudentAnswer());
        q1Answers.add(student7.getStudentAnswer());
        q1Answers.add(student8.getStudentAnswer());
        q1Answers.add(student9.getStudentAnswer());
        q1Answers.add(student10.getStudentAnswer());

        //Printing the results
        System.out.println(q1.printChoices()); //prints the question

        System.out.println(student1 + "\n"); //prints the students ID and answer choice
        System.out.println(student2 + "\n");
        System.out.println(student3 + "\n");
        System.out.println(student4 + "\n");
        System.out.println(student5 + "\n");
        System.out.println(student6 + "\n");
        System.out.println(student7 + "\n");
        System.out.println(student8 + "\n");
        System.out.println(student9 + "\n");
        System.out.println(student10 + "\n");

        poll.letterCounter(poll.printArrayListToString(q1Answers)); //pint the statistics 

        //Poll was taken from a total of 10 students w/ their answers for question 2 
        Student student21 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student22 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student23 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student24 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student25 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student26 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student27 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student28 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student29 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));
        Student student30 = new Student(generate.IDGenerator(3), generate.multipleAnswerGenerator(q2.getNumberOfChoices()));

        //Adds the students answers onto the storage
        q2Answers.add(student21.getStudentAnswer());
        q2Answers.add(student22.getStudentAnswer());
        q2Answers.add(student23.getStudentAnswer());
        q2Answers.add(student24.getStudentAnswer());
        q2Answers.add(student25.getStudentAnswer());
        q2Answers.add(student26.getStudentAnswer());
        q2Answers.add(student27.getStudentAnswer());
        q2Answers.add(student28.getStudentAnswer());
        q2Answers.add(student29.getStudentAnswer());
        q2Answers.add(student30.getStudentAnswer());

        //Printing the results
        System.out.println(q2.printChoices()); //prints the question

        System.out.println(student21 + "\n"); //prints the students ID and answer choice
        System.out.println(student22 + "\n");
        System.out.println(student23 + "\n");
        System.out.println(student24 + "\n");
        System.out.println(student25 + "\n");
        System.out.println(student26 + "\n");
        System.out.println(student27 + "\n");
        System.out.println(student28 + "\n");
        System.out.println(student29 + "\n");
        System.out.println(student30 + "\n");

        poll.letterCounter(poll.printArrayListToString(q2Answers)); //pint the statistics

    }
}
