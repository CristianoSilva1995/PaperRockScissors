package Class;

import javax.swing.*;

public class GUI extends JFrame{
    private JPanel mainPanel;
    private JPanel topPanel;
    private JLabel gameNameLabel;
    private JPanel midPanel;
    private JPanel bottomPanel;
    private JPanel playerInfoPanel;
    private JLabel playerChoice;
    private JPanel CPUInfoPanel;
    private JLabel CPUChoice;
    private JLabel CPUWinsCount;
    private JLabel playerWinsCount;
    private JLabel roundWinner;
    private JButton rockBtn;

    private JButton paperBtn;
    private JButton scissorsBtn;

    public GUI(){
        setTitle("Paper Rock Scissors!");
        setSize(800,500);
        setLocationRelativeTo(null);
        this.add(mainPanel);
        this.setVisible(true);
    }

    public JLabel getGameNameLabel() {
        return gameNameLabel;
    }

    public void setGameNameLabel(JLabel gameNameLabel) {
        this.gameNameLabel = gameNameLabel;
    }

    public JLabel getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(String playerChoice) {
        this.playerChoice.setText(playerChoice);
    }

    public void setCPUChoice(String CPUchoice) {
        this.CPUChoice.setText(CPUchoice);
    }

    public void setCPUWinsCount(JLabel CPUWinsCount) {
        this.CPUWinsCount = CPUWinsCount;
    }

    public JLabel getPlayerWinsCount() {
        return playerWinsCount;
    }

    public void setPlayerWinsCount(JLabel playerWinsCount) {
        this.playerWinsCount = playerWinsCount;
    }

    public JLabel getRoundWinner() {
        return roundWinner;
    }

    public void setRoundWinner(JLabel roundWinner) {
        this.roundWinner = roundWinner;
    }

    public JButton getRockBtn() {
        return rockBtn;
    }

    public void setRockBtn(JButton rockBtn) {
        this.rockBtn = rockBtn;
        this.rockBtn.setBorderPainted(false);
    }

    public JButton getPaperBtn() {
        return paperBtn;
    }

    public void setPaperBtn(JButton paperBtn) {
        this.paperBtn = paperBtn;
    }

    public JButton getScissorsBtn() {
        return scissorsBtn;
    }

    public void setScissorsBtn(JButton scissorsBtn) {
        this.scissorsBtn = scissorsBtn;
    }
}
