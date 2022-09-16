public class VotingService {
    AlphanumericGenerator generate = new AlphanumericGenerator();
    QuestionSingleChoice question1 = new QuestionSingleChoice("Feet, Hands or Booty", 3);
    StudentsSC student1 = new StudentsSC(generate.IDGenerator(5), generate.ABCDGeneratorSC(question1.getNumOfChoice()));

    
}