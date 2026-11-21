package strategy;

public class Main {
    static void main() {
        Notification email = new Email(new AESEncryption(), new ZIP());
        email.send();
        email.encrypt();
        email.compress();

        Notification push = new Push(new RSAEncryption(), new GZIP());
        push.send();
        push.encrypt();
        push.compress();

        Notification sms = new Sms(new RSAEncryption(), new GZIP());
        sms.send();
        sms.encrypt();
        sms.compress();
    }

}
