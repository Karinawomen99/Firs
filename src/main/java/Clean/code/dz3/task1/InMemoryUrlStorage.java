package Clean.code.dz3.task1;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage {
    private final Map<String, String> shortToLong = new HashMap<>();
    private final Map<String, String> longToShort = new HashMap<>();

     @Override
     public void store(String shortUrl,String longUrl){
         shortToLong.put(shortUrl,longUrl);
         longToShort.put(longUrl,shortUrl);
     }
     @Override
    public String retrieve(String shortUrl){
         return shortToLong.get(shortUrl);
     }
     public boolean containsLongUrl(String longUrl){
         return longToShort.containsKey(longUrl);
     }
     public String getShortByLong(String longUrl){
         return longToShort.get(longUrl);
     }
}