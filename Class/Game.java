package Class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    }
}
