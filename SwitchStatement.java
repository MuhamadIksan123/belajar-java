public class SwitchStatement {
    public static void main(String[] Args) {
        String nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
                break;

            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;

            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
        
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
                break;
        }

        // Switch Lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");

            case "B", "C" -> System.out.println("Anda Lulus");

            case "D" -> System.out.println("Anda Tidak Lulus");
        
            default -> System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Switch Tanpa Yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";

            case "B", "C" -> ucapan = "Anda Lulus";

            case "D" -> ucapan = "Anda Tidak Lulus";
        
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }

        System.out.println(ucapan);

        // Switch Dengan yield
        String ucapanYield = switch (nilai) {
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
                yield "Wow Anda Lulus Dengan Baik";
            }
        };

        System.out.println(ucapanYield);
    }
}
