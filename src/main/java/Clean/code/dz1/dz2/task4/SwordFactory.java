package Clean.code.dz1.dz2.task4;

public class SwordFactory extends WeaponFactory{
    @Override
    public Weapon creatWeapon(){
        return new Sword();
    }
}
