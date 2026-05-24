public class linkedlist_AddRemove {
    Node head;
    class Node{
        String data ;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void add(String data){
     Node newNode= new Node(data);
       if(head==null){
        head=newNode;
        return;
       }
       Node currNode=head;
       while(currNode.next!=null){
        currNode=currNode.next;
       }
       currNode.next=newNode;
    }
    public void lPrint(){
      Node currNode=head;
      while(currNode!=null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
      } 
     
     System.out.print("NULL");
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
      head=head.next;

    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;  //head.next=null -> lastNode.next=null
            return;     //null.next -> give error , so we need this condition
        }
      Node secondLast=head;
      Node lastNode=head.next;
     while(lastNode.next !=null){ 
        lastNode=lastNode.next;
        secondLast=secondLast.next;
     }
     secondLast.next=null;
    }
    
     
    public static void main(String[] args) {
        linkedlist_AddRemove l = new linkedlist_AddRemove();
       l.add("this");
       l.add("is");
       l.add("a");
       l.add("list");
       l.lPrint();
       System.out.print("\n");
       l.deleteFirst();
       l.deleteLast();
       l.lPrint();
 
    }
}
