 public class StudentsSC {
    
    private String ID;
    private String studentAnswer;

    public StudentsSC (String newID, String newAnswer){
        this.ID = newID;
        this.studentAnswer = newAnswer;
    }

    public void setID (String newID){
        this.ID = newID;
    }
    public void setStudentAnswer (String newAnswer){
        this.studentAnswer = newAnswer;
    }
    public String getID (){
        return this.ID;
    }
    public String getStudentAnswer (){
        return this.studentAnswer;
    }

    public String toString(){
        return "Student ID: " + ID + "\nChooses answer: " + studentAnswer;
    }
}
