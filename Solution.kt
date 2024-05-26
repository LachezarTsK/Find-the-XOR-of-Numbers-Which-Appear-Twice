
class Solution {

    private companion object {
        val RANGE_OF_VALUES = intArrayOf(1, 50)
    }

    fun duplicateNumbersXOR(input: IntArray): Int {
        val frequency = IntArray(RANGE_OF_VALUES[1] + 1)
        var xorDuplicates = 0
        
        for (value in input) {
            if (++frequency[value] == 2) {
                xorDuplicates = xorDuplicates xor value
            }
        }
        return xorDuplicates
    }
}
