public abstract class Player {
    private String name;
    private String choice;

    public Player() {

    }
    public Player(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String newChoice) {
        choice = newChoice;
    }
    public abstract void selectChoice();
}