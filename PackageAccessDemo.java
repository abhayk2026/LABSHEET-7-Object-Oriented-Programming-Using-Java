package testpack;
public class PackageAccessDemo {
    public static void main(String[] args) {
        new PublicThing().display();
        new HiddenThing().display(); // Works because this class is in the same package.
    }
}
