public class Primitif {
    public static void main(String[] Args) {
        // Tipe Data Bukan Primitif
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;

        Short iniShort; 
        iniShort = 100;

        // Konversi Dari Tipe Primitif
        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
}
