
#include <array>
#include <vector>
using namespace std;

class Solution {

    static constexpr array<int, 2> RANGE_OF_VALUES = { 1,50 };

public:
    int duplicateNumbersXOR(const vector<int>& input) const {
        array<int, RANGE_OF_VALUES[1] + 1> frequency{};
        int xorDuplicates = 0;

        for (const auto& value : input) {
            if (++frequency[value] == 2) {
                xorDuplicates ^= value;
            }
        }
        return xorDuplicates;
    }
};
