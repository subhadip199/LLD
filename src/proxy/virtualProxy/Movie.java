package proxy.virtualProxy;

public class Movie implements Video {
    private String fileName;

    public Movie(String fileName) throws InterruptedException {
        this.fileName = fileName;
        loadVideo();
    }

    private void loadVideo() throws InterruptedException {
        System.out.println("Loading video from server....");
        Thread.sleep(4000);
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + fileName);
    }
}
