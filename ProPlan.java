
public class ProPlan extends AIModel
{
   
    private int availableSlots;
    
    private int maximumSlots;
    
    public ProPlan(String name, double price, int parameter, String context,int slots)
    {
        super(name,price,parameter,context);
        this.availableSlots=slots;
        this.maximumSlots=slots;
    }

    //adding teammebers
    public void addMember(int member){
        if(member<=0){
            System.out.print("Please enter a valid number of members to remove.");
        }
        else if(this.availableSlots>=member){
            this.availableSlots-=member;
            System.out.println("Successfully added "+member+" number of members.\nRemaining Slots: "+this.availableSlots);
            
        }
        else{
            System.out.print("The number of slots has exceeded, please remove a member");
        }
    }
    
    //removing member
    public void removeMember(int member){
        if(member <=0){
            System.out.print("Please enter a valid number of members to remove.");
        }
        else if(this.availableSlots + member <= this.maximumSlots){
            this.availableSlots+=member;
            System.out.println("Successfully decreased "+member+" number of members.\nRemaining Slots: "+this.availableSlots);
        }
        else{
            System.out.println("Maximum Slots is "+this.maximumSlots+ ".\nPlease enter values below it or purchase more slots.");
        }
    }
    
    public void increaseMax(int slot){
        this.maximumSlots+=slot;
        System.out.println("Succesfully increased maximum slots to "+this.maximumSlots);
    }
    //displaying details
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Members: "+this.availableSlots);
    }
}