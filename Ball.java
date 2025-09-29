public class Ball {
    private float x;       // позиция по X
    private float y;       // позиция по Y
    private int radius;    // радиус
    private float xDelta;  // шаг по X
    private float yDelta;  // шаг по Y

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public Ball(float x, float y, int radius, int speed, int directionInDegree) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double directionInRadian = Math.toRadians(directionInDegree);
        this.xDelta = (float) (speed * Math.cos(directionInRadian));
        this.yDelta = (float) (speed * Math.sin(directionInRadian));
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public int getRadius() { return radius; }
    public float getXDelta() { return xDelta; }
    public float getYDelta() { return yDelta; }

    public void setX(float x) { this.x = x; }
    public void setY(float y) { this.y = y; }
    public void setRadius(int radius) { this.radius = radius; }
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
