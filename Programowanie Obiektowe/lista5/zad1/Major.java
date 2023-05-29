/*
 * Karolina Jędraszek
 * lista 5 zad 1
 * Windows vs code, openjdk version 17.0.6
 */
public class Major implements Ordered
{
    @Override
    public int get_order()
    {
        return 4;
    }

    @Override
    public int compareTo(Ordered toCompare)
    {
        return Integer.compare(this.get_order(), toCompare.get_order());
    }

}