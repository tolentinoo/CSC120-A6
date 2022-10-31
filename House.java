/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {

  ArrayList <String> residents;
  boolean hasDiningRoom;


  public House(String name, String address, int nFloors, boolean hasDR) {
    super( name, address, nFloors); //belongs to house we're making using the attributes of Building
    this.hasDiningRoom = hasDR;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");

  }
  public boolean hasDiningRoom();{
    this.
  }

  public int nResidents();{

  }
  /**
   * @param name
   */

  public void moveIn(String name){

  }
  
  /**
   * @param name
   * @return
   */

  public String moveOut(String name); {

  }

  

  public static void main(String[] args) {
    House Cushing = new House("Cushing House", "1 Paradise Rd Northampton, MA 01063", 5, true );
    System.out.print(Cushing);
  }

}