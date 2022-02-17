package by.itland.itjava.drobyazko.lesson14;

public class Matrix extends Var {

    private double[][] matr;

    public double[][] getMatr() {
        return matr;
    }

    public Matrix(double[][] matr) {
        this.matr = matr;
    }

    public Matrix(String matr) {
        String[] split = matr.trim().split("(},\\s*\\{)");
        int countRow = split.length;
        int countCol = split[0].split("\\s*,\\s*").length;
        double[][] arr = new double[countRow][countCol];

        for (int i = 0; i < countRow; i++) {
            split[i] = split[i].replaceAll("[{}]", "");
            String[] splitRow = split[i].split("\\s*,\\s*");
            for (int j = 0; j < splitRow.length; j++) {
                arr[i][j] = Double.parseDouble(splitRow[j]);
            }
        }
        this.matr = arr;

    }

    public Matrix(Matrix matrix) {
        this.matr = matrix.matr;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.matr.length == operand2.matr.length) {
                if (this.matr[0].length == operand2.matr[0].length) {
                    double[][] arr = new double[this.matr.length][this.matr[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = this.matr[i][j] + operand2.matr[i][j];
                        }
                    }
                    return new Matrix(arr);
                }
            }
        } else if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.matr.length][this.matr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = this.matr[i][j] + operand2.getValue();
                }
            }
        }


        return super.add(other);

    }

    @Override
    public Var mull(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.matr[0].length == operand2.matr.length) {
                double[][] matr = new double[this.matr.length][operand2.matr[0].length];
                for (int i = 0; i < matr.length; i++) {
                    for (int j = 0; j < matr[0].length; j++) {
                        for (int k = 0; k < matr.length; k++) {
                            matr[i][j] += matr[i][k] * matr[k][j];
                        }
                    }
                }
                return new Matrix(matr);
            }

        } else if (other instanceof Vector) {
            //код
//            return new Vector();
        } else if (other instanceof Scalar) {
            //код
//            return new Matrix();
        }
        return super.mull(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Matrix) {
            Matrix operand2 = (Matrix) other;
            if (this.matr.length == operand2.matr.length) {
                if (this.matr[0].length == operand2.matr[0].length) {
                    double[][] arr = new double[this.matr.length][this.matr[0].length];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            arr[i][j] = this.matr[i][j] - operand2.matr[i][j];
                        }
                    }
                    return new Matrix(arr);
                }
            }
        } else if (other instanceof Scalar) {
            Scalar operand2 = (Scalar) other;
            double[][] arr = new double[this.matr.length][this.matr[0].length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = this.matr[i][j] - operand2.getValue();
                }
            }
        }
        return super.sub(other);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{{");
        for (int i = 0; i < matr.length; i++) {
            String del = "";
            String delRow = i != matr.length - 1 ? "}, {" : "";
            for (int j = 0; j < matr[i].length; j++) {
                stringBuilder.append(del).append(matr[i][j]);
                del = ", ";
            }
            stringBuilder.append(delRow);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

}
