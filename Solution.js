
/**
 * @param {number[]} input
 * @return {number}
 */
var duplicateNumbersXOR = function (input) {
    const RANGE_OF_VALUES = [1, 50];
    const frequency = new Array(RANGE_OF_VALUES[1] + 1).fill(0);
    let xorDuplicates = 0;

    for (let value of input) {
        if (++frequency[value] === 2) {
            xorDuplicates ^= value;
        }
    }
    return xorDuplicates;
};
