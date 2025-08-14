package lld.voting;

import lld.voting.entity.Voter;
import lld.voting.service.RegisterVoterService;
import lld.voting.service.VoterDAO;

public class Main {
    public static void main(String[] args) {

        VoterDAO voterDAO = new VoterDAO();
        RegisterVoterService registerVoterService = new RegisterVoterService(voterDAO);
        Voter voterVikas = buildNewVoter(123, "vikas");
        Voter voterSiddesh = buildNewVoter(124, "siddesh");
        Voter voterRakesh = buildNewVoter(125, "rakesh");
        registerVoterService.registerVoter(voterVikas);
        registerVoterService.registerVoter(voterRakesh);
        registerVoterService.registerVoter(voterSiddesh);

        registerVoterService.findAllVoter().stream().forEach(voter -> {
            System.out.println(voter.getAdharnumber() + " "+ voter.getName());
        });


    }

    private static Voter buildNewVoter(int adharNumber, String name){
        return new Voter(name, adharNumber);
    }
}
