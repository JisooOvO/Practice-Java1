package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data();
        System.out.println("data.value = " + data.value);

        data.value = 10;
        System.out.println("data.value = " + data.value);
    }
}
