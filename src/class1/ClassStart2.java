package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        // 반복적인 코드는 제거했으나 삽입, 삭제 등 데이터 조작에 불리
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentsAges = {15, 16, 17, 20};
        int[] studentGrades = {90, 80, 70, 60};

        for(int i=0; i < studentNames.length ; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentsAges[i] + " 성적 : " + studentGrades[i]);
        }
    }

}
