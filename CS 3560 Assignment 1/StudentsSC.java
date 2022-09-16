 public class StudentsSC {
    
    private String ID;
    private char studentAnswer;

    public StudentsSC (String newID, char newAnswer){
        this.ID = newID;
        this.studentAnswer = newAnswer;
    }

    public void setID (String newID){
        this.ID = newID;
    }
    public void setStudentAnswer (char newAnswer){
        this.studentAnswer = newAnswer;
    }

    public String getID (String ID){
        return this.ID;
    }
    public char getStudentAnswer (char answer){
        return this.studentAnswer;
    }

    public String toString(){
        return "Student ID: " + ID + "\nChooses answer: " + studentAnswer;
    }
}
