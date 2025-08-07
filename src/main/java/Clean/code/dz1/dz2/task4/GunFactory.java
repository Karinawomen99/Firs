package Clean.code.dz1.dz2.task4;

public class GunFactory extends WeaponFactory {
    @Override
    public Weapon creatWeapon() {
        return new Gun();
    }
}