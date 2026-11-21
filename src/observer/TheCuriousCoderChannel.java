package observer;

import java.util.ArrayList;
import java.util.List;

public class TheCuriousCoderChannel {
    private String videoTitle;
    private String videoFileName;

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoFileName() {
        return videoFileName;
    }

    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void uploadVideo(String videoTitle, String videoFileName) {
        this.videoTitle = videoTitle;
        this.videoFileName = videoFileName;
        System.out.println("New Video Uploaded");
        notifySubscribers();

    }
}
