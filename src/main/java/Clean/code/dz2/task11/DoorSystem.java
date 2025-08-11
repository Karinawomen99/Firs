package Clean.code.dz2.task11;

public class DoorSystem {
    public static void main(String[] args) {
        DoorFacade facade = new DoorFacade();
        facade.openDoor();
        facade.closeDoor();
        facade.lockDoor();
    }
}
