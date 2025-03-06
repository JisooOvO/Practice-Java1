package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {
        //
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        // 다운캐스팅은 런타임 오류를 내장할 위험이 있다
        // ClassCastException
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        // child2.childMethod();
    }

}
