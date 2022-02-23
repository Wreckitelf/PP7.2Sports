public class Baseball extends Sports
{
    public int score;
    public String[] equipment;
    public int teamSize;
    public String[] rules;

    //Sport Specific
    public int inning;
    public boolean playingDefense;

    public Baseball(int score, int teamSize, String[] rules, String[] equipment, int inning, boolean playingDefense)
    {
        super(score, teamSize, rules, equipment);
        this.inning = inning;
        this.playingDefense = playingDefense;
    }

    public boolean getPlayingDefense() {return playingDefense;}
    public int getInning() {return inning;}

    public void setPlayingDefense(boolean playingDefense) {this.playingDefense = playingDefense;}
    public void setInning(int inning) {this.inning = inning;}


    public void switchSides()
    {playingDefense = !playingDefense;}

    public String toString()
    {
        String output = super.toString() +
                        "\nInning: " + inning +
                        "\nOn Defense: " + playingDefense;

        return output;
    }

}
