package poly.ex5;

// 메서드 -> public abstract
// 필드 -> public static final
public interface InterfaceAnimal {

    void sound();
    void move();

    // 인터페이스는 다중 상속과 관련된 다이아몬드 문제가 발생하지 않음
    // 기능은 구현되지 않았기 때문에 - Override 메서드가 우선 실행
}
