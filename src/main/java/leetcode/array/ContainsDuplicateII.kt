package leetcode.array

import java.util.HashMap

class ContainsDuplicateII {
    fun containsDuplicate(nums: IntArray, k: Int): Boolean {
        val map = HashMap<Int, Int>()

        for (i in 0 until nums.size) {
            if (map.containsKey(nums[i]) && i - map.getValue(nums[i]) <= k) {
                return true
            }
            map[nums[i]] = i
        }

        return false
    }
}