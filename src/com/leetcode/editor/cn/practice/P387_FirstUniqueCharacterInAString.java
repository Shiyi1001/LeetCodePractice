/**
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入: s = "leetcode"
 * 输出: 0
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: s = "loveleetcode"
 * 输出: 2
 * <p>
 * <p>
 * 示例 3:
 * <p>
 * <p>
 * 输入: s = "aabb"
 * 输出: -1
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= s.length <= 10⁵
 * s 只包含小写字母
 * <p>
 * <p>
 * Related Topics 队列 哈希表 字符串 计数 👍 621 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 387_字符串中的第一个唯一字符
 * @Date 2022-11-17 21:27:25
 */

public class P387_FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution solution = new P387_FirstUniqueCharacterInAString().new Solution();
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int firstUniqChar(String s) {
            Map<Character, Integer> map = new HashMap<>();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, -1);
                } else {
                    map.put(c, i);
                }
            }
            int first = length;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                if (value != -1) {
                    first = Math.min(first, value);
                }
            }
            if (first == length) {
                first = -1;
            }
            return first;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}