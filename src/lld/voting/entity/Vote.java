package lld.voting.entity;

import lld.voting.enu.ElectionType;

public class Vote {
    private ElectionType electionType;
    private Voter voter;
    private Candidate candidate;

    public Vote() {
    }

    public Vote(ElectionType electionType, Voter voter, Candidate candidate) {
        this.electionType = electionType;
        this.voter = voter;
        this.candidate = candidate;
    }

    public ElectionType getElectionType() {
        return electionType;
    }

    public void setElectionType(ElectionType electionType) {
        this.electionType = electionType;
    }

    public Voter getVoter() {
        return voter;
    }

    public void setVoter(Voter voter) {
        this.voter = voter;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }
}
