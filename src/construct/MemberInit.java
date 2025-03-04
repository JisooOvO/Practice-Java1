package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    public MemberInit() {
    }

    public MemberInit(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        printMember();
    }

    public void printMember(){
        System.out.println(
                "이름 : " + this.name +
                " 나이 : " + this.age +
                " 성적 : " + this.grade
        );
    }
}
