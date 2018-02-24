
public class Event
{

    private Player player1 = new Player();
    private Player player2 = new Player();
    private TennisMatch tennisMatch = new TennisMatch();
    
    public Event()
    {
        
    }
    
    //public void main(String[] args) {
      public void main() {
        player1 = new Player("Max", "Warner", 134);
        player2 = new Player("Amit", "Patel", 156);
        tennisMatch = new TennisMatch (player1, player2);       
        
    }
    
}
