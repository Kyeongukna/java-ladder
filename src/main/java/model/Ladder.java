package model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> ladders = new ArrayList<>();

    public Ladder (int countOfPerson, int height) {
        for(int i = 0; i < height; i++) {
            ladders.add(new Line(countOfPerson));
        }
    }

    public List<Line> getLadders() {
        return ladders;
    }

    public int getLadderHeight() {
        return ladders.size();
    }
}
