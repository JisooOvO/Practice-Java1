package access.a;

// public / default 가능
// public 일 경우 파일명과 일치하며 1개만 존재
public class PublicClass {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}


// default - 같은 패키지에서만 사용 가능
class DefaultClass1 {}
class DefaultClass2 {}
