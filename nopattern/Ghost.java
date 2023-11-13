//
// Ghost: a scary class
//
import java.util.*;

public class Ghost
{

// our own class data
private String name;

// constructor: init our data
public Ghost(String name)
{
   this.name = name;
}

@Override
public String toString()
{
   return name;
}

// Ghost action, just for this class
public void beScary(Person person)
{
   // do what we do
   System.out.println("BOO! at " + person);
   // tell the Person that they were scared
   person.beScaredBy(this);
}

}

