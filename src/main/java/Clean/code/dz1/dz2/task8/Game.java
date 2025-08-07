package Clean.code.dz1.dz2.task8;

public class Game {
    public static void main(String[] args) {
        Character warrior = new Character.CharacterBuilder()
                .setHaealth(150)
                .setMagic(10)
                .setDamoge(40)
                .setArmor(90)
                .build();
        System.out.println(warrior);
    }
}
