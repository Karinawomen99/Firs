package dz1;

public class MathOperations {
    public static void main (String[] args){
        System.out.println("Сложение" +add (10,5));
        System.out.println("вычетание" +subtract (10,5));
        System.out.println("Умножение" +multiply (10,5));
        System.out.println("Деление" +divide (10,5));
        System.out.println("Максимум" +findMax (10,5));
        System.out.println("Разница" +difference (10,5));
        System.out.println("Площадь квадрата" +squareArea (4));
        System.out.println("Периметр квадрата" +squarePerimeter (4));
        System.out.println("Перевод секунд в минуты " +convertSecondsToMinutes (120));
        System.out.println("Средняя скорост " +averageSpeed (100,2));
        System.out.println("Гипотенуза" +findHypotenuse (3,4));
        System.out.println("длина окружности " +circleCircumference (5));
        System.out.println("Процент от общего " +calculatePercentage (200,50)+"%");
        System.out.println(" Цельсия в Фаренгейты " + celsiusToFahrenheit (25));
        System.out.println(" Фаренгейтов в Цельсии" + fahrenheitToCelsius (77));




    }

   public static int add(int x, int y) {return x + y; }//возвращение сумма двух чисел
   public static int subtract(int x, int y) {return x - y; } // возвращениеразность двух чисел
   public static int multiply(int x, int y) {return x * y; }//возвращение  произведение двух чисел
   public static double divide(int x, int y) {return (double) x / y; }// возвращение деление двух чисел
     public static int findMax(int a, int b){ return Math.max (a,b);}// встроенный метод Math.max
     public static int difference(int x, int y){ return Math.abs(x - y);}// встроенный метод Math.abs
     public static int squareArea(int side ){ return side * side;}// площадь сторон
     public static int squarePerimeter(int side ){ return 4 * side;}// Периметр квадрата
     public static double convertSecondsToMinutes(int seconds ){ return seconds / 60.0;}// делим на 60 для перевода в минуты
     public static double averageSpeed(double distance , double time){ return distance / time;}// формула скорости расстоняния/  время
     public static double findHypotenuse(double a, double b){ return  Math.sqrt( a*a + b*b);}// теорема Пифагора c² = a² + b²
     public static double  circleCircumference(double radius){ return 2* Math.PI * radius;}// Формула окружности
     public static double  calculatePercentage(double total, double part){ return (part/ total)*100;}//формулу процента ( часть / общеее)* 100
     public static double  celsiusToFahrenheit(double celsius){ return (celsius*9/5) +32;}// Формула (F=C×9/5+32F).
     public static double  fahrenheitToCelsius(double fahrenheit){ return (fahrenheit-32) * 5/9;}// Формула  (C=(F−32)×5/9C )..






}
