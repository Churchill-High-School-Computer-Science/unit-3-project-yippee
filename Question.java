public class Question {
    
    private String ans;
    private int score;
    private int numRight;
    
    Question()
    {
        score = 0;
        numRight = 0;
    }
    
    public String quest(String q, String a)
    {
        ans = a;
        return q;
    }
    
    public String answer(String x)
    {
        if(x == ans)
        {
            score += 10;
            numRight++;
            return "Correct";
            
        }
        else
        {
            return "Wrong";
        }
    }
    public String endGame()
    {
        return ("You got " + numRight + " questions right\nYour score is " + score + ".");
    }
}
