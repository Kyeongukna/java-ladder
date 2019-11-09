package controller;

import model.Ladder;
import model.Line;
import model.Users;
import view.InputLadderHeight;
import view.InputUser;
import view.PrintLadder;
import view.PrintUser;

public class LadderManager {
    private Ladder ladder;
    private Users users;

    public LadderManager() {
        initLadder();
        startLadder();
    }

    private void initLadder() {
        InputUser inputUser = new InputUser();
        users = new Users (inputUser.getUserNames());
        InputLadderHeight inputLadderHeight = new InputLadderHeight();
        ladder = new Ladder(users.getNames().size(), inputLadderHeight.getHeight());
    }

    private void startLadder() {
        new PrintUser(users.getNames());
        for(Line line: ladder.getLadder()) {
            new PrintLadder(line.getPoint());
        }
    }

}
