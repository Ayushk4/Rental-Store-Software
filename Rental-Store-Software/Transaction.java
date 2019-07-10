
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bedant
 */
public class Transaction 
{
    private int id;
    private String customer_name;
    private String cd_name;
    private Date date;
    public Transaction(String cust_name,String cd_name)
    {
        this.id=transactionIdGenerator.transactionID;
        transactionIdGenerator.transactionID+=1;
        this.cd_name=cd_name;
        this.customer_name=cust_name;
        this.date=new Date();
    }
    
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





