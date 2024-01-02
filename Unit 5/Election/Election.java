public class Election {
    private String stateName, president, electionResult;
    private int statePopulation, voteD, voteR;
    private boolean isElectionYear;

    public Election() {

    }

    public Election(String stateName, String president, int statePopulation, boolean isElectionYear, int voteR,
            int voteD) {
        this.stateName = stateName;
        this.president = president;
        this.statePopulation = statePopulation;
        this.isElectionYear = isElectionYear;
        this.voteR = voteR;
        this.voteD = voteD;

    }

    public void setStateName(String newStateName) {
        this.stateName = newStateName;
    }

    public void setPresident(String newPresident) {
        this.president = newPresident;
    }

    public void setStatePopulation(int newStatePopulation) {
        this.statePopulation = newStatePopulation;
    }

    public void setIsElectionYear(boolean newIsElectionYear) {
        this.isElectionYear = newIsElectionYear;
    }

    public void setVoteR(int newVoteR) {
        this.voteR = newVoteR;
    }

    public void setVoteD(int newVoteD) {
        this.voteD = newVoteD;
    }

    public String getStateName() {
        return stateName;
    }

    public String getPresident() {
        return president;
    }

    public int getStatePopulation() {
        return statePopulation;
    }

    public boolean getIsElectionYear() {
        return isElectionYear;
    }

    public int getVoteR() {
        return voteR;
    }

    public int getVoteD() {
        return voteD;
    }

    public String electionResults() {
        if (voteR > voteD) {
            electionResult = "Republican";
        } else if (voteR < voteD) {
            electionResult = "Democratic";
        } else {
            electionResult = "Neither";
        }

        return electionResult;
    }

    public String toString() {
        return "The name of this state is " + stateName + ". It has a population of " + statePopulation
                + ". The election year status is " + isElectionYear + ". The president is " + president
                + ". The republican voter status is set to " + voteR + " and the democratic vote is set to " + voteD
                + ".";
    }
}
