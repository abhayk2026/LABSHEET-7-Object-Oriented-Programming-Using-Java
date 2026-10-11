package outside;
import demo.AccessExample;
public class OutsidePackageMain {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();
        System.out.println(example.publicText); // Public: accessible everywhere.
        // System.out.println(example.protectedText); // Not accessible here: not a subclass.
        // System.out.println(example.defaultText);   // Not accessible outside package demo.
        // System.out.println(example.privateText);   // Private: only AccessExample can access it.
        System.out.println(example.getPrivateText()); // Public getter provides controlled access.
    }
}
