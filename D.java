// Lec 42(Static Variable):
class Mobile
{
    // Instance Variable
    String brand;
    int price;
    // "static is Used to make common for all value
    static String name;
    // Make a method so it will print everything:
    public void show()
    //Above method is the instance method bcoz static is not used here.
    {
        // Variable inside method is called local variable.
        System.out.println(brand + ":" +price + ":" + name + ":");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        /*Static variable can call with "obj" but avoide it &
        "classname" too(here classname->Mobile)*/
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        // obj1.name = "Smart Phone";
        // If static mark call it by class name.
        Mobile.name = "Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 30000;
        Mobile.name = "Smart Phone";

        // obj1.name = "Phone"; //Change both the objects if static mark.
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}
