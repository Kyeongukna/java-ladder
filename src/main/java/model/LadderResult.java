package model;

public class LadderResult {
    private int height;
    private int position;

    public LadderResult(int height, int position) {
        this.height = height;
        this.position = position;
    }

    public void nextLine(int height, int position) {
        this.height = height;
        this.position = position;
    }

    public int getHeight() {
        return height;
    }

    public int getPosition() {
        return position;
    }
}
