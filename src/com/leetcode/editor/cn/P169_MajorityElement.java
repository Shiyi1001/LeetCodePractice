/**
 * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [3,2,3]
 * 输出：3
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [2,2,1,1,1,2,2]
 * 输出：2
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * n == nums.length
 * 1 <= n <= 5 * 10⁴
 * -10⁹ <= nums[i] <= 10⁹
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 * <p>
 * Related Topics 数组 哈希表 分治 计数 排序 👍 1524 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 多数元素
 * @Date 2022-08-11 21:43:10
 */

public class P169_MajorityElement {
    public static void main(String[] args) {
        Solution solution = new P169_MajorityElement().new Solution();
        System.out.println(solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 其他思路： 1.先排序 后取下标n/2的值
     * 分治和投票方法 我放弃 =_=
     */
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                Integer count = map.getOrDefault(num, 0) + 1;
                map.put(num, count);
                if (map.get(num) > nums.length / 2) {
                    return num;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}