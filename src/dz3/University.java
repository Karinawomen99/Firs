package dz3;

public class University {
    static String universityName ;
    final int studentID;
    String studentName;
    public University(int studentID,String studentName){
        this.studentID = studentID;
        this.studentName = studentName;}
    static void changeUniversityName(String newName){
        universityName = newName;}
    String getStudentName (){
        return studentName;}
    public void printStudentInfo() {
        System.out.println("Студент:"+studentName + "Университет:"+ universityName);
    }
}
