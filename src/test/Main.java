import src.DataClass.*;

public class Main 
{
    public static void main(String[] args) 
    {
        // BTS test = new BTS();

        // int temp = test.MidSearch(3, 2);
        
        // System.out.println(temp);

        node n1 = new node(1, (short)1, (short)1);
        node n2 = new node(2, (short)2, (short)1);
        node n3 = new node(3, (short)3, (short)1);
        node n4 = new node(3, (short)3, (short)2);
        node n5 = new node(5, (short)4, (short)1);

        BTS bts = new BTS();
        
        bts.add(n4);
        bts.add(n1);
        bts.add(n2);
        bts.add(n5);
        bts.add(n3);

        bts.sort();

        int temp = bts.search(n4);
        System.out.println(temp);

        node NewNode_1 = new node(4, (short)4, (short)1);
        bts.Edit( n1, NewNode_1);
        System.out.println(bts.search(NewNode_1));

        node NewNode_2 = new node(6, (short)4, (short)1);
        bts.Edit( 3, NewNode_2);
        System.out.println(bts.search(NewNode_2));

        return;
    }
}
