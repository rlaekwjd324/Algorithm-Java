public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            boolean isFlag = false;
            for (int j = i; j >= 1; j--) {
                if (isSelfNum(i, j)) {
                    isFlag = true;
                    break;
                }
            }
            if(!isFlag){
                System.out.println(i);
            }
        }
    }

    public static boolean isSelfNum(int num, int selfNum) {
        int sum = selfNum;
        while (selfNum != 0) {
            sum += (selfNum % 10);
            selfNum = selfNum / 10;
        }
        return sum == num;
    }
}
