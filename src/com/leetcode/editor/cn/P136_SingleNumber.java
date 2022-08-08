/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * Related Topics 位运算 数组 👍 2520 👎 0
 */

package com.leetcode.editor.cn;

import java.util.*;

/**
 * @Title 只出现一次的数字
 * @Date 2022-08-08 20:12:23
 */

public class P136_SingleNumber {
    public static void main(String[] args) {
        Solution solution = new P136_SingleNumber().new Solution();
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    /**
     * 官方异或解法  放弃 =_=
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber2(int[] nums) {

            Arrays.sort(nums);
            for (int i = 0; i <= nums.length - 1; ) {
                if ((i < nums.length - 1) && nums[i] == nums[i + 1]) {
                    i += 2;
                } else {
                    return nums[i];
                }
            }
            return -1;
        }

        public int singleNumber(int[] nums) {

            // <num,count>
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                Integer count = map.get(num);
                count = count == null ? 1 : ++count;
                map.put(num, count);
            }
            for (Integer num : map.keySet()) {
                if (map.get(num) == 1) {
                    return num;
                }
            }
            return -1;
        }

        /**
         * hashSet 存值不重复，add()
         */
        public int singleNumber3(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    //重复则删除
                    set.remove(num);
                }
            }
            //留下来的最后一个是不重复的数
            return set.iterator().next();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}