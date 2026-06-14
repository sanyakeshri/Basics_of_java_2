// Lec 45(Encapsulation):
// "private-variables" only access by "methods"
class Human
{
    int age;
    // public int age = 11;
    String name;
    // public String name = "Navin";

// THESE ABOVE " PUBLIC " VARIABLES ARE USED ONLY BY IT'S METHOD AS BELOW.
    // inside the method of the same class we can access it.
    public int getAge()
    {
        return age;
    }
    // If value not given then we set the value in "Age" and "name".

    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }
    // Set name to String:

    public void setName(String n)
    {
        name = n;
    }
}
class Demo
{
    public static void main(String[]args)
    {
        Human obj = new Human();
        // obj.Age = 11;
        // obj.name = "Navin";

        // for set's value assinging values:
        obj.setAge(30);
        obj.setName("Navin Readdy");

        // System.out.println(obj.name);

        // method are marked "public" so we can't access it directly:
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}