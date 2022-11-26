/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，
 * 并以数组的形式返回结果。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [4,3,2,7,8,2,3,1]
 * 输出：[5,6]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [1,1]
 * 输出：[2]
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == nums.length
 * 1 <= n <= 10⁵
 * 1 <= nums[i] <= n
 * <p>
 * <p>
 * 进阶：你能在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * Related Topics 数组 哈希表 👍 1122 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Title 448_找到所有数组中消失的数字
 * @Date 2022-11-23 22:25:38
 */

public class P448_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution solution = new P448_FindAllNumbersDisappearedInAnArray().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int i = 1; i <= nums.length; i++) {
                if (map.get(i) == null) {
                    list.add(i);
                }
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}