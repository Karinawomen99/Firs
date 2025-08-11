package Clean.code.dz2.task8;

public class Character {
    private int health;
    private int damage;
    private int armor;
    private int magic;

    public Character(int health, int damage, int armor, int magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "Персонаж[Здоровье:" + health + ",Урон:" + damage + "Броня:" + armor + "Магия:" + magic + "]";
    }

    public static class CharacterBuilder {
        private int health;
        private int damage;
        private int armor;
        private int magic;

        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setDamage(int damage) {
            this.damage = damage;
            return this;

        }

        public CharacterBuilder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setMagic(int magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(health, damage, armor, magic);
        }
    }
}