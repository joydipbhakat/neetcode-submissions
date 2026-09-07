class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       val distinctNumbers = mutableSetOf<Int>()
       for(i in nums){
        if(i in distinctNumbers)
        {
            return true
        }
        distinctNumbers.add(i)
       }
       return false
    }
}
