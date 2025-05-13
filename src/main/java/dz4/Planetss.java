package dz4;

import java.util.Scanner;

public class Planetss {
    enum Planet {
        MERCURY(1, 0.055),
        VENUS(2, 0.815),
        EARTH(3, 1.0),
        MARS(4, 0.107),
        JUPITER(5, 317.8),
        SATURN(6, 95.2),
        URANUS(7, 14.5),
        NEPTUNE(8, 17.1);
     private  final  int order;
     private  final  double mass;
     Planet (int order,double mass){
         this.order =order;
         this.mass = mass;}

        public int getOrder() {
            return order;
        }
        public double getMass() {
         return mass;
        }
    }
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите планету (например EARTH):");
        String planetName = scanner.nextLine().toUpperCase();
        try {
            Planet planet = Planet.valueOf(planetName);
            System.out.println("Порядковый номер:" + planet.getOrder());
            System.out.println("Масса относительно Земли:" + planet.getMass());

        } finally {

        }





}
}
