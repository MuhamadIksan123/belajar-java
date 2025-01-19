public class OperatorTernary {
    public static void main(String[] Args) {
        var nilai = 75;
        String ucapan;

        // Tanpa Ternary Operator
        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }

        // Dengan Ternary Operator
        if(nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }

        System.out.println(ucapan);
    }
}
