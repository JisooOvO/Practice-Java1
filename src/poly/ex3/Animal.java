package poly.ex3;

// 추상 클래스는 인스턴스 생성 불가
public abstract class Animal {

    // 추상 메서드는 추상클래스에서만 생성 가능
    // 자식 클래스가 반드시 오버라이딩
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
