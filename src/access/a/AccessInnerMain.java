package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();

        // public
        accessData.publicField = 1;
        accessData.publicMethod();

        // default
        accessData.defaultField = 2;
        accessData.defaultMethod();;

        // private
        // accessData.privateMethod();

        accessData.innerAccess();
    }
}
