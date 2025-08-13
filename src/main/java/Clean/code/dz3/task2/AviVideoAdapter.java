package Clean.code.dz3.task2;

public class AviVideoAdapter implements VideoAdapter{
    @Override
    public MP4Video convertToMP4(String filePath){
        System.out.println("Конвертация AVI  в MP4"+ filePath);
        return new MP4Video(generateId(),filePath.replace("avi","mp4"));
    }
    private String generateId(){
        return "AVI"+System.currentTimeMillis();
    }
}
