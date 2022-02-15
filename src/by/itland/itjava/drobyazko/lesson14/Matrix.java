package by.itland.itjava.drobyazko.lesson14;

public class Matrix extends Var {

        private double[][] matr;

        public Matrix(double[][] matr) {
            this.matr = matr;
        }

        public Matrix(Matrix matr) {
            this.matr = matr.matr;
        }

        public Matrix(String matr) {
            matr = matr.replaceAll("[},{]", " ");
            matr = matr.trim();
            String[] matrstr = matr.split(" ");
            String[] stolbmatr = matrstr[0].split("\\s+");
            int stb = stolbmatr.length;
            int str = matrstr.length;
            String[] matr2 = matr.split("\\s+");
            int n = 0;
            double[][] matr3 = new double[str][stb];
            for (int i = 0; i < matr3.length; i++) {
                for (int j = 0; j < matr3[i].length; j++) {
                    matr3[i][j] = Double.parseDouble(matr2[n]);
                    n++;
                }
            }
            this.matr = matr3;
        }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        String del = "";
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[0].length; j++) {
                stringBuilder.append(del).append(matr[i]);
                del = ", ";
            }
            stringBuilder.append ("},{");
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

}
