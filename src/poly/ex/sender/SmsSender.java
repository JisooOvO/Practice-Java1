package poly.ex.sender;

public class SmsSender implements Sender {

    @Override
    public void sendMessage(String s) {
        System.out.println("문자를 발송합니다.");
    }
}
