//
// Ghost: a concrete Subject class
//
import java.util.*;

public class Ghost implements Subject
{

// our own class data
private String name;
// data struct to remember observers
private Vector<Observer> observers;

// constructor: init our data, and create
// (empty) observer collection
public Ghost(String name)
{
   this.name = name;
   observers = new Vector<Observer>();
}

@Override
public String toString()
{
   return name;
}

// Subject API: accept a new observer
public void attach(Observer ob)
{
   observers.add(ob);
}

// Subject API: remove an observer
public void detach(Observer ob)
{
   observers.remove(ob);
}

// Subject API: inform all observers that
// something interesting happened
public void tell(String id)
{
   for (Observer ob: observers) {
      ob.update(id);
   }
}

// Ghost action, just for this class
public void beScary()
{
   // do what we do
   System.out.println("BOO!");
   // but then tell observers about it
   tell(name);
}

}

