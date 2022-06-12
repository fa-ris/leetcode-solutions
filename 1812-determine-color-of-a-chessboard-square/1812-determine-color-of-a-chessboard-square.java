class Solution {
    public boolean squareIsWhite(String coordinates) {
        switch (coordinates.charAt(0)) {
            case 'b':
            case 'd':
            case 'f':
            case 'h':
                if (Integer.valueOf(Character.toString(coordinates.charAt(1))) % 2 == 1) {
                    return true;
                }
                break;
            default:
                if (Integer.valueOf(Character.toString(coordinates.charAt(1))) % 2 == 0) {
                    return true;
                }
                break;
        }
        return false;
    }
}