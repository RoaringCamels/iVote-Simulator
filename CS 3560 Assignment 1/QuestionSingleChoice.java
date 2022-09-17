class QuestionSingleChoice{
    private int type; //0 = SC, 1 = MC
    private String question;
    private int numOfChoice;

    public QuestionSingleChoice(int type,String newQuestion, int numOfChoice){
        this.type = type;
        this.question = newQuestion;
        this.numOfChoice = numOfChoice;
    }

    public void setQuestion(String a){
        this.question = a;
    }
    public void setType(int x){
        this.numOfChoice = x;
    }
    public void setNumOfChoice(int numOfChoice) {
        this.numOfChoice = numOfChoice;
    }
    public int getType() {
        return type;
    }
    public String getQuestion() {
        return question;
    }
    public int getNumOfChoice(){
        return this.numOfChoice;
    }
    public String toString(){
        return "This quesion is type: " + this.type + "\nQuestion: " + this.question + "\nWith " + this.numOfChoice + " number of choices.";
    }
    public String print1 (){
        int a = 64;
        numOfChoice = numOfChoice + a;
        char c = (char)numOfChoice;
        return "Choose only 1 answer: \n" + this.question + "\n" +"A - " + c + " respectively: \n\n";
    }    
}

