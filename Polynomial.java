public class Polynomial {
    double[] coff;
    public Polynomial() {
        coff = new double[]{0};
    }

    public Polynomial(double[] coefficients) {
        this.coff = coefficients.clone();
    }

    public Polynomial add(Polynomial other) {

        int maxDegree = 0;
        double[] res = new double[maxDegree];
        if (this.coff.length>=other.coff.length) {
            maxDegree=this.coff.length;
            
        }
        else{
            maxDegree=other.coff.length;
        }
        
        for (int i = 0; i < this.coff.length; i++) {
            res[i] += this.coff[i];
        }
        
        for (int i = 0; i < other.coff.length; i++) {
            res[i] += other.coff[i];
        }
        
        return new Polynomial(res);
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
