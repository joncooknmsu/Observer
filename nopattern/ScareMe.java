//
// ScareMe: Main driver class for Observer example
//
public class ScareMe
{

public static void main(String args[])
{
   Ghost ghost1, ghost2;
   Person jon, jane, joseph;
   // create a couple of ghosts
   ghost1 = new Ghost("Casper");
   ghost2 = new Ghost("Homer");
   // create three persons
   jon = new Person("Jon");
   jane = new Person("Jane");
   joseph = new Person("Joseph");
   // perform some actions
   ghost1.beScary(jon);
   ghost2.beScary(jane);
   ghost1.beScary(joseph);
   ghost2.beScary(jon);
}

}
