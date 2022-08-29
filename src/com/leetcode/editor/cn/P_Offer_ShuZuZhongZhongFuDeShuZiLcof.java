/**
 * 找出数组中重复的数字。
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找
 * 出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * <p>
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 2 <= n <= 100000
 * <p>
 * Related Topics 数组 哈希表 排序 👍 936 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

/**
 * @Title 剑指 Offer 03_数组中重复的数字
 * @Date 2022-08-29 20:31:57
 */

public class P_Offer_ShuZuZhongZhongFuDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ShuZuZhongZhongFuDeShuZiLcof().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    return num;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}