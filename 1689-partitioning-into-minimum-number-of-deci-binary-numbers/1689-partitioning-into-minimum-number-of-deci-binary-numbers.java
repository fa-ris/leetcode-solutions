class Solution {
    public int minPartitions(String n) {
        if (n.contains(String.valueOf('9'))) {
            return 9;
        } else if (n.contains(String.valueOf('8'))) {
            return 8;
        } else if (n.contains(String.valueOf('7'))) {
            return 7;
        } else if (n.contains(String.valueOf('6'))) {
            return 6;
        } else if (n.contains(String.valueOf('5'))) {
            return 5;
        } else if (n.contains(String.valueOf('4'))) {
            return 4;
        } else if (n.contains(String.valueOf('3'))) {
            return 3;
        } else if (n.contains(String.valueOf('2'))) {
            return 2;
        } else if (n.contains(String.valueOf('1'))) {
            return 1;
        }
        return 0;
    }
}