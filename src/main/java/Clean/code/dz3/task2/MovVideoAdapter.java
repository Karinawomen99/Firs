package Clean.code.dz3.task2;

public class MovVideoAdapter implements VideoAdapter {
    @Override
    public MP4Video convertToMP4(String filePath) {
        System.out.println("Конвертация MOV  в MP4" + filePath);
        return new MP4Video(generateId(), filePath.replace("mov", "mp4"));
    }

    private String generateId() {
        return "MOV" + System.currentTimeMillis();
    }
}
