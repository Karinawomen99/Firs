package Clean.code.dz3.task1;

public interface UrlStorage {
    void store(String shortUrl,String longUrl);
    String retrieve(String shortUrl);
}
