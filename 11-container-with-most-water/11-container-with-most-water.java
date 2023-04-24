class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return -1;
        }
        int left = 0, right = height.length-1;
        int area = (right-left) * Math.min(height[left],height[right]);
        
        while (left < right) {
            int localArea = (right-left) * Math.min(height[left],height[right]);
            if (area < localArea) {
                area = localArea;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}