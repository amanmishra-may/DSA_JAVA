class Linkedlist{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //ADD AT FIRST
    public void addFirst(String data){
      Node newNode= new Node(data);
      if(head==null){
        head=newNode;
        return;
      }
      newNode.next=head;
      head=newNode;

    }

    //ADD AT LAST
    public void addLast(String data){
     Node newNode= new Node(data);
     if(head==null){
        head=newNode;
         return;
        }
        Node currNode= head;
        while(currNode.next!=null){
            currNode=currNode.next;    

        }
        currNode.next=newNode;        

    }
     
    //DELETE AT FIRST
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
      head=head.next;

    }
           
       //DELETE AT FIRST

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
    


    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode= head;
        while(currNode !=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;    

        }
        System.out.print("NULL");
    }


   public static void main(String[] args) {
    Linkedlist l =new Linkedlist();
    l.addFirst("is");
    l.addFirst("this");
    l.addLast("a list");
    l.printList();



    
   } 
}
