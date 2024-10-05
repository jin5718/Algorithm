import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] num = new int[N][2];
        
        for (int i = 0; i < N; i++) {
            num[i][0] = sc.nextInt(); // x좌표
            num[i][1] = sc.nextInt(); // y좌표
        }
        Arrays.sort(num, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(num[i][0] + " " + num[i][1]);
        }
    }
}
