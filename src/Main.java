import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static class Position {
        int index, value;

        Position(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());
            Queue<Position> queue = new LinkedList<>();
            int[] array = new int[N];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                queue.add(new Position(j, num));
                array[j] = num;
            }
            int index = 1;
            Arrays.sort(array);
            while (!queue.isEmpty()) {
                Position num = queue.poll();
                if (num.value == array[N - 1]) {
                    array[N - 1] = 0;
                    Arrays.sort(array);
                    if (num.index == M) {
                        stringBuilder.append(index).append("\n");
                        break;
                    }
                    index++;
                }
                queue.add(num);
            }
        }
        System.out.print(stringBuilder);
    }
}
