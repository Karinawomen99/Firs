package Clean.code.dz3.task2;

public class VideoService {
    public VideoAdapter aviAdapter;
    public VideoAdapter movAdapter;
    public VideoAdapter wmvAdapter;
    public VideoStorage storage;

    public VideoService(VideoAdapter aviAdapter,VideoAdapter movAdapter,VideoAdapter wmvAdapter) {
        this.aviAdapter = aviAdapter;
        this.movAdapter = movAdapter;
        this.wmvAdapter = wmvAdapter;
        this.storage = new VideoStorage();
    }
    public MP4Video uploadVideo(String filePath){
        String extension = getFileExtension(filePath);
        MP4Video mp4Video;
        switch (extension){
            case "avi":
                mp4Video =aviAdapter.convertToMP4(filePath);
                break;
            case "mov":
                mp4Video =movAdapter.convertToMP4(filePath);
                break;
            case "wmv":
                mp4Video=wmvAdapter.convertToMP4(filePath);
                break;
            default:
                throw new IllegalArgumentException("Формат не поддерживается"+extension);
        }
        storage.save(mp4Video);
        return mp4Video;
    }
    public void streamVideo (String id){
        MP4Video video = storage.getById(id);
        if (video == null){
            System.out.println("Видео не найдено!");
            return;
        }
        System.out.println("Стриминг видео Mp4"+video.getFilePath());
    }
    private String getFileExtension(String filePath){
        return filePath.substring(filePath.lastIndexOf(".")+1).toLowerCase();
    }
}
