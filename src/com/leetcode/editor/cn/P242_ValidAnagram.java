/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 1 <= s.length, t.length <= 5 * 10⁴
 * s 和 t 仅包含小写字母
 * <p>
 * <p>
 * <p>
 * <p>
 * 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * <p>
 * Related Topics 哈希表 字符串 排序 👍 646 👎 0
 */

package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title 有效的字母异位词
 * @Date 2022-08-21 20:50:15
 */

public class P242_ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new P242_ValidAnagram().new Solution();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram2(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            Map<Character, Integer> maps = new HashMap<>();
            Map<Character, Integer> mapt = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
                mapt.put(t.charAt(i), mapt.getOrDefault(t.charAt(i), 0) + 1);
            }

            for (Character character : maps.keySet()) {
                // 不能用== 来判断 Integer 只在[-128,127]范围内有效，
                // 超过127后，会重新在堆中创建一个Integer对象，需要用equals 来比较
                if (!maps.get(character).equals(mapt.get(character))) {
                    return false;
                }
            }
            return true;
        }

        /**
         * 只维护一个hash表
         */
        public boolean isAnagram3(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }

            for (int i = 0; i < s.length(); i++) {
                map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
                if (map.get(t.charAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /**
         * 字符串中只包含26个小写字母
         * 维护一个长度为26的数组，下标代表字母
         */
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] arry = new int[26];
            for (int i = 0; i < s.length(); i++) {
                arry[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s.length(); i++) {
                arry[t.charAt(i) - 'a']--;
                if (arry[t.charAt(i) - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}