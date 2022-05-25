class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            list1.add(arr1[i]);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
        }
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < arr3.length; i++) {
            list3.add(arr3[i]);
        }
        list2.retainAll(list3);
        list1.retainAll(list2);
        return list1;
    }
}