package leetcode.array


class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numsSet = nums.toSet()
        return nums.size != numsSet.size
    }
}