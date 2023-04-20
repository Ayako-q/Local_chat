package Part_2;

// 2.1.1 Create a superclass (base class / parent class)
public class BaseClass
{
    // Part 2.1.3 superclass instance variables of different types
    public int i = 2015;
    private String str = "Private String";
    protected Boolean bul = true;
    public void print(int i)
    {
        System.out.println("This is a SuperClass instance " + i);
    }

    // 2.1.5 @Override
    public void printOverride()
    {
        System.out.println("This is base class");
    }

    // 2.1.6 'super' keyword
    public void superTest()
    {
        System.out.println("This is BASECLASS, testing super keyword");
    }

    // 2.1.7
    public BaseClass()
    {
        System.out.println("Default constructor of BaseClass");
    }

    public BaseClass(String keyword)
    {
        System.out.println("non-default constructor of BaseClass " + keyword);
    }
}


