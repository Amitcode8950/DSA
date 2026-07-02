import java.util.HashMap;

public class minmaxmodeinarray {
    static void minmax(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        int maxvalue = -1;
        int maxkey = -1;
        for (int i : freq.keySet()) {
            if (freq.get(i) > maxvalue) {
                maxvalue = freq.get(i);
                maxkey = i;
            }
        }
        int minvalue = -1;
        int minkey = -1;
        for (int i : freq.keySet()) {
            if (freq.get(i) < minvalue || minvalue == -1) {
                minvalue = freq.get(i);
                minkey = i;
            }
        }
        System.out.println("Minimum: " + minkey + " Frequency: " + minvalue);
        System.out.println("Maximum: " + maxkey + " Frequency: " + maxvalue);
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,1,2,2,2,2,2,2,3,4,4,4,5,6,7,8,9,10,1,1};
        minmax(arr);

    }
}
