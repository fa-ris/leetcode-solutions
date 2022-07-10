class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().replaceAll(" +", " ").strip().split(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i].replace(" ", "");
            arr[arr.length - 1 - i] = arr[arr.length - 1 - i].replace(" ", "");          
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = temp;
        }
        s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            s += " ";
        }
        return s.strip();
    }
}