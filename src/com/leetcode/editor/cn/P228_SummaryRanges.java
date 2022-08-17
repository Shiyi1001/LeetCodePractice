/**
 * 给定一个 无重复元素 的 有序 整数数组 nums 。
 * <p>
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于
 * nums 的数字 x 。
 * <p>
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 * <p>
 * <p>
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 * <p>
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：nums = [0,1,2,4,5,7]
 * 输出：["0->2","4->5","7"]
 * 解释：区间范围是：
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：nums = [0,2,3,4,6,8,9]
 * 输出：["0","2->4","6","8->9"]
 * 解释：区间范围是：
 * [0,0] --> "0"
 * [2,4] --> "2->4"
 * [6,6] --> "6"
 * [8,9] --> "8->9"
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 0 <= nums.length <= 20
 * -2³¹ <= nums[i] <= 2³¹ - 1
 * nums 中的所有值都 互不相同
 * nums 按升序排列
 * <p>
 * <p>
 * Related Topics 数组 👍 228 👎 0
 */

package com.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 汇总区间
 * @Date 2022-08-17 21:06:36
 */

public class P228_SummaryRanges {
    public static void main(String[] args) {
        Solution solution = new P228_SummaryRanges().new Solution();
        System.out.println(solution.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 用 low high 标志 连续区间的起始位置
     */
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list = new ArrayList<>();
            int i = 0;
            while (i < nums.length) {
                int low = i;
                i++;
                while (i < nums.length && nums[i] == nums[i - 1] + 1) {
                    i++;
                }
                int high = i - 1;
                StringBuilder sb = new StringBuilder(String.valueOf(nums[low]));
                if (low < high) {
                    sb.append("->");
                    sb.append(nums[high]);
                }
                list.add(sb.toString());
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}