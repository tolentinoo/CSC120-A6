import java.util.Hashtable;


/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library() {
      super(getName(), getAddress(), getFloors())
      System.out.println("You have built a library: 📖");
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }