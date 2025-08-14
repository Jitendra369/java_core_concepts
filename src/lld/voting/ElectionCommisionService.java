package lld.voting;

import lld.voting.entity.Voter;
import lld.voting.service.RegisterVoterService;

import java.util.List;

public class ElectionCommisionService {

    private Election election;
    private RegisterVoterService registerVoterService;

    public ElectionCommisionService(Election election, RegisterVoterService registerVoterService) {
        this.election = election;
        this.registerVoterService = registerVoterService;
    }

}
