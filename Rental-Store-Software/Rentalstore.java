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
public class Rentalstore 
{
    public Connection makeConnection()
    {        
        try
        {
            String host = "jdbc:mysql://localhost:3306/newdb";
            String uName = "newuser";
            String uPass= "password";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection( host, uName, uPass );
                //Class.forName("com.mysql.jdbc.Driver");// or may be it is "org.apache.derby.jdbc.EmbeddedDriver"? Not sure. Check the correct name and put it here.
                return con;
           
    //handle exception
            
            
            
        }
        catch ( Exception err ) 
        {
            System.out.println( err.getMessage( ) );
            //System.out.println("catch");
            return null;
        }   
    }
    
    public void createTables(Connection conn) throws Exception
    {
        String sqlCreate = "CREATE TABLE IF NOT EXISTS membertab"
            + "  (NAME          VARCHAR(40),"
            + "   ADDRESS       VARCHAR(40),"
            + "   AGE       INTEGER,"
            + "   ISPREMIUM           BOOLEAN,"
            + "   MUSIC           INTEGER,"
            + "   VIDEO     INTEGER)";
        Statement stmt = conn.createStatement();
        //System.out.println("bef");
        stmt.execute(sqlCreate);
        //System.out.println("aft");
            
        sqlCreate = "CREATE TABLE IF NOT EXISTS itemtab"
            + "  (NAME          VARCHAR(40),"
            + "   DOP       DATE,"
            + "   DOLA       DATE,"
            + "   RENTAL           INTEGER,"
            + "   COST           INTEGER,"
            + "   ISSUEDONCE     BOOLEAN,"
            + "   TYPE     VARCHAR(40),"
            + "   FORMAT     VARCHAR(40),"
            +"     STATUS    BOOLEAN);";
        stmt = conn.createStatement();
        //System.out.println("bef");
        stmt.execute(sqlCreate);
        //System.out.println("aft");
        
        sqlCreate = "CREATE TABLE IF NOT EXISTS placcounttab"
            + "  (ID          INTEGER,"
            + "   ACTIVITY       VARCHAR(400),"
            + "   AMOUNT      INTEGER,"
            + "   DATE           DATE)";
        stmt = conn.createStatement();
        stmt.execute(sqlCreate);
        
        sqlCreate = "CREATE TABLE IF NOT EXISTS recordstab"
            + "  (ID          INTEGER,"
            + "   CUSTOMER       VARCHAR(40),"
            + "   ITEM      VARCHAR(40),"
            + "   DATE           DATE)";
        stmt = conn.createStatement();
        stmt.execute(sqlCreate);
        //System.out.println("done");
    }
    
    public void populateLists(Connection con,Inventory inventoryobj) throws Exception
    {
        String query;
        ResultSet rs;
        Statement stmt=con.createStatement();

        query="SELECT * FROM membertab";
        System.out.println("done1");
        rs=stmt.executeQuery(query);
//error
        if(!rs.next())
        {
            //no book found dialog
        }
        else
        {
            do
            {
                String name=rs.getString("NAME");
                String address=rs.getString("ADDRESS");
                int age=rs.getInt("AGE");
                boolean isPremium=rs.getBoolean("ISPRIMIUM");
                int music_cds_issued=rs.getInt("MUSIC");
                int video_cds_issued=rs.getInt("VIDEO");
                Member m=new Member(isPremium,name,age,address,video_cds_issued,music_cds_issued);
                MemberList.memberList.add(m);
            }
            while(rs.next());
        }
        
        
        query="SELECT * FROM itemtab";
        rs=stmt.executeQuery(query);
        System.out.println("done2");
        if(!rs.next())
        {
            //no book found dialog
        }
        else
        {
            do
            {
                String itemName=rs.getString("NAME");
                Date dateOfProcurement=new Date(rs.getDate("DOP").getTime());
                Date dateOfLastActivity=new Date(rs.getDate("DOLA").getTime());
                int rentalPrice=rs.getInt("RENTAL");
                int costPrice=rs.getInt("COST");
                boolean issuedOnce=rs.getBoolean("ISSUEDONCE");
                String itemType=rs.getString("TYPE");
                String itemFormat=rs.getString("FORMAT");
                Boolean itemStatus=rs.getBoolean("STATUS");
                //String customer=rs.getString("CUSTOMER");
                Item it=new Item(itemName,dateOfProcurement,dateOfLastActivity,rentalPrice,costPrice,issuedOnce,itemType,itemFormat,itemStatus);
                inventoryobj.itemsList.add(it);
            }
            while(rs.next());
        }
        
        query="SELECT * FROM placcounttab";
        rs=stmt.executeQuery(query);
        System.out.println("done3");
        
        if(!rs.next())
        {
             
            //no book found dialog
        }
        else
        {
            do
            {
                //System.out.println("indo");
                int ID=rs.getInt("ID");
                String activity=rs.getString("ACTIVITY");
                int amount=rs.getInt("AMOUNT");
                //Date dateOfIssue=new Date(rs.getDate("DATE").getTime());
                Date date=new Date(rs.getDate("DATE").getTime());
                PlTransaction tr=new PlTransaction(ID,activity,amount,date);
                Account.plAccount.add(tr);
            }
            while(rs.next());
        }  
        
        query="SELECT * FROM recordstab";
        System.out.println("done4--");
        rs=stmt.executeQuery(query);
        System.out.println("done4");
        
        if(!rs.next())
        {
            //no book found dialog
        }
        else
        {
            do
            {
                int ID=rs.getInt("ID");
                String customer_name=rs.getString("CUSTOMER");
                String item_name=rs.getString("ITEM");
                Date dateOfIssue=new Date(rs.getDate("DATE").getTime());
                
                Transaction tr=new Transaction(ID,customer_name,item_name,dateOfIssue);
                Records.records.add(tr);
            }
            while(rs.next());
        }  
    }
     
    public void update_db(Connection con,Inventory inventoryobj ) throws Exception
    {
        String template="DELETE FROM membertab";
        PreparedStatement stmts = con.prepareStatement(template);
        stmts.executeUpdate();
        
        template="DELETE FROM itemtab";
        stmts = con.prepareStatement(template);
        stmts.executeUpdate();
        
        template="DELETE FROM placcounttab";
        stmts = con.prepareStatement(template);
        stmts.executeUpdate();
        
        template="DELETE FROM recordstab";
        stmts = con.prepareStatement(template);
        stmts.executeUpdate();
        
        for(int i=0;i<MemberList.memberList.size();i++)
        {
            template = "INSERT INTO membertab (NAME,ADDRESS,AGE,ISPREMIUM,MUSIC,VIDEO) values (?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(template);

            stmt.setString(1,MemberList.memberList.get(i).getName());
            stmt.setString(2,MemberList.memberList.get(i).getAddress());
            stmt.setInt(3,MemberList.memberList.get(i).getAge());
            stmt.setBoolean(4,MemberList.memberList.get(i).getIsPremium());
            stmt.setInt(5,MemberList.memberList.get(i).getMusic());
            stmt.setInt(6,MemberList.memberList.get(i).getVideo());
            
            
            stmt.executeUpdate();
        }
        
        for(int i=0;i<inventoryobj.itemsList.size();i++)
        {
            template = "INSERT INTO itemtab (NAME,DOP,DOLA,RENTAL,COST,ISSUEDONCE,TYPE,FORMAT,STATUS) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(template);
//java.sql.Date sqlDate = new java.sql.Date(now.getTime());

            
            java.sql.Date sqlDateOfPurchase = new java.sql.Date(inventoryobj.itemsList.get(i).getDateOfPurchase().getTime());
            java.sql.Date sqlDateOfLastActivity = new java.sql.Date(inventoryobj.itemsList.get(i).getDateOfLastActivity().getTime());

            stmt.setString(1,inventoryobj.itemsList.get(i).getItemName());
            stmt.setDate(2,sqlDateOfPurchase);
            stmt.setDate(3,sqlDateOfLastActivity);
            stmt.setInt(4,inventoryobj.itemsList.get(i).getRentalPrice());
            stmt.setInt(5,inventoryobj.itemsList.get(i).getCostPrice());
            stmt.setBoolean(6,inventoryobj.itemsList.get(i).getIssuedOnce());
            stmt.setString(7,inventoryobj.itemsList.get(i).getItemType());
            stmt.setString(8,inventoryobj.itemsList.get(i).getItemFormat());
            stmt.setBoolean(9,inventoryobj.itemsList.get(i).getItemStatus());
            
            
            stmt.executeUpdate();
        }
        
        for(int i=0;i<Account.plAccount.size();i++)
        {
            template = "INSERT INTO placcounttab (ID,ACTIVITY,AMOUNT) values (?,?,?)";
            PreparedStatement stmt = con.prepareStatement(template);

            stmt.setInt(1,Account.plAccount.get(i).getID());
            stmt.setString(1,Account.plAccount.get(i).getActivity());
            stmt.setInt(1,Account.plAccount.get(i).getAmount());
            
            stmt.executeUpdate();
        }
        
        for(int i=0;i<Records.records.size();i++)
        {
            template = "INSERT INTO recordstab (ID,CUSTOMER,ITEM,DATE) values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(template);

            java.sql.Date sqlDate = new java.sql.Date(Records.records.get(i).getDate().getTime());
            
            stmt.setInt(1,Records.records.get(i).getID()); 
            stmt.setString(2,Records.records.get(i).getCustomer());
            stmt.setString(3,Records.records.get(i).getCd_Name());
            stmt.setDate(4,sqlDate);
            
            
            stmt.executeUpdate();
        }
    }
}
