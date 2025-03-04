package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default class 패키지 다르면 접근 불가
        // DefaultClass1 defaultClass1 = new DefaultClass1();
    }
}
