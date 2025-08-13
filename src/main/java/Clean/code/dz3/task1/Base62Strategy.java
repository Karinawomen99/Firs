package Clean.code.dz3.task1;

import java.util.concurrent.atomic.AtomicLong;

public class Base62Strategy implements ShorteningStrategy {
    private static final String CHART_SET="0126386384uhfewouthewofjn3";
    private static final int BASE = CHART_SET.length();
    private final AtomicLong counter = new AtomicLong(10000);

    @Override
    public String shorten (String originalUrl){
        long id = counter.getAndIncrement();
        StringBuilder shortUrl = new StringBuilder();
        while (id>0){
            shortUrl.insert(0,CHART_SET.charAt((int)(id % BASE)));
            id/=BASE;
        }
        return shortUrl.toString();
    }
}
