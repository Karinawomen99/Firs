package dz6.zadach8;

public class Manuscript extends Exhibit {
    public Manuscript(String name) {
        super(name);
    }

    @Override
    public void preserve() {
        System.out.println(getName()+" требует контролируемой влажности и температуры.");

    }

    @Override
    public void provideInfo() {
        System.out.println(getName() +"- это древний манускрипт.");

    }
}
