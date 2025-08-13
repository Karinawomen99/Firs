package Clean.code.dz3.task1;

public class Main {
    public static void main(String[] args) {
        ShortenerFactory factory = new ShortenerFactory(new Base62Strategy());
        UrlShortenerService shortenerService =UrlShortenerService.getInstance(
                factory.createStratege(),new InMemoryUrlStorage());

        String originalUrl = "https://exam/com/dore/move/data";
        String shortUrl = shortenerService.shortUrl(originalUrl);
        System.out.println("Short URL:"+shortUrl);

        String expendedUrl = shortenerService.expandUrl(shortUrl);
        System.out.println("Original URL:"+expendedUrl);
    }
}
