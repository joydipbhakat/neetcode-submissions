class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val left = IntArray(nums.size){1}
        val right = IntArray(nums.size){1}
        val product = IntArray(nums.size){1}
        for(i in 0 until nums.size)
        {
            if(i<1)
            {
                left[i]=1
            }
            else
            {
                left[i]=left[i-1]*nums[i-1]
            }
        }
        for(i in nums.size-1 downTo 0)
        {
            if(i>=nums.size-1)
            {
                right[i]=1
            }
            else
            {
                right[i]=right[i+1]*nums[i+1]
            }
        }
        for(i in 0 until nums.size)
        {
            product[i]=left[i]*right[i]
        }

        return product
        


    }
}
