public class ComplexNumber {
    private double real;
    private double imaginary;

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;

    }

    public void add(ComplexNumber complex) {
        real += complex.real;
        imaginary += complex.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;

    }

    public void subtract(ComplexNumber complex) {
        real -= complex.real;
        imaginary -= complex.imaginary;

    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
