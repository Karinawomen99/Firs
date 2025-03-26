package dz4;

public class Divisible {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; ; i++)
        {
            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            if (count == 10) {
                break;
            }
        }
    }
}