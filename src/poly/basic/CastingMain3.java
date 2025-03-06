package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        // 자식 -> 부모 (업캐스팅)
        Child child1 = new Child();
        Parent parent1 = (Parent)child1; // 생략
        Parent parent2 = child1;

        parent1.parentMethod();
        parent2.parentMethod();

        // 부모 -> 자식 (다운캐스팅)
        Child child2 = (Child) parent1; // 생략 불가
        child2.childMethod();
    }
}
