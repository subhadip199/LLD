package strategy;

public class GZIP implements CompressionStrategy {
    @Override
    public void compress() {
        System.out.println("GZIP Compression");
    }
}
