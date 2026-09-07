class Solution {
    fun isAnagram(s: String, t: String): Boolean {
      if(s.length != t.length)
         return false
      val resultantList1 = MutableList(26){0}
      val resultantList2 = MutableList(26){0}
      for(i in 0 until s.length)
      {
        resultantList1[s[i]-'a']++
        resultantList2[t[i]-'a']++
        
      }
    if(resultantList1 == resultantList2 )
        return true 
    return false    
    }
}
