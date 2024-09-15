public class Person implements Introducible
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }

    @Override
    public void introduce()
    {
        System.out.println(INTRODUCTION + name);
    }
}