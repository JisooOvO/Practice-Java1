package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);

        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();

        // java 16에서 추가된 기능
        // 인스턴스 판정과 같이 변수 선언 가능
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스");
            child.childMethod();
        }

        System.out.println();
    }

}
