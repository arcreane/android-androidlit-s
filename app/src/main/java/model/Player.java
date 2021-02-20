package model;

public class Player {
    private int id;
    private String name;
    private Party partyId;

    public Player(int id, String name, Party partyId) {
        this.id = id;
        this.name = name;
        this.partyId = partyId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
