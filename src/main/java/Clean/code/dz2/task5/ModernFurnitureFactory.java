package Clean.code.dz2.task5;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    @Override
    public Table createTable() {
        return new ModernTable();
    }
}