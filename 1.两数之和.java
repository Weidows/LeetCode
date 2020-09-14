/*
 * @Author: Weidows
 * @Date: 2020-09-14 15:28:49
 * @LastEditors: Weidows
 * @LastEditTime: 2020-09-14 16:32:52
 * @FilePath: \Weidowsd:\Game\Demo\LeetCode\1.两数之和.java
 */
/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    throw new IllegalArgumentException("抛出不合法声明异常");
  }
}
// @lc code=end
