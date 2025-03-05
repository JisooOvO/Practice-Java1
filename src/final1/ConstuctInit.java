package final1;

public class ConstuctInit {
    // final이 필드에 붙고 초기화가 안 되었을 때 생성자에서 할당 가능
    final int value;

    // static final - 상수
    static final int CONST_VALUE = 10;

    // final
    final int finalValue = 10;

    public ConstuctInit(int value) {
        this.value = value;
    }
}
