
public class Sports
{
    public int score;
    public String[] equipment;
    public int teamSize;
    public String[] rules;

    public Sports(int score, int teamSize, String[] rules, String[] equipment)
    {
        this.score = score;
        this.equipment = equipment;
        this.teamSize = teamSize;
        this.rules = rules;
    }

    public int getScore()
    {
        return score;
    }

    public String[] getEquipment()
    {
        return equipment;
    }

    public int getTeamSize()
    {
        return teamSize;
    }

    public String[] rules()
    {
        return rules;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public void setEquipment(String[] equipment)
    {
        this.equipment =  equipment;
    }

    public void setTeamSize(int teamSize)
    {
        this.teamSize = teamSize;
    }

    public void setRules(String[] rules)
    {
        this.rules = rules;
    }

    public String toString()
    {
        String output = "Score: " + score +
                        "\nTeam size: " + teamSize +
                        "\nRules: ";

        for(int i = 0; i < rules.length; i++)
        {
            output += "\n   " + (i + 1) + ". " + rules[i];
        }

        output += "\nEquipment: ";

        for(int i = 0; i < equipment.length; i++)
        {
            output += "\n   " + (i + 1) + ". " + equipment[i];
        }
        return output;
    }


}
