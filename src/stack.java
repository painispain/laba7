import java.util.*;

public class stack
{
    public static String Game(Stack<Integer> first, Stack<Integer> second)
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
                first.pop();
                second.pop();
                if (f!=0 && s!=0)
                {
                    if (f > s)
                    {
                        first=(Stack<Integer>)Add(first, f,s).clone();
                    }
                    else
                    {
                        second=(Stack<Integer>)Add(second, s,f).clone();
                    }
                }
                else if(f == 9 || s==9)
                {
                    if (f == 0)
                    {
                        first=(Stack<Integer>)Add(first, f,s).clone();
                    }
                    else if (s==0)
                    {
                        second=(Stack<Integer>)Add(second, s,f).clone();
                    }
                }
                else
                {
                    if (s == 0)
                    {
                        first=(Stack<Integer>)Add(first, f,s).clone();
                    }
                    else
                    {
                        second=(Stack<Integer>)Add(second, s,f).clone();
                    }
                }
            }
        }
        return "\nbotva";
    }
    public static Stack Add(Stack stack, int o, int t) {
        Stack temp = new Stack<>();
        Stack<Integer> copied = (Stack<Integer>)stack.clone();
        Integer[] str = new Integer[copied.size()];
        temp.push(t);
        temp.push(o);
        for(int i=stack.size()-1;i>=0;i--)
        {
            str[i]=copied.pop();
        }
        for(int i=0;i< str.length;i++)
        {
            temp.push(str[i]);
        }
        return temp;
    }
}