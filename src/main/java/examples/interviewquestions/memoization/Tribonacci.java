package examples.interviewquestions.memoization;

public class Tribonacci {
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int t0 = 0, t1 = 1, t2 = 1;
        int tn = 0;

        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }

        return tn;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println("The " + n + "-th Tribonacci number is: " + tribonacci(n));
    }
}
