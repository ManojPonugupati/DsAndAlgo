package matrices;

public class DeterminantOfMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}};
        int n = mat.length;
        System.out.print("Determinant " +
                "of the matrix is : " +
                determinantOfMatrix(mat, n));
    }
    static void getCofactor(int mat[][],
                            int temp[][], int p, int q, int n)
    {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++)
        {
            for (int col = 0; col < n; col++)
            {

                if (row != p && col != q)
                {
                    temp[i][j++] = mat[row][col];

                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
    static int determinantOfMatrix(int[][] mat, int n) {
        int D = 0;
        if (n == 1)
            return mat[0][0];
        int temp[][] = new int[n][n];
        int sign = 1;
        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f]
                    * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }
        return D;
    }
}
