//import library of java date
import java.util.Date;

public class Transaction 
{
    private int id;//Transaction ID
    private String customer_name;//nane of customer involved in transaction
    private String cd_name;//nane of CD involved in transaction
    private Date date;//date of transaction

    //Consructor invoked when a new transaction takes place
    public Transaction(String cust_name,String cd_name)
    {
        this.id=transactionIdGenerator.transactionID;
        transactionIdGenerator.transactionID+=1;
        this.cd_name=cd_name;
        this.customer_name=cust_name;
        this.date=new Date();
    }
    
    //Consructor invoked when a transaction is loaded from database
    public Transaction(int ID,String cust_name,String cd_name,Date date)
    {
        this.id=ID;
        transactionIdGenerator.transactionID+=1;
        this.cd_name=cd_name;
        this.customer_name=cust_name;
        this.date=date;
    }
    
    public int getID()
    {
        return id;
    }
    public String getCd_Name()
    {
        return cd_name;
    }
    public Date getDate()
    {
        return date;
    }
    public String getCustomer()
    {
        return customer_name;
    }
}





