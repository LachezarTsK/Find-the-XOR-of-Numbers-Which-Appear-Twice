
package main

import "fmt"

func duplicateNumbersXOR(input []int) int {
	var RANGE_OF_VALUES = [2]int{1, 50}
	var frequency = make([]int, RANGE_OF_VALUES[1]+1)
	var xorDuplicates = 0

	for _, value := range input {
		frequency[value]++
		if frequency[value] == 2 {
			xorDuplicates ^= value
		}
	}
	return xorDuplicates
}
