package Thrid3;

import dz13.Third3.GradeService;
import dz13.Third3.InvalidGradeException;
import dz13.Third3.StudentGrade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class GradeServiceTest {
    @Test
    public void testAddValidGrade()throws InvalidGradeException{
        GradeService<Integer>service =new GradeService<>();
        StudentGrade<Integer>grade = new StudentGrade<>("Максим","Математика",5);
        service.addGrade(grade);
        assertEquals(1,service.getAllGrades().size());
        assertEquals("Максим",service.getAllGrades().get(0).getStudentName());
    }
    @Test
    public void testAddNegativeGrade() {
        GradeService<Double> service = new GradeService<>();
        StudentGrade<Double> grade = new StudentGrade<>("Иван", "Физика", -2.5);
        assertThrows(InvalidGradeException.class, () -> {
            service.addGrade(grade);
        });
    }
    @Test
        public void testCalculateAverageGrade() throws InvalidGradeException {
        GradeService<Integer>service =new GradeService<>();
        service.addGrade(new StudentGrade<>("Anna","История",5));
        service.addGrade(new StudentGrade<>("Sofa","История",3));
        service.addGrade(new StudentGrade<>("Victor","Математика",4));

        double avgHistory = service.calculateAverageGradeBySubject("История");
        double avgMath = service.calculateAverageGradeBySubject("Математика");
        double avgEmpty = service.calculateAverageGradeBySubject("Физика");
        assertEquals(4.0,avgHistory,0.001);
        assertEquals(4.0,avgMath,0.001);
        assertEquals(0.0,avgEmpty,0.001);

        }
    }

