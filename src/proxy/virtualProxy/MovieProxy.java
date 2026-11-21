package proxy.virtualProxy;

public class MovieProxy implements Video {
    private String filename;
    private Video video;

    public MovieProxy(String filename) {
        System.out.println("Proxy Object created");
        this.filename = filename;
    }

    public void play() throws InterruptedException {
        if (video == null) {
            video = new Movie(filename);
        }
        video.play();
    }
}
