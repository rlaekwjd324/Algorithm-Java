class Solution {
    public int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            int divisorCount = findDivisor(i);
            if (divisorCount % 2 == 0) {
                sum += i;
                continue;
            }
            sum -= i;
        }

        return sum;
    }

    //    약수 찾아서 개수 보여주기
    private int findDivisor(int inputNumber) {
        int divisorCount = 0;
        for (int i = 1; i <= inputNumber; i++) {
            if (inputNumber % i == 0) {
                divisorCount++;
            }
        }
        return divisorCount;
    }
}