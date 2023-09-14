public class Polynomial {
    private double[] coff;
    public Polynomial() {
        coff = new double[]{0};
    }

    public Polynomial(double[] coefficients) {
        this.coff = coefficients.clone();
    }

    public Polynomial add(Polynomial other) {
        int maxDegree = Math.max(this.coff.length, other.coff.length);
        double[] resultCoefficients = new double[maxDegree];
        
        for (int i = 0; i < this.coff.length; i++) {
            resultCoefficients[i] += this.coff[i];
        }
        
        for (int i = 0; i < other.coff.length; i++) {
            resultCoefficients[i] += other.coff[i];
        }
        
        return new Polynomial(resultCoefficients);
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coff.length; i++) {
            result += coff[i] * Math.pow(x, i);
        }
        return result;
    }

    public boolean hasRoot(double x) {
        return evaluate(x) == 0;
    }

    public int getDegree() {
        return coff.length - 1;
    }


    public double[] getCoff() {
        return coff.clone();
    }



}
