public class Calculator {
    public static void main(String[] args) {
        int[][] mtxArr = { { 1, 23, 34 }, { 34, 2, 6 }, { -2, 7, -6 }, { 6, -13, -6 }, { 4, 2, 4 } };
        int[][] mtxArr2 = { { 5, 3, -3,4 }, {4, 3, -2, 1 }, { 33, 11, -5, -6 } };

        Matrix mtx = new Matrix(mtxArr);
        Matrix mtx2 = new Matrix(mtxArr2);
        Matrix mtx3 = new Matrix(3, 5);

        System.out.println(mtx.toString());
        System.out.println(mtx2.toString());
        System.out.println(mtx3.toString());

        mtx.getData()[0][0] = 69;

        System.out.println(mtx.toString());



        Matrix mtxP = mtx.multiply(mtx2);
        if (mtxP == null) {
            return;
        }
        
        System.out.println(mtxP.toString());
        mtxP.getData()[0][0] = 69;
        System.out.println(mtxP.toString());


    }
}
