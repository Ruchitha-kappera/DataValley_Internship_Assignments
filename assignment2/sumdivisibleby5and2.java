
public class SumDivisibleBy5And2 {

    public static void main(String[] args) {
        int[] values = { 100, 52, 43, 99, 42, 40, 91 };
        int sum = 0;

        // as we need sum of the divisible by 5 and 2 we have to do the Iteration
        // through the array and add elements divisible by both 5 and 2 (Least Common
        // Multiple of 5 and 2)
        for (int num : values) {
            if (num % 10 == 0) { // Check divisibility by 10 (both 5 and 2 are least common multples of 5 and 2
                                 // as 5*2=10 ta da)
                sum += num;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
}
