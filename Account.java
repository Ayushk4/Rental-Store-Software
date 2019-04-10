
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bedant
 */
public class Account 
{
    public static List<PlTransaction> plAccount = new ArrayList<>();
    // for storing profit and loss
    public static int calculateIncoming()
    {
        int income=0;
        for(int i=0;i<plAccount.size();i++)
        {
            if(plAccount.get(i).amount>0)
                income+=plAccount.get(i).amount;
        }
        return income;
    }
    public static int calculateOutgoing()
    {
        int outgoing=0;
        for(int i=0;i<plAccount.size();i++)
        {
            if(plAccount.get(i).amount<0)
                outgoing-=plAccount.get(i).amount;
        }
        return outgoing;
    }
    
}
