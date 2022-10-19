public class Line {
    private final int x1, y1;
    private final int x2, y2;
    private final boolean direction;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = Math.min(x1, x2);
        this.y1 = Math.min(y1, y2);
        this.x2 = Math.max(x1, x2);
        this.y2 = Math.max(y1, y2);
        this.direction = x1 == x2; // vertical is true, horizontal is false
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public boolean getDirection() {
        return direction;
    }

    public Integer[] getIntersection(Line otherLine) {
        if (direction != otherLine.getDirection() && otherLine != this) {
            if (!direction) {
                if (otherLine.getX1() > getX1() && otherLine.getX1() < getX2()) {
                    if (otherLine.getY1() < getY1() && otherLine.getY2() > getY1()) {
                        System.out.println(otherLine.getX1() + " " + getY1());
                        return new Integer[]{otherLine.getX1(), getY1()};
                    }
                }
            }
        }
        return null;
    }
}
