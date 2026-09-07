class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val resultSet = mutableMapOf<Int, Int>()
        for(i in nums)
        {
            if(resultSet.contains(i))
            {
                resultSet[i] = resultSet[i]!!+1
            }
            else
            {
                resultSet[i] = 1
            }
        }
        println(resultSet)
        return resultSet.entries.sortedByDescending{it.value}.take(k).map{it.key}.toIntArray()

    }
}
