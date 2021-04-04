public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        diagnol(arr,p);
    }



        static void diagnol ( int[][] mat, int p){
            int m = mat.length;
            int n = mat[0].length;
            if (p == 1) {
                for (int k = 0; k < m; k++) {
                    int i = k;
                    int j = 0;
                    while (i >= 0) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j + 1;
                    }
                    System.out.println();
                }
                for (int k = 1; k <= n - 1; k++) {
                    int i = m - 1;
                    int j = k;
                    while (j <= n - 1) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j + 1;
                    }
                    System.out.println();
                }
            }
            if (p == 2) {
                for (int k = 0; k < m; k++) {
                    int i = k;
                    int j = n - 1;
                    while (i >= 0) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j - 1;
                    }
                    System.out.println();
                }
                for (int k = n - 1; k >= 1; k--) {
                    int i = m - 1;
                    int j = k - 1;
                    while (j >= 0) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j - 1;
                    }

                }
                System.out.println();
            }
            if (p == 3) {
                for (int k = n - 1; k >= 0; k--) {
                    int i = m - 1;
                    int j = k;
                    while (j < n) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j + 1;
                    }
                    System.out.println();
                }
                for (int k = m - 1; k > 0; k--) {
                    int i = k - 1;
                    int j = 0;
                    while (i >= 0) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j + 1;
                    }
                    System.out.println();
                }
            }
            if (p == 4) {
                for (int k = 0; k < m - 1; k++) {
                    int i = m - 1;
                    int j = k;
                    while (j >= 0) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j - 1;
                    }
                    System.out.println();
                }
                for (int k = m - 1; k >= 0; k--) {
                    int j = m - 1;
                    int i = k;
                    while (i >= 0) {
                        System.out.print(mat[i][j]);
                        i = i - 1;
                        j = j - 1;
                    }
                    System.out.println();

                }
            }

        }

    }
