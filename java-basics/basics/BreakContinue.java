public class BreakContinue {
    public static void main(String[] args) {
        // break - breaks out of loop (STOP)
        // continue - skips the current iteration of loop (SKIP)

        for (int i = 0; i < 10; i++) {

            if (i == 0) {
                continue; // skips 0 iteration
            }

            if (i == 5) {
                break; // breaks at 5
            }

            System.out.print(i + " ");
        }
    }
}
