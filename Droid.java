public class Droid{
    String name;
    int batterylevel;
    String task;
  
  
    public Droid(String droidName){
      name = droidName;
      batterylevel = 100;
    }
    public String toString(){
      return "Hello , I'm the droid: "+name;
    }
  
    public void performTask(String task){
      System.out.println(name+" is performing task: "+task);
  
      batterylevel = batterylevel -10;
    }
  
    public void energyReport(){
      System.out.println(batterylevel);
    }
    
  
    public static void main(String args[]){
  
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("Dancing");
    }
  
  
  
  }