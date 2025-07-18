public class Point {
    private int x;
    private int y;

    public double distance(){
        double distance = Math.sqrt(((this.x) * (this.x)) + ((this.y) * (this.y)));

        return distance;
    }

    public double distance(Point parameterPoint){
        double distance = Math.sqrt(((this.x - parameterPoint.x) * (this.x - parameterPoint.x)) + ((this.y - parameterPoint.y) * (this.y - parameterPoint.y)));

        return distance;
    }

    public double distance(int x, int y){
        double distance = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));

        return distance;
    }

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
