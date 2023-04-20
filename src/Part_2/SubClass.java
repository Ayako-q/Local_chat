package Part_2;

// 2.1.1 Create child class
public class SubClass extends BaseClass
{
    public void print(int i, int b)
    {
        System.out.println("This is a Part_2.SubClass instance, overload example: " + i + "." + b);
    }

    // 2.1.5 @Override
    @Override
    public void printOverride()
    {
        System.out.println("This is sub class");
    }
    // 2.1.6 'super' keyword
    @Override
    public void superTest()
    {
        super.superTest();
        System.out.println("'super' keyword : success!");
    }

    // 2.1.7 'super()'
    public SubClass() {
        super(); // calling the default constructor of ParentClass
        System.out.println("Default constructor of ChildClass");
    }

    public SubClass(String keyword) {
        super(keyword); // calling the default constructor of ParentClass
        System.out.println("non-default constructor of ChildClass " + keyword);
    }
}
