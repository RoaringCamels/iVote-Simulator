class QuestionSingleChoice{
    private String question;
    private int numOfChoice;

    public QuestionSingleChoice(String newQuestion, int numOfChoice){
        this.question = newQuestion;
        this.numOfChoice = numOfChoice;
    }

    public void setQuestion(String a){
        this.question = a;
    }
    public void setType(int x){
        this.numOfChoice = x;
    }
    public int getNumOfChoice(){
        return this.numOfChoice;
    }

    public String toString (){
        int a = 64;
        numOfChoice = numOfChoice + a;
        char c = (char)numOfChoice;
        return "Choose only 1 answer: \n" +"A - " + c + " respectively: \n\n" + this.question + "\n";
    }    
}

