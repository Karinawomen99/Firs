package dz3;

public class Main {
    public static void main (String []args){
        /*
        Company.companyName = " Teather ";
        Company emp1 = new Company(1,"Алла Юрьевна");
        Company emp2 = new Company( 2, " Иван Петрович");

        Company.printCompanyName();
        emp1.setCompanyName("Cамсонов Альберт");
        System.out.println("Сотрудник1:"+emp1.getEmployeeName());
        System.out.println("Сотрудник 2:"+ emp2.getEmployeeName());


         */
   /*
   double radius = 5.0;
   System.out.println("Площаль круга:"+ calcukateCircumference(radius));
   System.out.println("Длина окружности:"+ calculateCircunference(radius));
  */
  /*
  University.universityName = "КФУ";
  University student1 = new University( 1,"Кирилл Меньков");
  University student2 = new University( 2,"Кирилл Патриах");
  University.changeUniversityName("RUS");
  student1.printStudentInfo();
  student2.printStudentInfo();
 */
      /*
        GameSettings.setMaxPlayers(7);

        GameSettings game1 = new GameSettings("Покер",2);
        GameSettings game2 = new GameSettings("Шахматы",3);
        game1.addPlayer();
        game2.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

       */
   Person person1 = new Person("Кирилл", "Патриар", "123-45-6789");
   Person person2 = new Person("Самсон", "Авдеев", "233-45-6323");
   person1.setFirstName("Игорь");
   person1.setLastName("Голубушкин");
   person1.printPersonInfo();
   person2.printPersonInfo();
   }
    }

