package observer;

public class Main {

    static void main() {
        YoutubeSubscriber subscriber1 = new YoutubeSubscriber("Subhadip", 1);
        YoutubeSubscriber subscriber2 = new YoutubeSubscriber("Hash", 1);
        YoutubeSubscriber subscriber3 = new YoutubeSubscriber("Rahul", 1);
        YoutubeSubscriber subscriber4 = new YoutubeSubscriber("Abhishek", 1);
        YoutubeSubscriber subscriber5 = new YoutubeSubscriber("Rudra", 1);

        TheCuriousCoderChannel theCuriousCoderChannel = new TheCuriousCoderChannel();
        theCuriousCoderChannel.subscribe(subscriber1);
        theCuriousCoderChannel.subscribe(subscriber2);
        theCuriousCoderChannel.subscribe(subscriber3);
        theCuriousCoderChannel.subscribe(subscriber4);
        theCuriousCoderChannel.subscribe(subscriber5);

        theCuriousCoderChannel.uploadVideo("<Observer Pattern in Java>", "#observer_pattern.mp4");

    }
}
