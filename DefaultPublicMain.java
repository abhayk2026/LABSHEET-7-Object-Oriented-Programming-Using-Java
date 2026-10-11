import testpack.PublicThing;
public class DefaultPublicMain {
    public static void main(String[] args) {
        new PublicThing().display();
        // new testpack.HiddenThing(); // Compile error: HiddenThing is not public.
        System.out.println("A non-public top-level class cannot be accessed from another package.");
    }
}
