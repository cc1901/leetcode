package leetcode.array

class ContainsDuplicateIII {
    fun containsDuplicate(nums: IntArray, k: Int, t: Int): Boolean {
        val treeSet = sortedSetOf<Int>()

        for (i in 0 until nums.size) {
            val num = nums[i].toLong()
            val ceiling = treeSet.ceiling(nums[i])?.toLong()
            if (ceiling != null && ceiling - num <= t.toLong()) return true
            val floor = treeSet.floor(nums[i])?.toLong()
            if (floor != null && num - floor <= t.toLong()) return true
            treeSet.add(nums[i])
            if (treeSet.size > k) treeSet.remove(nums[i - k])
        }

        return false
    }
}