import animals.Dog;
public class ImportDogMain {
    public static void main(String[] args) {
        Dog importedDog = new Dog(); // Form (a): simple name after import.
        importedDog.bark();
        animals.Dog qualifiedDog = new animals.Dog(); // Form (b): fully qualified name.
        qualifiedDog.bark();
    }
}
