package dz6.zadach7;

public class RollerCoaster extends Attraction {
    public RollerCoaster(String name) {
        super(name);
    }

    @Override
    public void maintain() {
        System.out.println(getName()+" требует регулярной проверки безопасности.");

    }

    @Override
    public void proivedInfo() {
        System.out.println(getName()+" - это экстремальный аттракцион");

    }
}
