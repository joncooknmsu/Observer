## Observer Pattern

This code is an example of using the Observer design pattern to implement
a non-hardcoded interaction between objects that change (subjects) and
objects that need to know about the change (observers).

The basic interaction is Ghosts (subjects) scaring Persons (observers).
Notice in the code that neither the Ghost class nor the Person class
_know about each other_. This is the beauty of the Observer pattern.

In the "nopattern" folder is the _almost-same_ code without the Observer
pattern. In this version the Ghost class and the Person class use each 
other directly and are thus tightly coupled.

Usage: 
~~~
javac *.java
java ScareMe
~~~

