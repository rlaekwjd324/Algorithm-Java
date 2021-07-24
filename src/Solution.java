class Solution {
    public int solution(int n) {
        String reverse3Scale = change3Scale(n).reverse().toString();
        return (int) change10Scale(String.valueOf(Long.parseLong(reverse3Scale)));
    }

    //    10진법 -> 3진법으로 바꾸기
    private StringBuilder change3Scale(long number) {
        StringBuilder number3Scale = new StringBuilder();
        while (number > 0) {
            number3Scale.insert(0, (number % 3));
            number /= 3;
        }
        return number3Scale;
    }

    //    3진법 -> 10진법으로 바꾸기
    private long change10Scale(String number) {
        long number10Scale = 0;
        while (number != null && number.length() > 0) {
            number10Scale += (number.charAt(0) - '0') * Math.pow(3, number.length() - 1);
            number = number.substring(1);
        }
        return number10Scale;
    }
}