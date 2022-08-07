package Class;

import java.util.Random;

public class CPU {
    Random random = new Random();
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

    public String generateCPUChoice(String[] AVAILABLE_CHOICES){
        return AVAILABLE_CHOICES[random.nextInt(AVAILABLE_CHOICES.length)];
    }
}
