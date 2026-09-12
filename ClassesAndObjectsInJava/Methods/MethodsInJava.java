class Computer
{
    public void playMusic() // This is a Method
    {
        System.out.println("Playing Music...");
    }

    public String getMeAPen(int cost)
    {
        if (cost >= 10)
            return "Pen";
        return "Nothing";
    }
}

public class MethodsInJava
{
    public static void main(String[] args)
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);
    }
}