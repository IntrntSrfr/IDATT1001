public class Calculator {
    public static void main(String[] args) {
        int[][] mtxArr = {{1, 23, 34}, {34, 2, 6}, {-2, 7, -6}, {6, -13, -6}, {4, 2, 4}};
        int[][] mtxArr2 = {{5, 3, -3, 4}, {4, 3, -2, 1}, {33, 11, -5, -6}};

        Matrix mtx = new Matrix(mtxArr);
        Matrix mtx2 = new Matrix(mtxArr2);

        System.out.println(mtx.toString());
        System.out.println(mtx2.toString());

        Matrix mtxP = mtx.multiply(mtx2);
        if (mtxP == null) {
            return;
        }

        System.out.println(mtxP.toString());
        System.out.println(mtxP.transpose().toString());

        Matrix mtx3 = new Matrix(2, 3);
        System.out.println(mtx3.toString());

        Matrix mtx4 = new Matrix(new int[][]{{1, 2, 3}, {3, 2, 1}});
        System.out.println(mtx3.add(mtx4));

        Matrix mtxT1 = new Matrix(new int[][]{{1, 2}, {3, 2}});
        Matrix mtxT2 = new Matrix(new int[][]{{1, 3}, {2, 2}});

        System.out.println(mtxT1.multiply(mtxT2));
    }
}
