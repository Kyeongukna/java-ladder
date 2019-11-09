package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Users {
    private final int MAX_NAME_LENGTH = 5;
    private List<String> names = new ArrayList<>();

    public Users(String names) {
        inputName(names);
    }

    private String checkName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            name = name.substring(0,5);
        }
        return name;
    }

    private void inputName(String names) {
        String[] userNames = names.split(",");
        for(int i = 0 ; i < userNames.length ; i++ ) {
            this.names.add((checkName(userNames[i])));
        }
    }

    public List<String> getNames() {
        return names;
    }
}
