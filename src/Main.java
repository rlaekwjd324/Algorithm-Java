public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1000; i < 10000; i++) {
            int sum = getDigitSum(10, i);
            if (sum == getDigitSum(12, i) && sum == getDigitSum(16, i)) {
                stringBuilder.append(i).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    private static int getDigitSum(int digit, int num) {
        int n = 0;
        int n2 = 0;
        int sum = 0;
        int min = digit - 1;
        while (min < num) {
            n = (num / digit);
            n2 = (num % digit);
            num = n;
            sum += n2;
        }
        return sum + n;
    }
}
