/**
 * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i -
 * j) <= k 。如果存在，返回 true ；否则，返回 false 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,1], k = 3
 * 输出：true
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [1,0,1,1], k = 1
 * 输出：true
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：nums = [1,2,3,1,2,3], k = 2
 * 输出：false
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= nums.length <= 10⁵
 * -10⁹ <= nums[i] <= 10⁹
 * 0 <= k <= 10⁵
 * <p>
 * <p>
 * Related Topics 数组 哈希表 滑动窗口 👍 505 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Title 存在重复元素 II
 * @Date 2022-08-15 22:13:03
 */

public class P219_ContainsDuplicateIi {
    public static void main(String[] args) {
        Solution solution = new P219_ContainsDuplicateIi().new Solution();
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsNearbyDuplicate2(int[] nums, int k) {
            //map<vaule,index>
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
            return false;
        }

        /**
         * 滑动窗口
         * 因为固定了下标abs(i-j)<= k
         * 可以固定一个k长度的set集合 看里面的元素是否重复
         */
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (i > k) {
                    //移除 超过 abs(i-j)<= k 的元素
                    set.remove(nums[i - k - 1]);
                }
                if (!set.add(nums[i])) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}