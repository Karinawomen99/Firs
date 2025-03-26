package dz6;

import dz6.zadach1.Animal;
import dz6.zadach1.Bird;
import dz6.zadach1.Elephant;
import dz6.zadach1.ZooManager;

public class Main {
    public static void main(String[] args) {
/*
        Pet cat = new Cat("Милка");
        Pet dog = new Dog("Берта");
        PetManger manger = new PetManger();
        manger.Show(cat);
        manger.Show(dog);

          */



        Animal elephant = new Elephant("Борис");
        Animal bird = new Bird("Кеша");

        ZooManager manager = new ZooManager();
        manager.Show(elephant);
        manager.add(elephant);
        manager.Show(bird);










        /*
        Dish soup = new HotDish(" Супчик,", 70);
        Dish coffee = new Drink(" Кофе", -200);
        RestauranManager manager = new RestauranManager();
        manager.showDish(soup);
        manager.showDish(coffee);

         */
        /*
       SeaCreature shark = new Shark("Акула");
       SeaCreature starfish = new Strafish(" Морская звезда");
       AquariumManager manager = new AquariumManager();
       manager.showCreature(shark);
       manager.showCreature(starfish);

         */
        /*
        FarmAnimal cow = new Cow(" Бурёнка");
        FarmAnimal chicken = new Chicken(" Ряба");
        FarmManager manager = new FarmManager();
        manager.magerAnumal(cow);
        manager.magerAnumal(chicken);

         */
        /*
       Plant orchid = new Orchid(" Орхидея");
       Plant cactus = new Cactus( " Кактус ");
       CardenManager manager = new CardenManager();
       manager.careForPlant(orchid);
       manager.careForPlant(cactus);

         */
        /*
        Attraction rollerCoaster = new RollerCoaster(" Американские горки");
        Attraction carousel = new Carousel(" Карусель");
        ParkManager manager = new ParkManager();
        manager.mangeAttraction(rollerCoaster);
        manager.mangeAttraction(carousel);

         */
        /*
        Exhibit manuscript = new Manuscript("Манускрипт");
        Exhibit sculpture = new Sculpture("Мария");
        MuseumManager manager = new MuseumManager();
        manager.managerExhibit(manuscript);
        manager.managerExhibit(sculpture);

         */

    }
}
