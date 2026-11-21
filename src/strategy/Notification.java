package strategy;

public abstract class Notification {
    public EncryptionStrategy encryptionStrategy;
    public CompressionStrategy compressionStrategy;

    public Notification(EncryptionStrategy encryptionStrategy, CompressionStrategy compressionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
        this.compressionStrategy = compressionStrategy;
    }

    public abstract void send();

    public void encrypt() {
        encryptionStrategy.encrypt();
    }

    public void compress() {
        compressionStrategy.compress();
    }
}
