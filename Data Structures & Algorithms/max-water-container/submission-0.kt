class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var area = 0
        var maxArea = 0
        while(left<right){
            val distance = right - left
            area = min(heights[left],heights[right])*distance
            if(area>maxArea)
               maxArea = area
            if(heights[left]<heights[right])
               left++
            else
               right--      
        }
     return maxArea
    }
}
