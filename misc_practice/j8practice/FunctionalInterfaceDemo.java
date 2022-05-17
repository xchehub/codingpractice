@FunctionalInterface
public interface FunctionalInterfaceDemo {
    public void tes ();

    public default void defaultMethod () {
        System.out.println("Default Method");
    }

    public static void staticMethod () {
        System.out.println("Static Method");
    }
}