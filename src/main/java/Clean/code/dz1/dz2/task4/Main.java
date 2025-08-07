package Clean.code.dz1.dz2.task4;

public class Main {
    public static void main(String[] args) {


        WeaponFactory swordFactory = new SwordFactory();
        Weapon sword = swordFactory.creatWeapon();
        sword.attack(); // Меч наносит мощный удар!

        WeaponFactory bowFactory = new BowFactory();
        Weapon bow = bowFactory.creatWeapon();
        bow.attack(); // Лук выпускает стрелу!


        WeaponFactory gunFactory = new GunFactory();
        Weapon gun = gunFactory.creatWeapon();
        gun.attack(); // Пистолет стреляет пулей!
    }
}
