class Solution {
    fun longestConsecutive(nums: IntArray): Int {
      val set = mutableSetOf<Int>()
      for(i in nums)
      {
        if(i in set)
           continue
        else
        {
            set.add(i)
        }
      }
      val sortedString = set.sorted()
      var count = 1
      var maxCount = 1

      if(nums.size == 0)
        return 0

      else if(nums.size == 1)
        return 1  
      for(i in 0 until sortedString.size-1){
        if(sortedString[i]+1==sortedString[i+1])
        {
            count = count + 1
             if(count > maxCount)
            {
                maxCount = count
            } 
            
        }
        else{
            count = 1
        }
    
      }
      return maxCount
    }
}
