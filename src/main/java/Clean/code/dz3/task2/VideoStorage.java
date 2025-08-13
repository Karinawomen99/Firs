package Clean.code.dz3.task2;

import java.util.HashMap;
import java.util.Map;

public class VideoStorage {
    private Map<String, MP4Video> storage = new HashMap<>();

    public void save(MP4Video video) {
        storage.put(video.getId(), video);
    }

    public MP4Video getById(String id) {
        return storage.get(id);
    }
}
