ublic class matriksaksi {
    public static void main(String[] args) {
        System.out.println();
        Matrix A = Matrix.random(3,3);
        System.out.println("Matriks Random A");
        A.show();

        System.out.println();

        Matrix B = A.transpose();
        System.out.println("Matriks Random B = transpose(Matrix Random A)");
        B.show();

        System.out.println();

        Matrix C = Matrix.identity(3);
        System.out.println("Matriks Identitas C (3x3)");
        C.show();

        System.out.println();

        Matrix AtambahB = A.plus(B);
        System.out.println("Matriks A + Matriks B");
        AtambahB.show();

        System.out.println();

        Matrix BkaliA = B.times(A);
        System.out.println("Matriks B * Matriks A");
        BkaliA.show();
    }
}