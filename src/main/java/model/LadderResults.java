package model;

import java.util.ArrayList;
import java.util.List;

public class LadderResults {
    private List<Integer> ladderResult;
    private Ladder ladder;

    public LadderResults(Ladder ladder) {
        ladderResult = new ArrayList<Integer>();
        this.ladder = ladder;
        initResults();
    }

    private boolean checkRight(LadderResult ladderResult) {
        boolean positionCheck = ladder.getLadders().get(ladderResult.getHeight()).getPoint().get(ladderResult.getPosition() + 1);
        if(positionCheck == true) {
            ladderResult.nextLine(ladderResult.getHeight() + 1, ladderResult.getPosition() + 1);
            return true;
        }
        return false;
    }

    private boolean checkLeft(LadderResult ladderResult) {
        boolean positionCheck = ladder.getLadders().get(ladderResult.getHeight()).getPoint().get(ladderResult.getPosition());
        if (positionCheck == true) {
            ladderResult.nextLine(ladderResult.getHeight() + 1, ladderResult.getPosition() - 1);
            return true;
        }
        return false;
    }

    private void goNextLine(LadderResult ladderResult) {
        if(( checkRight(ladderResult) || checkLeft(ladderResult) ) == false) {
            ladderResult.nextLine(ladderResult.getHeight() + 1, ladderResult.getPosition());
        }
    }

    private int userResult(int position) {
        LadderResult ladderResult = new LadderResult(0, position);
        while(ladderResult.getHeight() < ladder.getLadderHeight()) {
            goNextLine(ladderResult);
        }
        return ladderResult.getPosition();
    }

    private void initResults() {
        for(int i = 0; i < ladder.getLadders().get(0).getPoint().size() - 1; i++) {
            ladderResult.add(userResult(i));
        }
    }

    public List<Integer> getLadderResult() {
        return ladderResult;
    }
}

