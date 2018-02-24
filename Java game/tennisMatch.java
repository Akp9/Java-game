

public class TennisMatch
{
    public enum GameScoreEnum {LOVE, FIFTEEN, THIRTY, FORTY, ADVANTAGE}
    public enum ScoreChangerEnum {NONE, GAME, SET, MATCH}
    
    private Player player1 = new Player();
    private Player player2 = new Player();
   
    // Scoring
    private boolean player1MatchWon = false;
    private boolean player2MatchWon = false;
    private int player1SetsWon = 0;
    private int player2SetsWon = 0;
    private int player1GamesWon = 0;
    private int player2GamesWon = 0;
    private GameScoreEnum player1GameScore = GameScoreEnum.LOVE;
    private GameScoreEnum player2GameScore = GameScoreEnum.LOVE;
   

    public TennisMatch ()
    {
    }
   
    public TennisMatch(Player player1, Player player2)
    {
        
       ResetScores();
        
        this.player1 = player1;
        this.player2 = player2;
    }
    
    public void ResetScores()
    {
        player1MatchWon = false;
        player2MatchWon = false;
        player1SetsWon = 0;
        player2SetsWon = 0;
        player1GamesWon = 0;
        player2GamesWon = 0;
        player1GameScore = GameScoreEnum.LOVE;
        player2GameScore = GameScoreEnum.LOVE;
    }
    
    public ScoreChangerEnum Player1Scores()
    {   
        ScoreChangerEnum scoreChanger = ScoreChangerEnum.NONE;
        
        if (!player1MatchWon && !player2MatchWon)
        {
        
            if (player1GameScore == GameScoreEnum.FORTY && player2GameScore == GameScoreEnum.ADVANTAGE)
            {
                player2GameScore = GameScoreEnum.FORTY;
            }
            else if (player1GameScore == GameScoreEnum.FORTY && player2GameScore == GameScoreEnum.FORTY)
            {
                player1GameScore = GameScoreEnum.ADVANTAGE;
            }
            else if (player1GameScore == GameScoreEnum.FORTY)
            {
              scoreChanger = ScoreChangerEnum.GAME;
              player1GamesWon += 1;
              player1GameScore = GameScoreEnum.LOVE;
              player2GameScore = GameScoreEnum.LOVE;
            }
            else
            {
                if (player1GameScore == GameScoreEnum.LOVE)
                  player1GameScore = GameScoreEnum.FIFTEEN;
                else if (player1GameScore == GameScoreEnum.FIFTEEN)
                  player1GameScore = GameScoreEnum.THIRTY;
                else if (player1GameScore == GameScoreEnum.THIRTY)
                  player1GameScore = GameScoreEnum.FORTY;
            }
            
            if (player1GamesWon >= 6 && (player1GamesWon - player2GamesWon) >= 2 && scoreChanger == ScoreChangerEnum.GAME)
            {
               scoreChanger = ScoreChangerEnum.SET;
               if (player1SetsWon == 2)
               {
                 scoreChanger = ScoreChangerEnum.MATCH;
                 player1MatchWon = true;
                 player1GamesWon = 0;
                 player2GamesWon = 0;
                 player1SetsWon += 1;
                }
                else
                {
                    player1GamesWon = 0;
                    player2GamesWon = 0;
                    player1SetsWon += 1;
                    player1GameScore = GameScoreEnum.LOVE;
                    player2GameScore = GameScoreEnum.LOVE;
                }
            }
    
            PrintScores();
        }
        return scoreChanger;
        
    }

    public ScoreChangerEnum Player2Scores()
    {   
        ScoreChangerEnum scoreChanger = ScoreChangerEnum.NONE;
        
        if (!player2MatchWon && !player1MatchWon)
        {
        
            if (player2GameScore == GameScoreEnum.FORTY && player1GameScore == GameScoreEnum.ADVANTAGE)
            {
                player1GameScore = GameScoreEnum.FORTY;
            }
            else if (player2GameScore == GameScoreEnum.FORTY && player1GameScore == GameScoreEnum.FORTY)
            {
                player2GameScore = GameScoreEnum.ADVANTAGE;
            }
            else if (player2GameScore == GameScoreEnum.FORTY)
            {
              scoreChanger = ScoreChangerEnum.GAME;
              player2GamesWon += 1;
              player2GameScore = GameScoreEnum.LOVE;
              player1GameScore = GameScoreEnum.LOVE;
            }
            else
            {
                if (player2GameScore == GameScoreEnum.LOVE)
                  player2GameScore = GameScoreEnum.FIFTEEN;
                else if (player2GameScore == GameScoreEnum.FIFTEEN)
                  player2GameScore = GameScoreEnum.THIRTY;
                else if (player2GameScore == GameScoreEnum.THIRTY)
                  player2GameScore = GameScoreEnum.FORTY;
            }
            
            if (player2GamesWon >= 6 && (player2GamesWon - player1GamesWon) >= 2 && scoreChanger == ScoreChangerEnum.GAME)
            {
               scoreChanger = ScoreChangerEnum.SET;
               if (player2SetsWon == 2)
               {
                 scoreChanger = ScoreChangerEnum.MATCH;
                 player2MatchWon = true;
                 player2GamesWon = 0;
                 player1GamesWon = 0;
                 player2SetsWon += 1;
                }
                else
                {
                    player2GamesWon = 0;
                    player1GamesWon = 0;
                    player2SetsWon += 1;
                    player2GameScore = GameScoreEnum.LOVE;
                    player1GameScore = GameScoreEnum.LOVE;
                }
            }
    
            PrintScores();
        }
        return scoreChanger;
        
    }
    
    public ScoreChangerEnum Player1Scores()
    {
        ScoreChangerEnum scoreChanger = ScoreChangerEnum.NONE;
        


        return scoreChanger;
    }

  public ScoreChangerEnum Player1Scores()
    {
        ScoreChangerEnum scoreChanger = ScoreChangerEnum.NONE;
        


        return scoreChanger;
    }
    
    private void PrintScores()
    {
       System.out.println("Game Score " + player1GameScore + "/" + player2GameScore); 
       System.out.println("Games " + player1GamesWon + "/" + player2GamesWon);  
       System.out.println("Sets " + player1SetsWon + "/" + player2SetsWon);
       System.out.println("Match " + player1MatchWon + "/" + player2MatchWon);
       System.out.println("Game Score " + player2GameScore + "/" + player1GameScore); 
       System.out.println("Games " + player2GamesWon + "/" + player1GamesWon);  
       System.out.println("Sets " + player2SetsWon + "/" + player1SetsWon);
       System.out.println("Match " + player2MatchWon + "/" + player1MatchWon);
       
    }
    
    public Player getPlayer1()
    {
        return this.player1;
    }
    
    public Player getPlayer2()
    {
        return this.player2;
    }
   
    
    public boolean getPlayer1MatchWon()
    {
       return this.player1MatchWon;
    }
    
    public boolean getPlayer2MatchWon()
    {
       return this.player2MatchWon;
    }
    
    public int getPlayer1SetsWon()
    {
      return this.player1SetsWon;
    }
    
    public int getPlayer2SetsWon()
    {
      return this.player2SetsWon;
    }
    
    public int getPlayer1GamesWon()
    {
     return this.player1GamesWon;
    }
    
     public int getPlayer2GamesWon()
    {
     return this.player2GamesWon;
    }
    
    public GameScoreEnum getPlayer1GameScore()
    {
     return this.player1GameScore;
    }
    
    public GameScoreEnum getPlayer2GameScore()
    {
     return this.player2GameScore;
    }
    
    public String toString()
    {
      return 
             + ": player1MatchWon " + this.getPlayer1MatchWon()
             + ": player2MatchWon " + this.getPlayer2MatchWon()
             + ": player1SetsWon  " + this.getPlayer1SetsWon()
             + ": player2SetsWon  " + this.getPlayer2SetsWon()
             + ": Player1GamesWon " + this.getPlayer1GamesWon()
             + ": player2GamesWon " + this.getPlayer2GamesWon()
             + ": player1GameScore" + this.getPlayer1GameScore()
             + ": player2GameScore" + this.getPlayer2GameScore();
    }
}  
    
  