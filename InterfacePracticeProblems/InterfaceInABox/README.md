Part 1: Packables

Moving houses requires packing all your belongings into boxes. Let's imitate that with a program. The program will have boxes, and items to pack into those boxes. All items must implement the following Interface:

public interface Packable {
    double weight();
}

Create classes Book and CD, which implement the Interface. Book has a constructor which is given the author (String), name of the book (String), and the weight of the book (double) as parameters. CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int). The weight of all CDs is 0.1 kg.

Remember to implement the Interface Packable in both of the classes.

Part 2: Box

Make a class called Box. Items implementing the Packable interface can be packed into a box. The Box constructor takes the maximum capacity of the box in kilograms as a parameter. The combined weight of all items in a box cannot be more than the maximum capacity of the box.

Part 3: Box Weight

If you made an class variable double weight in the Box class, replace it with a method which calculates the weight of the box:

Part 4:  A Box is packable too!

Implementing the Packable Interface requires a class to have the method double weight(). We just added this method to the Box class. This means we can make the Box packable as well!

Boxes are objects, which can contain objects implementing the packable Interface. Boxes implement this Interface as well. So a box can contain other boxes!

Try this out. Make some boxes containing some items, and add some smaller boxes to a bigger box. Try what happens, when you put a box in itself. Why does this happen?





