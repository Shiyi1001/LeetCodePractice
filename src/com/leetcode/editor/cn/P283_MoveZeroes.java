/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: nums = [0]
 * 输出: [0]
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁴
 * -2³¹ <= nums[i] <= 2³¹ - 1
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：你能尽量减少完成的操作次数吗？
 * <p>
 * Related Topics 数组 双指针 👍 1713 👎 0
 */

package com.leetcode.editor.cn;

import java.util.Arrays;

/**
 * @Title 移动零
 * @Date 2022-08-25 20:59:12
 */

public class P283_MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new P283_MoveZeroes().new Solution();
        int[] arry = new int[]{1, 0, 3, 5, 0, 9, 0};
        solution.moveZeroes(arry);
        System.out.println(Arrays.toString(arry));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 双指针 左指针指左边均为非零数
         * 右指针 左边到左指针均为0
         */
        public void moveZeroes(int[] nums) {
            int left = 0, right = 0;
            while (right < nums.length) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;

                    left++;
                }
                right++;
            }
        }

        /**
         * 借助快速排序  以0为标兵
         */
        public void moveZeroes2(int[] nums) {
            if (nums == null) {
                return;
            }
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j++] = temp;
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}