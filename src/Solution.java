import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution {
    public static int[] solution(int[] fees, String[] records) {
        ArrayList<String> carList = new ArrayList<>();
        HashMap<String, ArrayList<Parking>> recordMap = new HashMap<>();
        for (int i = 0; i < records.length; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(records[i]);
            String time = stringTokenizer.nextToken();
            String carNumber = stringTokenizer.nextToken();
            String status = stringTokenizer.nextToken();
            if (status.equals("IN")) {
                ArrayList<Parking> arrayList = new ArrayList<>();
                if (recordMap.containsKey(carNumber)) {
                    arrayList = recordMap.get(carNumber);
                } else {
                    carList.add(carNumber);
                }
                arrayList.add(new Parking(time, "23:59"));
                recordMap.put(carNumber, arrayList);
            } else {
                for (int j = 0; j < recordMap.get(carNumber).size(); j++) {
                    Parking parking = recordMap.get(carNumber).get(j);
                    if (parking.outTime.equals("23:59")) {
                        parking.outTime = time;
                        recordMap.get(carNumber).set(j, parking);
                        break;
                    }
                }

            }
        }
        Collections.sort(carList);
        int[] answer = new int[carList.size()];
        for (int i = 0; i < carList.size(); i++) {
            int sumMinute = 0;
            for (int j = 0; j < recordMap.get(carList.get(i)).size(); j++) {
                Parking parking = recordMap.get(carList.get(i)).get(j);
                int inTimeHour = Integer.parseInt(parking.inTime.split(":")[0]);
                int inTimeMinute = Integer.parseInt(parking.inTime.split(":")[1]);
                int outTimeHour = Integer.parseInt(parking.outTime.split(":")[0]);
                int outTimeMinute = Integer.parseInt(parking.outTime.split(":")[1]);
                int divMinute = outTimeMinute - inTimeMinute;
                if (divMinute < 0) {
                    outTimeHour -= 1;
                    divMinute += 60;
                }
                sumMinute = sumMinute + divMinute + (outTimeHour - inTimeHour) * 60;
            }
            answer[i] += fees[1];
            if (sumMinute >= fees[0]) {
                sumMinute -= fees[0];
                int modPay = sumMinute / fees[2];
                if (sumMinute % fees[2] != 0) {
                    modPay++;
                }
                answer[i] = answer[i] + modPay * fees[3];
            }
        }
        return answer;
    }

    private static class Parking {
        String inTime, outTime;

        Parking(String inTime, String outTime) {
            this.inTime = inTime;
            this.outTime = outTime;
        }

    }
}
