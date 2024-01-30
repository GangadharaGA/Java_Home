class Node{

    String data;
    Node nxt;

    Node(String item)
    {
        this.data=item;
        this.nxt=null;
    }

}

public  void addnode(String item)
{
    Node temp=new Node(item);
    if(temp.nxt==null)
    {
        temp.nxt=head;
        
    }
}


public class LL {
    

    public static void main(String[] args) {
        
    }
}
