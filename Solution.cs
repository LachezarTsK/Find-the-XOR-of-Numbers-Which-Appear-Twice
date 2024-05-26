
using System;

public class Solution
{
    static readonly int[] RANGE_OF_VALUES = { 1, 50 };

    public int DuplicateNumbersXOR(int[] input)
    {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        int xorDuplicates = 0;

        foreach (int value in input)
        {
            if (++frequency[value] == 2)
            {
                xorDuplicates ^= value;
            }
        }
        return xorDuplicates;
    }
}
