package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        // 실제 메모리에 만들어진 실체 - 객체, 인스턴스
        // new - 메모리에 인스턴스를 저장할 공간을 할당하고 참조 값을 반환
        // 참조 값을 저장해서 객체에 접근하여 사용할 수 있음
        // 접근 방법은 Dot(.)
        Student student1 = new Student();
        student1.name = "김신";
        student1.age = 20;
        student1.grade = 100;

        Student student2 = new Student();
        student2.name = "백도찬";
        student2.age = 38;
        student2.grade = 94;

        System.out.println("이름 : " + student1.name + " 나이 : "  + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 : " + student2.name + " 나이 : "  + student2.age + " 성적 : " + student2.grade);
    }

}
