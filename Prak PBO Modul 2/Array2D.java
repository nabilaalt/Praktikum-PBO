class Array2D {
    public static void main(String[] args) {
        int[][] arrx; // Cara 1 Array 2 Dimensi
        arrx = new int[3][3];
        arrx[0][0] = 1;
        arrx[0][1] = 2;
        arrx[0][2] = 3;
        arrx[1][0] = 4;
        arrx[1][1] = 5;
        arrx[1][2] = 6;
        arrx[2][0] = 7;
        arrx[2][1] = 8;
        arrx[2][2] = 9;
        System.out.println("Nilai arrx[0] : " + arrx[0][0]);
        System.out.println("Nilai arrx[0] : " + arrx[0][1]);
        System.out.println("Nilai arrx[0] : " + arrx[0][2]);
        System.out.println("Nilai arrx[1] : " + arrx[1][0]);
        System.out.println("Nilai arrx[1] : " + arrx[1][1]);
        System.out.println("Nilai arrx[1] : " + arrx[1][2]);
        System.out.println("Nilai arrx[2] : " + arrx[2][0]);
        System.out.println("Nilai arrx[2] : " + arrx[2][1]);
        System.out.println("Nilai arrx[2] : " + arrx[2][2]);
    }
}
