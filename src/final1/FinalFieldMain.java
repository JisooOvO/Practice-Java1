package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 생성자 초기화
        System.out.println("생성자 초기화");
        ConstuctInit constuctInit1 = new ConstuctInit(10);
        // constuctInit1.value = 20;
        System.out.println(constuctInit1.value);

        // final 필드 초기화
        // 바꿀 수 없는 값이지만 인스턴스를 통해 지속적으로 생성
        // 메모리 낭비를 유발하므로 상수로 사용하는 것을 추천
        System.out.println("필드 초기화");
        ConstuctInit constuctInit2 = new ConstuctInit(20);
        System.out.println(constuctInit2.value);

        // 상수
        System.out.println("상수");
        System.out.println(ConstuctInit.CONST_VALUE);
    }
}
