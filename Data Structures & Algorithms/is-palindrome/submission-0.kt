class Solution {
    fun isPalindrome(s: String): Boolean {
        val filteredString = s.filter{it.isLetterOrDigit()}.lowercase()
        var left = 0 
        var right = filteredString.length -1
        println(filteredString)
        while(left<right){
            if(filteredString[left]==filteredString[right])
            {
                left++
                right--
            }
            else
            {
                return false
            }
        }
        return true
        
    }
}
