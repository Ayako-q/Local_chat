package Part_2;

public class Main
{
    public static void main(String[] args)
    {
        // 2.1.2 Demonstrate possibility to create instance of subclass while declaring it as of type of superclass
        BaseClass classTest = new SubClass();
        classTest.print(4);
        System.out.println(classTest.getClass());
        /* I create a new object but declaring it as a type of superclass above
        I dont receive any error assigning subclass object to a variable of its superclass type
        because of polymorphism, it allows an object of a subclass to be treated as an object of its superclass
         */
        // 2.1.3
        SubClass sub = new SubClass();
        System.out.println("\nPart 2.1.3, accessing Base class variables, protected bul - " + sub.bul.toString());
        System.out.println("Accessing public int i variable of Part_2.BaseClass - " + sub.i);
        System.out.println("We can access public and protected variables of superclass, but not private");
        /*
        2.1.3
        sub.str.toLowerCase(); can't be accessed
        private variables are only visible within
        the class in which they are declared, and
        not in any other classes, including subclasses.
        */

        // 2.1.4 overload example
        System.out.println("\nPart 2.1.4 Overload example");
        sub.print(5); // method from Part_2.BaseClass with only int i parameter
        sub.print(5,1); // method from Part_2.SubClass with int i and int b parameters

        // 2.1.5 @Override
        System.out.println("\nPART 2.1.5");
        BaseClass base = new BaseClass();
        SubClass sub2 = new SubClass();
        BaseClass asChild = new SubClass();
        // Checking if everything is as we need it to be
        base.printOverride();
        sub2.printOverride();
        asChild.printOverride();

        // 2.1.6 'super' keyword
        System.out.println("\nPART 2.1.6");
        sub2.superTest();

        // 2.1.7 'super' keyword for parent constructor code
        System.out.println("\nPART 2.1.7");
        SubClass child = new SubClass();
        SubClass child2 = new SubClass("non - default constructorrr");
    }
}
