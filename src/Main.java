import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int R, C, v, o, vCount, oCount;
    static char[][] nodeEdges;
    static boolean[][] checkNodes;
    static int[] moveX = {1, -1, 0, 0};
    static int[] moveY = {0, 0, 1, -1};
    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        R = Integer.parseInt(stringTokenizer.nextToken());
        C = Integer.parseInt(stringTokenizer.nextToken());
        nodeEdges = new char[R][C];
        checkNodes = new boolean[R][C];
        queue = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            String string = bufferedReader.readLine();
            for (int j = 0; j < C; j++) {
                nodeEdges[i][j] = string.charAt(j);
                if (nodeEdges[i][j] == 'v') {
                    v++;
                }
                if (nodeEdges[i][j] == 'o') {
                    o++;
                }
            }
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!checkNodes[i][j] && nodeEdges[i][j] != '#') {
                    queue.add(new Pair(i, j));
                    checkNodes[i][j] = true;
                    vCount = 0;
                    oCount = 0;
                    if (nodeEdges[i][j] == 'v') {
                        vCount++;
                    }
                    if (nodeEdges[i][j] == 'o') {
                        oCount++;
                    }
                    bfs();
                }
            }
        }
        System.out.print(o + " " + v);
    }

    private static void bfs() {
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = pair.x + moveX[i];
                int newY = pair.y + moveY[i];
                if (newX >= 0 && newY >= 0 && newX < R && newY < C) {
                    if (!checkNodes[newX][newY] && nodeEdges[newX][newY] != '#') {
                        queue.add(new Pair(newX, newY));
                        checkNodes[newX][newY] = true;
                        if (nodeEdges[newX][newY] == 'v') {
                            vCount++;
                        }
                        if (nodeEdges[newX][newY] == 'o') {
                            oCount++;
                        }
                    }
                }
            }
        }
        if (vCount < oCount) {
            v -= vCount;
        } else {
            o -= oCount;
        }
    }

    private static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
