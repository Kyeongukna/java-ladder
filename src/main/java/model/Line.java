package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Line {
    private List<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {
        creatableLine(countOfPerson);
    }

    private boolean RandomLine() {
        return new Random().nextBoolean();
    }

    private void creatableLine(int countOfPerson) {
        boolean previousLine = false ;
        points.add(false);
        for (int i = 1; i < countOfPerson ; i++) {
            previousLine = points.get(i-1);
            points.add(!previousLine && RandomLine());
        }
    }

    public List<Boolean> getPoint () {
        return points;
    }
}
