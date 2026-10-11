package testpack;
public class PublicThing {
    public void display() { System.out.println("PublicThing is accessible outside testpack."); }
}
class HiddenThing { // Package-private: only code in testpack can use this class.
    void display() { System.out.println("HiddenThing is package-private."); }
}
