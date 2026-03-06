

public class PersonalPlan extends AIModel
{
    // instance variables - replace the example below with your own
    private int monthlyQuota;
   
    public PersonalPlan(String name, double price, int parameter, String context,int quota)
    {
        super(name,price,parameter,context);
        this.monthlyQuota=quota;
    }
    
    //getter
    public int getMonthlyQuota(){
        return this.monthlyQuota;
    }
    
    //purchasing prompts
    public void purchasePrompt(int prompt){
        if(prompt<0){
            System.out.println("Please Enter a Valid Postive Number");
        }
        else{
            this.monthlyQuota+=prompt;
            System.out.println("Monthly quota has increased to: "+this.monthlyQuota);
        }
    }
    
    @Override
    //display method
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Monthly Quota: "+this.monthlyQuota);
    }
}