public class Node {
    private final int currentValue;
    private final Node left;
    private final Node right;

    private boolean direction;

    Node(int currentValue, int depth, int finalDepth) {
        this.currentValue = currentValue;
        this.direction = true;
        if (depth != finalDepth) {
            this.left = new Node(this.currentValue * 2, depth + 1, finalDepth);
            this.right = new Node(this.currentValue * 2 + 1, depth + 1, finalDepth);
        }
        else {
            this.left = null;
            this.right = null;
        }
    }

    public int dropBall() {
        flipDirection();
        if (left != null && right != null) {
            if (!getDirection()) {
                return getLeft().dropBall();
            }
            else {
                return getRight().dropBall();
            }
        }
        return getCurrentValue();
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void flipDirection() {
        direction = !direction;
    }

    public boolean getDirection() {
        return direction;
    }
}
