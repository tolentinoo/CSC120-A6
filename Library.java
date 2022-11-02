import java.util.Hashtable;


/* This is a stub for the Library class */
public class Library extends Building {
  private  Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super( name, address, nFloors);
      this.collection = new Hashtable<String, Boolean> ();
      System.out.println("You have built a library: 📖");
    }
    public void addTitle(String title){
      this.collection.put(title,true);
    }
    public String removeTitle(String title){
      this.collection.remove(title);
      return title; // return the title that we removed  
    
    } 
    public void checkOut(String title){
      this.collection.replace(title,true,false );
    }
    public void returnBook(String title){
      this.collection.replace(title,false,true );
    }
    public boolean containsTitle(String title){
      return this.collection.containsKey(title);

    }// returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean isAvailable(String title){ 
      return this.collection.containsValue(title);
    }// returns true if the title is currently available, false otherwise
    public void printCollection(){

    } // prints out the entire collection in an easy-to-read way (including checkout status)
    public static void main(String[] args) {
      Library FL = new Library ("Forbes ", "33 Green St Northampton, MA 01063", 4);
      System.out.println(FL);
      FL.addTitle("New Story");
      System.out.println(FL.collection);
    }
  
  }