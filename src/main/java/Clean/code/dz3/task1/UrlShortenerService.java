package Clean.code.dz3.task1;

public class UrlShortenerService {
    private static UrlShortenerService instance;

    private final UrlStorage storage;
    private final ShorteningStrategy strategy;

    private UrlShortenerService(ShorteningStrategy strategy, UrlStorage storage){
        this.strategy = strategy;
        this.storage = storage;
    }
    public static UrlShortenerService getInstance(ShorteningStrategy strategy, UrlStorage storage) {
        if (instance == null) {
            instance = new UrlShortenerService(strategy,storage);
        }
        return instance;
    }

    public String shortUrl(String longUrl) {
        if (((InMemoryUrlStorage) storage).containsLongUrl(longUrl)) {
            return ((InMemoryUrlStorage) storage).getShortByLong(longUrl);
        }
        String shortUrl = strategy.shorten(longUrl);
        storage.store(shortUrl, longUrl);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return storage.retrieve(shortUrl);
    }
}
