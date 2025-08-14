package lld.voting.service;

import lld.voting.entity.Voter;

import java.util.List;

public class RegisterVoterService {

    private VoterDAO voterDb;

    public RegisterVoterService() {
    }

    public RegisterVoterService(VoterDAO voterDb) {
        this.voterDb = voterDb;
    }

    public void registerVoter(Voter voter){
        boolean isVoterAdded = voterDb.addVoter(voter);
        if (isVoterAdded){
            System.out.println("voter is added with Adhar-number "+ voter.getAdharnumber());
        }
    }

    public List<Voter> findAllVoter(){
        return voterDb.getAllValidVoters();
    }
}
