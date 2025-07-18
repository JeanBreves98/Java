public class Floor {
    private double width;
    private double length;

    public double getArea() {

        return width * length;
    }

    public Floor(double width, double length) {
        if (length < 0) {
            length = 0;
        }

        if (width < 0) {
            width = 0;
        }

        this.width = width;
        this.length = length;
    }

}
