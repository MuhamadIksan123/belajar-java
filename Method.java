public class Method {
    public static void main(String[] Args) {
        sayHelloWorld();
        sayHello("Eko", "Kurniawan");

        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);
    }

    static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    static void sayHello(String firstname, String lastname){
        System.out.println("Hello " + firstname + " " + lastname);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
}
