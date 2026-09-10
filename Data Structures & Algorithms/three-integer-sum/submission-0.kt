class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val sortedNums = nums.sorted()
        for(i in 0 until sortedNums.size-2)
        {
          var left = i+1
          var right = sortedNums.size - 1
          while(left<right)
          {
            val totalSum = sortedNums[i] + sortedNums[left]+sortedNums[right]
            when {
                totalSum == 0 -> {   
                    val list = mutableListOf(sortedNums[i],sortedNums[left],sortedNums[right])
                result.add(list)
                left++
                right--
                }
                totalSum > 0 -> {
                    right--
                }
                else -> {
                    left++
                }
            }
          }
        }
        return result.distinct()

    }
}
