
public class Player
{
    public enum HandedEnum {LEFT,RIGHT};
    private String firstName = "";
    private String lastName = "";
    private int seed = 0;
    private HandedEnum handed = HandedEnum.RIGHT;
    
    public Player()
    {
        
    }
    
    public Player(String firstName, String lastName, int seed)
    {
       CreatePlayer(firstName, lastName, seed, HandedEnum.RIGHT);
    }
    
    public Player(String firstName, String lastName, int seed, HandedEnum handed)
    {
        CreatePlayer(firstName, lastName, seed, handed);
    }
    
    private void CreatePlayer(String firstName, String lastName, int seed, HandedEnum handed)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.seed = seed;
        this.handed = handed;
    }

   
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName ()
    {
      return this.lastName;
    }
    
    public void setLastName (String lastName)
    {
      this.lastName = lastName;
    }
     
    public int getSeed ()
    {
     return this.seed;
    }
 
    public void setSeed (int seed)
    {
     this.seed = seed;
    }
    
}