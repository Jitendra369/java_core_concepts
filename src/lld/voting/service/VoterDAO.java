package lld.voting.service;

import lld.voting.entity.Voter;

import java.util.*;

public class VoterDAO {

    private HashMap<Integer, Voter> allVoters;

    public VoterDAO() {
        this.allVoters = new HashMap<>();
    }

    //    save the new Voter
    public boolean addVoter(Voter voter) {
        Voter saveVoter = allVoters.get(voter.getAdharnumber());
        if (saveVoter == null) {
            allVoters.put(voter.getAdharnumber(), voter);
            return true;
        } else {
            System.out.println("Voter is alread cat the vote , having adhar-id :" + voter.getAdharnumber());
        }

        return false;
    }

//    get all teh voters
    public List<Voter> getAllValidVoters() {
        List<Voter> voters = new ArrayList<>();
        if (!allVoters.isEmpty()) {
            return new ArrayList<>(allVoters.values());
        }
        return new ArrayList<>();
    }
}
