package lld.voting;

import lld.voting.entity.Candidate;
import lld.voting.entity.Voter;
import lld.voting.enu.ElectionType;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {

    private ElectionType electionType;
    private List<Voter> voters;
    private List<Candidate> candidates;
    private Date dateOfElection;
    private Map<ElectionType,Map<Integer, Integer>> voterCandidateMapping;

    public Election() {
        voterCandidateMapping = new HashMap<>();
    }

    public Election(ElectionType electionType, List<Voter> voters, List<Candidate> candidates) {
        this.electionType = electionType;
        this.voters = voters;
        this.candidates = candidates;
        this.dateOfElection = new Date();
    }

    public ElectionType getElectionType() {
        return electionType;
    }

    public void setElectionType(ElectionType electionType) {
        this.electionType = electionType;
    }

    public List<Voter> getVoters() {
        return voters;
    }

    public void setVoters(List<Voter> voters) {
        this.voters = voters;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }
}
