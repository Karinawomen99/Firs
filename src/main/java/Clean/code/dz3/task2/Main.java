package Clean.code.dz3.task2;

public class Main {
    public static void main(String[] args) {
        VideoService videoService = new VideoService(
                new AviVideoAdapter(),
                new MovVideoAdapter(),
                new WmvVideoAdapter()
        );
        MP4Video video1 = videoService.uploadVideo("example.avi");
        System.out.println("Загружено видео с ID"+video1.getId());

        videoService.streamVideo(video1.getId());

        MP4Video video2 = videoService.uploadVideo("movie.mov");
        System.out.println("Загружено видео с ID"+video2.getId());

        videoService.streamVideo(video2.getId());
    }
}
