package poly.car1;


// OCP (Open-Closed Principle)
// 확장에 열려있음 -> 인터페이스를 통해 신규 기능을 자유롭게 추가 가능
// 코드 수정은 닫혀있음 -> 클라이언트(Driver)의 코드를 수정하지 않는다
public interface Car {

    void startEngine();
    void pressAccelerator();
    void offEngine();

}
