//class name and products
public class Droid{
  String name;
  int batteryLevel;

  //constructor method
  public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
  }
  //toString method
  public String toString(){
    return "Hello! I'm the droid: " + name + "!";
  }
  //task method
  public String performTask(String task){
    return name + " is performing task: " + task +". Starting right now.";
  }
  //method - after typical performance, battery is decreasing by the set amount
  public void batteryOptimalUse(){
    batteryLevel -= 10;
  }
  //claiming an energyReport, available for user to obtain
  public String energyReport(){
    return "Current energy level of droid named " + name + " is " + batteryLevel + " %.";
  }
  //method used to change batteries between droids
  public void energyTransfer(int y){
        int temp = this.batteryLevel;
        this.batteryLevel = y;
        y = temp;
        System.out.println("Batteries had been changed between selected droids.");
      // return "Batteries had been changed between selected droids.\n Battery Level : " + batteryLevel1;
  }
  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    Droid Wankel = new Droid("Wankel");
    //System.out.println(Codey.name + " " + Codey.batteryLevel);
    System.out.println(Codey.toString());
    System.out.println(Codey.performTask("dance"));
    Codey.batteryOptimalUse();
    System.out.println(Codey.performTask("swim"));
    Codey.batteryOptimalUse();

    Codey.energyTransfer(Wankel.batteryLevel);

    System.out.println(Codey.energyReport());

  }

}
