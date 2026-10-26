class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
       var left = 0
       var right = numbers.size - 1
       var result = IntArray(2)
       while(left<right)
       {
         val sum = numbers[left]+numbers[right]
         when {
            sum == target -> {
                result[0]=left+1
                result[1]=right+1
                return result
            }
            sum > target -> right --
            else -> left++
         }
       }
       return result
    }
}
