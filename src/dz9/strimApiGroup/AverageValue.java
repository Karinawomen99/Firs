package dz9.strimApiGroup;

import java.util.List;
import java.util.OptionalDouble;

public class AverageValue {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        OptionalDouble average = numbers.stream().mapToDouble(Integer::intValue).average();
        if(average.isPresent()){
            System.out.printf("Среднее значение: %.2f/n", average.getAsDouble());
        }
        else {
            System.out.println("Список пуст ,невозможно вычислить среднее ");
        }
    }
}
