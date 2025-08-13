package Clean.code.dz2.task8;

public class Game {
    public static void main(String[] args) {
        Character warrior = new Character.CharacterBuilder()
                .setHealth(150)
                .setMagic(10)
                .setDamage(40)
                .setArmor(90)
                .build();
        System.out.println(warrior);
    }
}
