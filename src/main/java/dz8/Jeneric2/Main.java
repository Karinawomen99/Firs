package dz8.Jeneric2;

public class Main {
    public static <T>void printArray(T[]array){
        for (T element :array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray ={5,6,7,8,3};
        String[]stArray ={"Have a","Good","day"};
        printArray(intArray);
        printArray(stArray);
    }
}
