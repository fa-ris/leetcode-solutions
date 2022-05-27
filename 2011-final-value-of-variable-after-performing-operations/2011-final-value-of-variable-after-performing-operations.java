class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int net = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                net++;
            } else {
                net--;
            }
        }
        return net;
    }
}