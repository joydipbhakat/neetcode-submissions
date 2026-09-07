class Solution {
    fun isAnagram(s: String, t: String): Boolean {
      if(s.length != t.length)
         return false
      val resultantList = t.toMutableList()
      for(i in s)
      {
        if(i in resultantList)
        {
            resultantList.remove(i)
        }
        
      }
    if(resultantList.size == 0)
        return true 
    return false    
    }
}
