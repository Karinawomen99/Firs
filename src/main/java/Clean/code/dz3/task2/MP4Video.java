package Clean.code.dz3.task2;

public class MP4Video {
    private String id;
    private String filePath;

    public MP4Video(String id,String filePath) {
        this.id = id;
        this.filePath = filePath;
    }
    public String getId(){
        return id;
    }
    public String getFilePath(){
        return filePath;
    }
}
