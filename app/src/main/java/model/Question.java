package model;

public class Question {
    private int id;
    private String entitled;
    private Party partyId;

    public Question(int id, String entitled, Party partyId) {
        this.id = id;
        this.entitled = entitled;
        this.partyId = partyId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntitled() {
        return entitled;
    }

    public void setEntitled(String entitled) {
        this.entitled = entitled;
    }
}
