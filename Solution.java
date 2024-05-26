
public class Solution {

    private static final int[] RANGE_OF_VALUES = {1, 50};

    public int duplicateNumbersXOR(int[] input) {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        int xorDuplicates = 0;
        
        for (int value : input) {
            if (++frequency[value] == 2) {
                xorDuplicates ^= value;
            }
        }
        return xorDuplicates;
    }
}
