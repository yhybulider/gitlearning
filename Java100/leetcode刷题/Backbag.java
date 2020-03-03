
public class Backbag {
    public static void main(String[] args) {
        // 背包问题
        // lnitialize
        int[] w = { 1, 3, 4 };
        int[] v = { 1000, 2000, 2500 };
        int m = 4;
        int n = v.length;
        int[][] value = new int[n+1][m + 1];

        // special case
        for (int i = 0; i < value.length; i++) {
            value[i][0] = 0;
        }

        for (int i = 0; i < value[0].length; i++) {
            value[0][i] = 0;
        }

        // difficult
        //不处理第一行
        for (int i = 1; i < value.length; i++) {
            // 不处理第一列
            for (int j = 1; j < value[0].length; j++) {
                // 程序i从一开始的
                if (w[i - 1] > j) {
                    value[i][j] = value[i - 1][j ];
                } else {
                    if (value[i - 1][j] > v[i-1]+value[i - 1][j - w[i-1]]) {
                        value[i][j] = value[i - 1][j];
                    } else {
                        value[i][j] = v[i-1]+value[i - 1][j - w[i-1]];

                    }
                }

            }
        }

        // Traversal
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                System.out.printf("%d  ", value[i][j]);
            }
            System.out.println();

        }

    }

}