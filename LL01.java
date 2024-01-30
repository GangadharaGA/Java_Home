public class LL01 {
    
    static Node head=null;

    class Node{

        int data;
        Node next;

        Node(int item)
        {
            data=item;
            next=null;
        }
    }

    void insert(int item)
     {
        Node temp=new Node(item);
        if(head==null)
        {
            head=temp;
            return;
        }

        temp.next=head;
        head=temp;
  
     }

     void display(Node head)
     {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
     }


   
        public static void main(String[] args) {

            LL01 list=new LL01();
            list.insert(10);
            list.insert(9);
            list.insert(8);

            list.display(head);


           
        }
    


}
