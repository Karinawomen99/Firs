package dz13.Third3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();
    public synchronized void addGrade(StudentGrade<T>grade)throws InvalidGradeException{
        if (grade.getGrade().doubleValue()<0){
            throw new InvalidGradeException(String.format("Оценека не может быть отрицательной :%s",grade.getGrade()));
        }
        grades.add(grade);
    }
    public double calculateAverageGradeBySubject(String subject){
        List<StudentGrade<T>>subjectGrades;
        synchronized (grades){
            subjectGrades =grades.stream().filter(g -> g.getSubject().equals(subject))
                    .collect(Collectors.toList());
        }
        if (subjectGrades.isEmpty()){
        return 0.0;
        }
        double sum = subjectGrades.stream().mapToDouble(g->g.getGrade().doubleValue()).sum();
        return sum/subjectGrades.size();

    }
    public synchronized List<StudentGrade<T>>getAllGrades(){
        return new ArrayList<>(grades);
    }
}
