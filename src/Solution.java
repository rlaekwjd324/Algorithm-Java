public class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        String newN = "";
        while (n > 0) {
            newN = (n % k) + newN;
            n = n / k;
        }
        String[] numbers = newN.split("0");
        for (String number : numbers) {
            if (number.equals("") || number.equals("1")) {
                continue;
            }
            int divNumCount = 0;
            for (int j = 2; j <= Math.sqrt(Long.parseLong(number)); j++) {
                if (Long.parseLong(number) % j == 0) {
                    divNumCount++;
                }
            }
            if (divNumCount == 0) {
                answer++;
            }
        }
        return answer;
    }
}