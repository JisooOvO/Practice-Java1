package class1;

public class ClassStart4 {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "김신";
        student1.age = 20;
        student1.grade = 100;

        Student student2 = new Student();
        student2.name = "백도찬";
        student2.age = 38;
        student2.grade = 94;

        Student[] students = {student1, student2};

        // iter
        for (Student student : students) {
            System.out.println(
                "이름 : " + student.name +
                " 나이 : " + student.age +
                " 성적 : " + student.grade
            );
        }
        
    }

}
