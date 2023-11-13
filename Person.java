//
// Person: concrete observer class
//
public class Person implements Observer 
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

// Observer API: receive a subject notification
public void update(String id)
{
   System.out.println(name + " is scared by " + id + "!");
}

}

