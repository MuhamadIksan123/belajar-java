public class BreakContinue {
    public static void main(String[] Args) {
        // var counter = 1;
        // while(true) {
        //     System.out.println("Perulangan ke-" + counter);

        //     counter++;

        //     if(counter > 10) {
        //         break;
        //     }
        // }

        
        for(int counter = 1; counter <= 100; counter++) {
            if(counter % 2 == 0) {
                continue;
            }

            System.out.println("Peruangan Ganjil-" + counter);
        }
    }
}
