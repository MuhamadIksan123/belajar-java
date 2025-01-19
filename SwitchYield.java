public class SwitchYield {
    public static void main(String[] Args) {
        String nilai = "A";
        String ucapan = switch (nilai) {
            case "A": {
                yield "Wow Anda Lulus Dengan Baik";
            }
            case "B", "C": {
                yield "Wow Anda Lulus Dengan Baik";
            }
            case "D": {
                yield "Wow Anda Lulus Dengan Baik";
            }
            default: {
                yield "Wow Anda Gagal";
            }
        };

        System.out.println(ucapan);
    }
}
