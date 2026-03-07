
public class ProPlan extends AIModel
{
   
    private int availableSlots;
    
    private int maximumSlots;
    
    public ProPlan(String name, double price, int parameter, int context,int slots)
    {
        super(name,price,parameter,context);
        this.availableSlots=slots;
        this.maximumSlots=slots;
    }

    //adding teammebers
    public int addMember(int member){
        if(member<=0){
            System.out.print("Please enter a valid number of members to remove.");
        }
        else if(this.availableSlots>=member){
            this.availableSlots-=member;
            System.out.println("Successfully added "+member+" number of members.\nRemaining Slots: "+this.availableSlots);
            
        }
        else{
            System.out.print("The number of slots has exceeded, please remove purchase more slots or remove a member.");
        }
        return this.availableSlots;
    }
    
    //removing member
    public int removeMember(int member){
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
        return this.availableSlots;
    }
    
    public int increaseMax(int slot){
        this.maximumSlots+=slot;
        System.out.println("Succesfully increased maximum slots to "+this.maximumSlots);
        return this.maximumSlots;
    }
    //displaying details
    @Override
    public String displayDetails(){
        return super.displayDetails() +
        "\nMembers: "+this.availableSlots;
    }
}