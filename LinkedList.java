public class LinkedList{
    public int val;
    public LinkedList next;

    public LinkedList(int x){
        val=x;
    }


    public static void main(String[] args) {
        LinkedList l1=new LinkedList(3);
        LinkedList l2=new LinkedList(4);
        LinkedList l3=new LinkedList(5);

        l1.next=l2;
        l2.next=l3;
        l3.next=null;

        LinkedList head=l1;
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        
    }
}