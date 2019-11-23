package model;

import java.util.List;

public class Users {
    private List<String> names;
    public Users(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }

    public int getNameLength() {
        return names.size();
    }
}
