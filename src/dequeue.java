import java.util.*;

public class dequeue
{
    public static String Game(ArrayDeque<Integer> first, ArrayDeque<Integer> second)
    {
        int counter=0;
        while(counter<=106)
        {
            if(first.size()==0)
            {
                return "\nКоличество ходов: "+counter+"\nsecond";
            }
            else if(second.size()==0)
            {
                return "\nКоличество ходов: "+counter+"\nfirst";
            }
            else
            {
                counter++;
                int f = first.peek();
                int s = second.peek();
                first.removeFirst();
                second.removeFirst();
                if (f!=0 && s!=0)
                {
                    if (f > s)
                    {
                        first.add(f);
                        first.add(s);
                    }
                    else
                    {
                        second.add(s);
                        second.add(f);
                    }
                }
                else if(f == 9 || s==9)
                {
                    if (f == 0)
                    {
                        first.add(f);
                        first.add(s);
                    }
                    else if (s==0)
                    {
                        second.add(s);
                        second.add(f);
                    }
                }
                else
                {
                    if (s == 0)
                    {
                        first.add(f);
                        first.add(s);
                    }
                    else
                    {
                        second.add(s);
                        second.add(f);
                    }
                }
            }
        }
        return "\nbotva";
    }
}