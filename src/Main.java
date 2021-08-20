import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.println(calAverage(array));
        System.out.println(calMiddleNum(array));
        System.out.println(calMaxCountsNum(array));
        System.out.print(calDivMaxMin(array));
    }

    private static int calAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        double average = (double) sum / array.length;
        return (int) Math.round(average);
    }

    private static int calMiddleNum(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }

    private static int calMaxCountsNum(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : array) {
            if (hashMap.containsKey(i)) {
                hashMap.replace(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(hashMap.entrySet());
        entryList.sort((o1, o2) -> o2.getValue() - o1.getValue());
        int max = entryList.get(0).getValue();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (entry.getValue() == max) {
                arrayList.add(entry.getKey());
            } else {
                break;
            }
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        Collections.sort(arrayList);
        return arrayList.get(1);
    }

    private static int calDivMaxMin(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }
}
