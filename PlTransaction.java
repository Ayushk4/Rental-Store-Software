public class PlTransaction
{
    int id;
    String activity;
    int amount;
    public PlTransaction(String activity,int amount)
    {
        this.id=transactionIdGenerator.plID;
        transactionIdGenerator.plID+=1;
        this.activity=activity;
        this.amount=amount;
    }
    public PlTransaction(int ID,String activity,int amount)
    {
        this.id=transactionIdGenerator.plID;
        transactionIdGenerator.plID+=1;
        this.activity=activity;
        this.amount=amount;
    }
}