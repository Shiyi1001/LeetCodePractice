/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= nums.length <= 50000
 * 0 <= nums[i] <= 10000
 * <p>
 * <p>
 * Related Topics 数组 双指针 排序 👍 259 👎 0
 */

package com.leetcode.editor.cn;

/**
 * @Title 剑指 Offer 21_调整数组顺序使奇数位于偶数前面
 * @Date 2022-09-08 21:35:20
 */

public class P_Offer_DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 双指针 使得 low 左边的全是奇数  high右边的全是偶数
     */
    class Solution {
        public int[] exchange(int[] nums) {
            int low = 0, high = nums.length - 1;
            while (low < high) {
                while (low < high && nums[low] % 2 != 0) {
                    low++;
                }
                while (low < high && nums[high] % 2 == 0) {
                    high--;
                }
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
            }
            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}