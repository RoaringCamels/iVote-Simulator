/**
 * The Question class can be type 0(Single choice) or type 1(Multiple choice)
 * Contains a String question that is being asked (Can be customized)
 * Contains an integer numberOfChoices (Can be customized)
 */

class Question {
    private int type; // 0 = SC, 1 = MC
    private String InputQuestion;
    private int numberOfChoices;

    public Question(int type, String question, int numberOfChoices) {
        this.type = type;
        this.InputQuestion = question;
        this.numberOfChoices = numberOfChoices;
    }

    // -----------------DEFAULT METHODS-----------------
    public void setQuestion(String a) {
        this.InputQuestion = a;
    }

    public void setType(int x) {
        this.numberOfChoices = x;
    }

    public void setNumberOfChoices(int numberOfChoices) {
        this.numberOfChoices = numberOfChoices;
    }

    public int getType() {
        return type;
    }

    public String getQuestion() {
        return InputQuestion;
    }

    public int getNumberOfChoices() {
        return this.numberOfChoices;
    }

    public String toString() {
        return "This quesion is type: " + this.type + "\nQuestion: " + this.InputQuestion + "\nWith "
                + this.numberOfChoices + " number of choices.";
    }// end DEFAULT METHODS

    /**
     * This method returns the possible choice letters depending on numberOfChoices
     * 
     * @return
     */
    public String printChoices() {
        int a = 64;
        numberOfChoices = numberOfChoices + a;
        char c = (char) numberOfChoices;
        return "Choose only 1 answer: \n" + this.InputQuestion + "\n" + "A - " + c + " respectively: \n\n";
    }// end printChoices
}
