/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bedant
 */
import java.sql.*;
import java.util.Date;

public class testmain {
    public static void main(String[] args)
    {
        Rentalstore rstore=new Rentalstore();
        Connection con=rstore.makeConnection();
        try{
        rstore.createTables(con);
        }
        catch(Exception e){
            System.out.println("not created");
        }
        Inventory obj=new Inventory();
        
        try
        {
            rstore.populateLists(con,obj);
            //System.out.println("try");
        }
        catch(Exception e)
        {
            System.out.println("exc");
        }
        
        for(int i=0;i<Account.plAccount.size();i++)
            System.out.println(Account.plAccount.get(i).getActivity());
    }
    
}
