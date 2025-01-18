public class Array {
    public static void main(String[] Args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Eko";
        arrayString[1] = "Kurniawan";
        arrayString[2] = "Khannedy";

        int[] arrayInt = new int[] {
            10, 90, 88, 67, 29
        };

        long[] arrayLong = {
            10L, 98L, 88L, 67L, 29L
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        String[][] members = {
            {"Eko", "Kurniawan", "Khannedy"},
            {"Budi", "Nugraha"},
            {"Joko", "Morro"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
