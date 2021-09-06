import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int H, W, cheeseCount, prevCheeseCount, time;
    static int[][] array;
    static boolean[][] check;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static Queue<Cheese> queue = new LinkedList<>();

    private static class Cheese {
        int x, y;

        Cheese(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        H = Integer.parseInt(stringTokenizer.nextToken());
        W = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[H][W];
        check = new boolean[H][W];
        for (int i = 0; i < H; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < W; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                if (array[i][j] == 1) {
                    prevCheeseCount++;
                }
            }
        }
        cheeseCount = prevCheeseCount;
        while (prevCheeseCount != 0) {
            check[0][0] = true;
            time++;
            queue.add(new Cheese(0, 0));
            check = new boolean[H][W];
            cheeseCount = prevCheeseCount;
            bfs();
        }
        System.out.println(time);
        System.out.println(cheeseCount);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Cheese cheese = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = cheese.x + moveX[i];
                int newY = cheese.y + moveY[i];
                if (newX >= 0 && newY >= 0 && newX < H && newY < W) {
                    if (!check[newX][newY]) {
                        check[newX][newY] = true;
                        if (array[newX][newY] == 1) {
                            prevCheeseCount--;
                            array[newX][newY] = 0;
                        } else {
                            queue.add(new Cheese(newX, newY));
                        }
                    }
                }
            }
        }
    }
}
