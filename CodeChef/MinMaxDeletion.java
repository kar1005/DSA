//Problem:https://www.codechef.com/START190D/problems/MNMXDEL
//Explanation:https://chatgpt.com/share/68499e21-cb38-8013-a598-959689b204dc
import java.util.*;

public class MinMaxDeletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        while (T-- > 0) {
            int N = sc.nextInt(); // size of array
            int Q = sc.nextInt(); // number of updates
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            // Precompute initial min sum
            long score = 0;
            for (int i = 0; i < N - 1; i++) {
                score += Math.min(A[i], A[i + 1]);
            }

            for (int q = 0; q < Q; q++) {
                int i = sc.nextInt() - 1; // converting to 0-based index
                int X = sc.nextInt();

                // Subtract old contributions
                if (i > 0) score -= Math.min(A[i - 1], A[i]);
                if (i < N - 1) score -= Math.min(A[i], A[i + 1]);

                A[i] = X;

                // Add new contributions
                if (i > 0) score += Math.min(A[i - 1], A[i]);
                if (i < N - 1) score += Math.min(A[i], A[i + 1]);

                System.out.println(score);
            }
        }
        sc.close();
    }
}
