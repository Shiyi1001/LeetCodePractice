/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * <p>
 * <p>
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 * <p>
 * <p>
 * <p>
 * 限制：
 * <p>
 * 1 <= 数组长度 <= 50000
 * <p>
 * <p>
 * <p>
 * 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/
 * <p>
 * <p>
 * <p>
 * Related Topics 数组 哈希表 分治 计数 排序 👍 319 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 剑指 Offer 39_数组中出现次数超过一半的数字
 * @Date 2022-09-15 21:45:50
 */

public class P_Offer_ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new P_Offer_ShuZuZhongChuXianCiShuChaoGuoYiBanDeShuZiLcof().new Solution();
        System.out.println(solution.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                Integer count = map.getOrDefault(num, 0) + 1;
                if (count > nums.length / 2) {
                    return num;
                } else {
                    map.put(num, count);
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}