package Class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Game {
    GUI gameGui = new GUI();
    static final String[] AVAILABLE_CHOICES = {"rock", "paper", "scissors"};
    Player player = new Player();
    CPU cpu = new CPU();

    public Game(){
        gameGui.getRockBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpu.setChoice(cpu.generateCPUChoice(AVAILABLE_CHOICES));
                player.setChoice("rock");
                gameGui.setCPUChoice(cpu.getChoice());
                gameGui.setPlayerChoice(player.getChoice());
            }
        });

        gameGui.getPaperBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpu.setChoice(cpu.generateCPUChoice(AVAILABLE_CHOICES));
                player.setChoice("paper");
                gameGui.setCPUChoice(cpu.getChoice());
                gameGui.setPlayerChoice(player.getChoice());
            }
        });

        gameGui.getScissorsBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cpu.setChoice(cpu.generateCPUChoice(AVAILABLE_CHOICES));
                player.setChoice("scissors");
                gameGui.setCPUChoice(cpu.getChoice());
                gameGui.setPlayerChoice(player.getChoice());
            }
        });

        gameGui.getPlayerChoice().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {

                if(player.getChoice().equals(cpu.getChoice())){
                    gameGui.setRoundWinner("Nobody won :c");
                }else if(player.getChoice().equals("rock")){
                    if (cpu.getChoice().equals("scissors")){
                        player.setWinsCounter();
                        gameGui.setRoundWinner("Player");
                    } else if (cpu.getChoice().equals("paper")) {
                        cpu.setWinsCounter();
                        gameGui.setRoundWinner("CPU");
                    }
                }else if(player.getChoice().equals("paper")){
                    if (cpu.getChoice().equals("rock")){
                        player.setWinsCounter();
                        gameGui.setRoundWinner("Player");
                    } else if (cpu.getChoice().equals("scissors")) {
                        cpu.setWinsCounter();
                        gameGui.setRoundWinner("CPU");
                    }
                }else if(player.getChoice().equals("scissors")){
                    if (cpu.getChoice().equals("paper")){
                        player.setWinsCounter();
                        gameGui.setRoundWinner("Player");
                    } else if (cpu.getChoice().equals("rock")) {
                        cpu.setWinsCounter();
                        gameGui.setRoundWinner("CPU");
                    }
                }
                gameGui.setCPUWinsCount(cpu.getWinsCounter());
                gameGui.setPlayerWinsCount(player.getWinsCounter());
            }
        });
    }
}
