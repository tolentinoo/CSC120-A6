/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {

  private ArrayList <String> residents;
  private boolean hasDiningRoom;


  public House(String name, String address, int nFloors, boolean hasDR) {
    super( name, address, nFloors); //belongs to house we're making using the attributes of Building
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");

  }
  public boolean hasDiningRm(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
   }

  /**
   * @param name
   */

  public void moveIn(String name){
    this.residents.add(name);
   }
  
  /**
  * @param name
  * @return
 */

  public String moveOut(String name) {
    this.residents.remove(name);
    return (name);
  }

  /**
   * @param person
   * @return
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
    
  }

  public static void main(String[] args) {
    House Cushing = new House("Cushing House", "1 Paradise Rd Northampton, MA 01063", 5, true );
    System.out.println(Cushing);
    System.out.println(Cushing.hasDiningRoom);
    Cushing.moveIn("Rachel");
    System.out.println(Cushing.nResidents());
    Cushing.moveIn("Taylor");
    System.out.println(Cushing.nResidents());
    System.out.println(Cushing.isResident("Taylor"));
    System.out.println(Cushing.moveOut("Taylor"));
    System.out.println(Cushing.nResidents());

  }

}