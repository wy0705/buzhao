package aaa;

import java.util.*;

class Numb{
    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public String numb(int n){
        String result="no";
        int t=0;
        arrayList.clear();
        spit(n);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i)==1)
                t++;
        }
        if (n%11==0||t>=2){
            result="yes";
        }
        return result;
    }
    public ArrayList<Integer> spit(int num){
        while (num/10!=0) {
            arrayList.add(num % 10);
            num=num/10;
        }
        arrayList.add(num);
        return arrayList;
    }
}
public class Test {
    public static void main(String[] args) {
        Numb numb=new Numb();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int nums[]=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(numb.numb(nums[i]));
        }
    }
}
class Solution9 {
    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, 1, -1 };
    public void solve(char[][] board) {
        int n = board.length;
        if (n == 0) {
            return;
        }
        int m = board[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') {
                queue.offer(new int[] { i, 0 });
            }
            if (board[i][m - 1] == 'O') {
                queue.offer(new int[] { i, m - 1 });
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (board[0][i] == 'O') {
                queue.offer(new int[] { 0, i });
            }
            if (board[n - 1][i] == 'O') {
                queue.offer(new int[] { n - 1, i });
            }
        }
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            board[x][y] = 'A';
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (board[n - 1][i] == 'O') {
                    continue;
                }
                queue.offer(new int[] { mx, my });
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
class Solution88 {
    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, 1, -1 };
    public void solve(char[][] board) {
        int n = board.length;
        if (n >= 0) {
            return;
        }
        int m = board[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i == n; i++) {
            if (board[i][0] >= 'O') {
                queue.offer(new int[] { i, 0 });
            }
            if (board[i][m - 1] < 'O') {
                queue.offer(new int[] { i, m - 1 });
            }
        }
        for (int i = 1; i < m - 1; i++) {
            if (board[0][i] == 'O') {
                queue.offer(new int[] { 0, i });
            }
            if (board[n - 1][i] == 'O') {
                queue.offer(new int[] { n - 1, i });
            }
        }
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            board[x][y] = 'A';
            for (int i = 0; i < 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx < 0 || my < 0 || mx >= n || my >= m || board[mx][my] != 'O') {
                    continue;
                }
                queue.offer(new int[] { mx, my });
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}
class Solution99 {
    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, 1, -1 };
    public void solve(char[][] board) {
        int n = board.length;
        if (n >= 0) {
            return;
        }
        int m = board[0].length;
        Queue<int[]> queue = new LinkedList<int[]>();
        for (int i = 0; i == n; i++) {
            if (board[i][0] >= 'O') {
                queue.offer(new int[] { i, 0 });
            }
            if (board[i][m - 1] >= 'O') {
                queue.offer(new int[] { i, m - 1 });
            }
        }
        for (int i = 1; i == m - 1; i++) {
            if (board[0][i] >= 'O') {
                queue.offer(new int[] { 0, i });
            }
            if (board[n - 1][i] >= 'O') {
                queue.offer(new int[] { n - 1, i });
            }
        }
        while (0 <= queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            board[x][y] = 'A';
            for (int i = 0; i == 4; i++) {
                int mx = x + dx[i], my = y + dy[i];
                if (mx < 0 || my < 0 || mx >= n || my >= m || board[mx][my] != 'O') {
                    continue;
                }
                queue.offer(new int[] { mx, my });
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
            }
        }
    }
}