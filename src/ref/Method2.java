package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1" , 15, 90);
        Student student2 = createStudent("학생2" , 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    /**
     * 학생 인스턴스를 만드는 메서드
     * @param name 이름
     * @param age 나이
     * @param grade 성적
     * @return 학생
     */
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    /**
     * 학생 정보 출력
     * @param student 학생
     */
    static void printStudent(Student student){
        System.out.println(
            "이름 : " + student.name +
            " 나이 : " + student.age +
            " 성적 : " + student.grade
        );
    }
}
