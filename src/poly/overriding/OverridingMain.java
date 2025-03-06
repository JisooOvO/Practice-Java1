package poly.overriding;


public class OverridingMain {

    public static void main(String[] args) {
        // 자식 -> 자식
        System.out.println("Child -> Child");
        Child child = new Child();
        System.out.println("value = " + child.value);
        child.method();
        System.out.println();

        // 부모 -> 부모
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        System.out.println("value = " + parent.value);
        parent.method();
        System.out.println();

        // 부모 -> 자식
        // 오버라이딩 된 메서드는 항상 우선권을 가진다
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        System.out.println("value = " + poly.value); // 변수 오버라이딩 X
        poly.method(); // 메서드 오버라이딩 O

    }

}
