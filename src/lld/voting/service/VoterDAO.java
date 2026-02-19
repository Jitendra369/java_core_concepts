package lld.voting.service;

import lld.voting.entity.Vote;
import lld.voting.entity.Voter;
import lld.voting.enu.ElectionType;

import java.util.*;

public class VoterDAO {

    private HashMap<Integer, Voter> allVoters;
    private HashMap<ElectionType, Vote> voters;

    public VoterDAO() {
        this.allVoters = new HashMap<>();
    }

    //    save the new Voter
    public boolean addNewVoter(Voter voter) {
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


    public boolean castVoting(Vote vote){return false;
    }
}
