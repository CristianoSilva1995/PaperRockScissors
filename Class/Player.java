package Class;

public class Player {
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
}
