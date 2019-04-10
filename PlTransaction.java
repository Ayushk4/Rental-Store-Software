import java.util.Date;

public class PlTransaction
{
    int id;
    String activity;
    Date plDate;
    int amount;
    public PlTransaction(String activity,int amount)
    {
        this.id=transactionIdGenerator.plID;
        transactionIdGenerator.plID+=1;
        this.activity=activity;
        this.amount=amount;
        this.plDate = new Date();
    }
    public PlTransaction(int ID,String activity,int amount, Date date)
    {
        this.id=transactionIdGenerator.plID;
        transactionIdGenerator.plID+=1;
        this.activity=activity;
        this.amount=amount;
        this.plDate = date;
    }
}