public class TipeDataNumber {
    public static void main(String[] Args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 100000;
        long iniLong2 = 1000000L;

        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        // Literals
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;

        // Underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        // Konversit Tipe Data Number
        // - Widening Casting (Otomatis): byte -> int -> long -> float -> double
        // - Narrowing Casting (Manual): double -> long -> int -> char -> short ->byte
        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong3 = iniInt2;
        float iniFloat2 = iniLong3;
        double iniDouble2 = iniFloat2;

        float iniFloat3 = (float) iniDouble;
        long iniLong4 = (long) iniFloat3;
        int iniInt3 = (int) iniLong4;
        short iniShort3 = (short) iniInt3;
    }
}
