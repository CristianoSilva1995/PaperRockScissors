package Class;

import java.util.ArrayList;
import java.util.Random;

public class CPU {
    Random random = new Random();

    static ArrayList<String> playerChoicesTracker = new ArrayList<>();
    String[] sequence_1 = {"rock","paper","scissors"};
    String[] sequence_2 = {"paper","scissors","rock"};
    String[] sequence_3 = {"scissors","rock","paper"};
    String[] sequence_4 = {"rock","paper","rock"};
    String[] sequence_5 = {"paper","scissors","paper"};
    String[] sequence_6 = {"scissors","rock","scissors"};
    String[] sequence_7 = {"scissors","paper","rock"};
    private String choice;
    private int winsCounter = 0;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public int getWinsCounter() {
        return winsCounter;
    }

    public void setWinsCounter() {
        this.winsCounter++;
    }
    public void setPlayerChoicesTracker(String playerChoice) {
        this.playerChoicesTracker.add(playerChoice);
    }

    public String generateCPUChoice(String[] AVAILABLE_CHOICES){
        System.out.println(playerChoicesTracker);
        if(playerChoicesTracker.size() < 3){
            return AVAILABLE_CHOICES[random.nextInt(AVAILABLE_CHOICES.length)];
        }else if(playerChoicesTracker.get(playerChoicesTracker.size() - 3).equals(playerChoicesTracker.get(playerChoicesTracker.size() - 2))){
            if(playerChoicesTracker.get(playerChoicesTracker.size() - 2).equals(playerChoicesTracker.get(playerChoicesTracker.size() - 1))) {
                if (playerChoicesTracker.get(playerChoicesTracker.size() - 1).equals("rock")) {
                    return "paper";
                } else if (playerChoicesTracker.get(playerChoicesTracker.size() - 1).equals("paper")) {
                    return "scissors";
                } else {
                    return "rock";
                }
            }
        }else if(verifySequence(sequence_1)){
            return "paper";
        }else if(verifySequence(sequence_2)){
            return "scissors";
        }else if(verifySequence(sequence_3)){
            return "rock";
        }else if(verifySequence(sequence_4)){
            return "scissors";
        }else if(verifySequence(sequence_5)){
            return "rock";
        }else if(verifySequence(sequence_6)){
            return "paper";
        }else if(verifySequence(sequence_7)){
            System.out.println("sequence!");
            return "rock";
        }
        return AVAILABLE_CHOICES[random.nextInt(AVAILABLE_CHOICES.length)];
    }

    private Boolean verifySequence(String[] sequence){
        int numberOfChoicesToTrack = 2;
        Boolean response = false;
        for(int i = 0; i< numberOfChoicesToTrack; i++){
            if(sequence[i] == playerChoicesTracker.get(playerChoicesTracker.size() - (i + 1))){
                response = true;
            }else {
                response = false;
            }
        }
        return response;
    }
}
