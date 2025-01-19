public class MethodOverloading {
    public static void main(String[] Args) {
        sayHello();
        sayHello("Iksan");
        sayHello("Muhamad", "Iksan");
    }

    static void sayHello() {
        System.out.println("Halo");
    }

    static void sayHello(String name) {
        System.out.println("Halo " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Halo " + firstName + " " + lastName);
    }
}
