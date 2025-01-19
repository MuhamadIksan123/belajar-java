public class VariableArgumen {
    public static void main(String[] Args) {
        int[] values = {40, 80};

        var total = 0;
        for(var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Anda tidak lulus");
        }

        sayCongrats("Eko", 50, 60, 70, 80);
    }

    static void sayCongrats(String name, int... values) {
        int total = 0;
        for(var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 70) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}
