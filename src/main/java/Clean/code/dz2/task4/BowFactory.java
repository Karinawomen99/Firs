package Clean.code.dz2.task4;

public class BowFactory extends WeaponFactory{
    @Override
    public Weapon creatWeapon(){
        return new Bow();
    }
}
