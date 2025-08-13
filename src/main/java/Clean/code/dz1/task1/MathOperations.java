package Clean.code.dz1.task1;

public class MathOperations {
    public int add(int ... numbers){
        int sum = 0;
        for (int number : numbers)sum += number;
        return sum;
    }
}

