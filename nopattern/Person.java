//
// Person: 
//
public class Person
{

// our own class data
private String name;

// constructor
public Person(String name)
{
   this.name = name;
}

@Override
public String toString()
{
   return name;
}

public void beScaredBy(Ghost ghost)
{
   System.out.println(name + " is scared by " + ghost + "!");
}

}

