package Algorithm_day01;

import java.util.*;

public class RankTransform {

    public int[] arrayRankTransform(int[] arr) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int num : arr) {
            linkedList.add(num);
        }

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        int[] result = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            result[i] = rankMap.get(linkedList.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        RankTransform rt = new RankTransform();

        int[] arr1 = {40, 10, 20, 30};
        System.out.println(Arrays.toString(rt.arrayRankTransform(arr1)));

        int[] arr2 = {100, 100, 100};
        System.out.println(Arrays.toString(rt.arrayRankTransform(arr2)));

        int[] arr3 = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(rt.arrayRankTransform(arr3)));
    }
}
