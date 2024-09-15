public interface Introducible
{
    void introduce(); // public by default
    String INTRODUCTION = "My name is "; //public, final, static by default
    static void familyNameGreeting(String surname)
    {
        System.out.println("Hello " + surname + "!");
    }
    private String concatenateGreeting(String surname)
    {
        return "Hello " + surname + "!";
    }
}