public class Matrix {

    private final int rows, cols;
    private final int[][] data;

    public Matrix(int[][] data) {
        rows = data.length;
        cols = data[0].length;

        this.data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        this.data = new int[rows][cols];
    }

    public int[][] getData() {
        return data;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Matrix add(Matrix mtx) {
        if (rows != mtx.rows || cols != mtx.cols) {
            return null;
        }

        int[][] res = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = data[i][j] + mtx.data[i][j];
            }
        }

        return new Matrix(res);
    }

    public Matrix transpose() {
        int[][] res = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[j][i] = data[i][j];
            }
        }

        return new Matrix(res);
    }

    public Matrix multiply(Matrix mtx) {
        if (cols != mtx.rows) {
            return null;
        }

        int[][] res = new int[rows][mtx.cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < mtx.cols; j++) {
                int sum = 0;
                for (int k = 0; k < cols; k++) {
                    // System.out.println(String.format("%d %d", data[i][k], mtx.data[k][j]));
                    sum += data[i][k] * mtx.data[k][j];
                }
                res[i][j] = sum;
            }
        }

        return new Matrix(res);
    }

    public String toString() {
        String res = "";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res += data[i][j] + " ";
            }
            res += "\n";
        }
        res += rows + " x " + cols + "\n";
        return res;
    }
}
