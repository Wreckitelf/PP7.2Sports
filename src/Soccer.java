public class Soccer extends Sports
{

    public int score;
    public String[] equipment;
    public int teamSize;
    public String[] rules;

    //Sport Specific
    public int numRackets;



    public Soccer(int score, int teamSize, String[] rules, String[] equipment)
    {
        super(score, teamSize, rules, equipment);
    }
}
