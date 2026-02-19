package lld.voting.service;

import lld.voting.Election;
import lld.voting.entity.Vote;
import lld.voting.entity.Voter;
import lld.voting.enu.ElectionType;

import java.util.List;

public class RegisterVoterService {

    private VoterDAO voterDb;
    private ElectionType electionType;

    public RegisterVoterService() {
    }

    public RegisterVoterService(VoterDAO voterDb) {
        this.voterDb = voterDb;
    }

    public void registerVoter(Voter voter){
        boolean isVoterAdded = voterDb.addNewVoter(voter);
        if (isVoterAdded){
            System.out.println("voter is added with Adhar-number "+ voter.getAdharnumber());
        }
    }

    public void castVoting(Vote vote){
        boolean isVoterAdded = voterDb.castVoting(vote);
        if (isVoterAdded){
            System.out.println("voter is added with Adhar-number "+ vote.getVoter().getAdharnumber());        }
    }

    public List<Voter> findAllVoter(){
        return voterDb.getAllValidVoters();
    }
}
