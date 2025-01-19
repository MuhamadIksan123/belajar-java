public class LoopForEach {
    public static void main(String[] Args) {
        String[] array = {
            "Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"
        };

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(var value : array) {
            System.out.println(value);
        }
    }
}
