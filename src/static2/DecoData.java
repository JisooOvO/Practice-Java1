package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // 인스턴스 변수 / 메서드 접근 X
    public static void staticCall(){
        staticValue++;
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();;
    }

    private void instanceMethod(){
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = " + staticValue);
    }
}
