

public class PersonalPlan extends AIModel
{
    // instance variables - replace the example below with your own
    private int monthlyQuota;
   
    public PersonalPlan(String name, double price, int parameter, int context,int quota)
    {
        super(name,price,parameter,context);
        this.monthlyQuota=quota;
    }
    
    //using a prompt
    //WIP
    public int prompt(String promptText, int expectedOutputLength){
        //trims white space around prompt
        String trimmed = promptText.trim();
        //splits into array based on space
        String[] splitArray = trimmed.split("\\s+");
        //gets array length
        int inputTokens = splitArray.length;
        
        //calculates usage by addidng input token and expected token length
        int usage =  inputTokens + expectedOutputLength;
        
        
        if (usage > super.getContextWindow()){
            System.out.println("Error:hm prompt exceeds context window size of tokens");
        }
        else if(this.monthlyQuota<= 0){
            System.out.println("Monthly plan limit has been reached, please buy more prompts or upgrade to Pro Plan");
        }
        else{
            this.monthlyQuota--;
            System.out.println("Token usage: " + usage);
            System.out.println("Remaining Outputs: " + this.monthlyQuota);
        }
        return this.monthlyQuota;
    }
    
    //getter/accessor 
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
    public String displayDetails(){
        return super.displayDetails() +
        "\nMonthly Quota: "+this.monthlyQuota;
    }
}