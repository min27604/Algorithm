package LeetCode;

public class Bit_Characters {
    public boolean isOneBitCharacter(int[] bits) {
        int counter = 0;
        // for (int i = 0; i < bits.length - 2; i++) {
        //     if (bits[i] == 0) {
        //         counter++;
        //     } else {
        //         counter += 2;
        //     }
        // }

        while (counter < bits.length - 1) {
            if (bits[counter] == 0) {
                counter++;
            } else {
                counter += 2;
            }
        }

        return counter == bits.length - 1;
    }
}
