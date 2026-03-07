

public class AIModel
{
    //instance variables
    private String modelName;
    private double price; //price per 1 lakh (100000) tokens
    private int parameterCount;
    private int contextWindow;
    
    //constructor
    public AIModel(String name, double price, int parameter, int context)
    {
        this.modelName=name;
        this.price=price;
        this.parameterCount=parameter;
        this.contextWindow=context;
    }
    
    //getters
    public String getModelName(){
        return this.modelName;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public int getParameterCount(){
        return this.parameterCount;
    }
    
    public int getContextWindow(){
        return this.contextWindow;
    }
    
    //setters
    public void setModelName(String name){
        this.modelName=name;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public void setParameterCount(int count){
        this.parameterCount=count;
    }
    
    public void setContextWindow(int context){
        this.contextWindow=context;
    }
    
    
    //displaying details
    public String displayDetails(){
        System.out.println("Model Name:"+this.modelName+"\nPrice: "+this.price+"\nParameter count"+this.parameterCount+"\nContext Window: "+this.contextWindow);
        return "Model Name:"+this.modelName+"\nPrice: "+this.price+"\nParameter count"+this.parameterCount+"\nContext Window: "+this.contextWindow;
    }
    
}