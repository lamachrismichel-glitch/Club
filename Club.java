import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version 7.0
 */
public class Club
{
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
       members = new ArrayList<>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    public int joinedInMonth(int month)
    {
     if(month < 1 || month > 12)
     {
        System.out.println("Month cannot be outside of range 1-12");
        return 0;
     }
     else {
       int count = 0;
       for ( Membership m : members)
       {if(m.getMonth() == month)
           {
            count++;
           }
       }
       return count;
     }

    }
    public ArrayList<Membership> purge(int month, int year)
    {
         if(month < 1 || month > 12)
     {
        System.out.println("invalid month");
        return null;
     } else  if (year<1950 || year>2026 )
     {
         System.out.println("invalid year");
         return null;  
     }else{
        ArrayList<Membership> purgeList = new ArrayList<>();
        for (Membership m : members)
        {if(m.getMonth()==month && m.getYear()==year)
            {
                purgeList.add(m);
            }
        }
        return purgeList;
        }
         
        }
     }
    
    
    


