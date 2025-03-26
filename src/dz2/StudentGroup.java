package dz2;

import java.util.Set;

public class StudentGroup {
    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;}
    public String getGroupName (){return groupName;}
    public int getStudentCount (){return studentCount;}
    public void setGroupName (String groupName){this.groupName = groupName;}
    public void setStudentCount(int studentCount){this.studentCount= studentCount;}
    public void prinInfo (){
        System.out.println("Группа:"+groupName + "Количество студентов:"+ studentCount);

    }
}
