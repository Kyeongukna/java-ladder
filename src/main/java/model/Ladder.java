package model;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
    private List<Line> Ladder = new ArrayList<>();

    public Ladder (int countOfPerson, int height) {
        for(int i = 0; i < height; i++) {
            Ladder.add(new Line(countOfPerson));
        }
    }

    public List<Line> getLadder() {
        return Ladder;
    }
}
