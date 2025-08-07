package Clean.code.dz1.dz2.task11;

public class DoorFacade {
    private DoorOpen opener = new DoorOpen();
    private DoorClose closer = new DoorClose();
    private DoorLock locker = new DoorLock();

    public void openDoor() {
        opener.open();
    }
    public void closeDoor() {
        closer.close();
    }
    public void lockDoor() {
        locker.lock();
    }
}