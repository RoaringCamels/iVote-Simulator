/**
 * The Question class can be type 0(Single choice) or type 1(Multiple choice)
 * Contains a String question that is being asked
 * Contains an integer numberOfChoices
 */

class Question{
    private int type; //0 = SC, 1 = MC
    private String question;
    private int numberOfChoices;

    public Question(int type,String newQuestion, int numberOfChoices){
        this.type = type;
        this.question = newQuestion;
        this.numberOfChoices = numberOfChoices;
    }

    //-----------------DEFAULT METHODS-----------------
    public void setQuestion(String a){
        this.question = a;
    }
    public void setType(int x){
        this.numberOfChoices = x;
    }
    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }
    public int getType() {
        return type;
    }
    public String getQuestion() {
        return question;
    }
    public int getNumberOfChoices(){
        return this.numberOfChoices;
    }
    public String toString(){
        return "This quesion is type: " + this.type + "\nQuestion: " + this.question + "\nWith " + this.numberOfChoices + " number of choices.";
    }// end DEFAULT METHODS


    public String printChoices (){
        int a = 64;
        numberOfChoices = numberOfChoices + a;
        char c = (char)numberOfChoices;
        return "Choose only 1 answer: \n" + this.question + "\n" +"A - " + c + " respectively: \n\n";
    }    
}

