class Parent
{
    // overridden method
    public void exampleFunction()
    {
        System.out.println("exampleFunction() of Parent called!");
    }
}

class Child extends Parent
{

    // overriding the exampleFunction method of the parent/super class
    @Override
    public void exampleFunction()
    {
        System.out.println("exampleFunction() of Child called!");
    }

    public void callExampleFunction() // this method in the child class
    // has the same name and the same number of parameters as the method
    // in the parent class, and hence, the parent class's method gets overridden
    {
        exampleFunction(); // calling the overridden function from within the child class
        super.exampleFunction(); // using the super keyword to access the parent's version of this function, which was overridden
    }
}

class Main
{
    public static void main(String[] args)
    {
        Child Child1 = new Child();
        Child1.callExampleFunction();
    }
}
