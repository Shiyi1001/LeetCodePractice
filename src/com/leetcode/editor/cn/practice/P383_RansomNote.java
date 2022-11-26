/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * <p>
 * 如果可以，返回 true ；否则返回 false 。
 * <p>
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * <p>
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 1 <= ransomNote.length, magazine.length <= 10⁵
 * ransomNote 和 magazine 由小写英文字母组成
 * <p>
 * <p>
 * Related Topics 哈希表 字符串 计数 👍 570 👎 0
 */

package com.leetcode.editor.cn.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 383_赎金信
 * @Date 2022-11-16 22:25:45
 */

public class P383_RansomNote {
    public static void main(String[] args) {
        Solution solution = new P383_RansomNote().new Solution();
        System.out.println(solution.canConstruct("aa", "ab"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < magazine.length(); i++) {
                map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
            }
            for (int i = 0; i < ransomNote.length(); i++) {
                char c = ransomNote.charAt(i);
                if (map.get(c) == null || map.get(c) < 1) {
                    return false;
                } else {
                    map.put(c, map.getOrDefault(c, 0) - 1);
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}