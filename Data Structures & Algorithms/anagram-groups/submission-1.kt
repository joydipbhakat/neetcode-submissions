class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val result = mutableMapOf<String, ArrayList<String>>()
        for(i in 0 until strs.size)
        {
            val sortedString = strs[i].toCharArray().sorted().joinToString("")
            if(result.contains(sortedString))
            {
                result[sortedString]!!.add(strs[i])
            }
            else
            {
               result[sortedString] = arrayListOf(strs[i]) 
            }
        }
        return result.map{it.value}.toList()


    }
}
