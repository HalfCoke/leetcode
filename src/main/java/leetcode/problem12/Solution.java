package leetcode.problem12;

import org.junit.Assert;

import java.util.Objects;

public class Solution {

    final int[][] offset = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(solution.exist(board, "ABCCED"));

        char[][] board1 = {{'a', 'b'}, {'c', 'd'}};
        Assert.assertFalse(solution.exist(board1, "abcd"));
    }

    public boolean exist(char[][] board, String word) {
        if (board.length != 0 && (board.length * board[0].length < word.length())) return false;
        int[][] accessed = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Objects.equals(board[i][j], word.charAt(0))) {
                    if (findPathWithPoint(board, i, j, word, accessed)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean findPathWithPoint(char[][] board, int x, int y, String subWord, int[][] accessed) {
        accessed[x][y] = 1;
        if (Objects.equals(board[x][y], subWord.charAt(0))) {
            if (subWord.length() == 1) return true;
            for (int i = 0; i < offset.length; i++) {
                int a = Math.max(0, x + offset[i][0]);
                int b = Math.max(0, y + offset[i][1]);
                a = Math.min(a, board.length - 1);
                b = Math.min(b, board[0].length - 1);
                if (accessed[a][b] == 0
                        && findPathWithPoint(board, a, b, subWord.substring(1), accessed)) {
                    return true;
                }
            }
        }
        accessed[x][y] = 0;
        return false;
    }
}
