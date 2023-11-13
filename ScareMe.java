//
// ScareMe: Main driver class for Observer example
//
public class ScareMe
{

public static void main(String args[])
{
   Ghost ghost1, ghost2;
   Person jon, jane, joseph;
   // create a couple of subjects
   ghost1 = new Ghost("Casper");
   ghost2 = new Ghost("Homer");
   // create three observers
   jon = new Person("Jon");
   jane = new Person("Jane");
   joseph = new Person("Joseph");
   // attach observers to subjects
   ghost1.attach(jon);
   ghost1.attach(jane);
   ghost2.attach(jane);
   ghost2.attach(joseph);
   // create an _anonymous_ observer attached
   // to the ghost2 subject
   ghost2.attach(new Observer() {
      public void update(String id) {
         System.out.println("AnonyMe am NOT scared by " + id + "!");
      }
   });
   // create an anonymous Lambda-function observer
   ghost1.attach((String id) -> {System.out.println("LambdaMe is scared by " + id  + "!");});
   // perform some subject actions
   ghost1.beScary();
   ghost2.beScary();
   // test the removal of observers
   ghost1.detach(jane);
   ghost2.detach(joseph);
   ghost1.beScary();
   ghost2.beScary();
}

}
