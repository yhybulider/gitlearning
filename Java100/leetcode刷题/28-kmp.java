class solution {
    char[] txt;
    char[] pat;
    int[] next;

    public int strStr(String haystack, String needle) {
        txt = haystack.toCharArray();
        pat = needle.toCharArray();
        initNext();
        return KMP();
    }

    // 返回的是子串的子匹配数组
    private void initNext() {
        // 先创建一个子串长度的数组+1
        next = new int[pat.length + 1];
        // 定义一个哨兵
        next[0] = -1;
        int i = 0, j = -1;
        while (i < pat.length) {
            // 匹配成功就同时加一，将next数组完成
            if (j == -1 || pat[i] == pat[j]) {
                next[++i] = ++j;
            } else {
                // 不相等就返回上一位的next数组作为j的值
                j = next[j];
            }
        }

    }

    private int KMP() {
        int i = 0, j = 0;
        while (i < txt.length && j < pat.length) {
            if (j == -1 || txt[i] == pat[j]) {
                i++;
                j++;
            } else {
                // 这里是关键点，处理不相等的情况下，匹配字符串索引的移动
                j = next[j];
            }

        }
        // 最后匹配成功了，且刚刚好等于子串的长度，就会返回i-j，就是第一个匹配的字符的索引值
        if (j == pat.length) {
            return i - j;
        } else {
            // 不相等就会返回-1
            return -1;
        }

    }
}