import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] counts = new int[id_list.length];
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            hashMap.put(id_list[i], i);
        }
        ArrayList<String>[] arrayList = new ArrayList[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            arrayList[i] = new ArrayList<>();
        }
        for (int i = 0; i < report.length; i++) {
            String reporter = report[i].split(" ")[0];
            String reportee = report[i].split(" ")[1];
            if (!arrayList[hashMap.get(reportee)].contains(reporter)){
                counts[hashMap.get(reportee)]++;
                arrayList[hashMap.get(reportee)].add(reporter);
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            if (counts[i] >= k) {
                for (int j = 0; j < arrayList[i].size(); j++) {
                    answer[hashMap.get(arrayList[i].get(j))]++;
                }
            }
        }
        return answer;
    }
}