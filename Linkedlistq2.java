import java.util.Scanner;
import java.util.LinkedList;
public class Linkedlistq2 {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n =9;
        for(int i=0;i<n ;i++){
            System.out.print("Enter the element: ");
        list.add(sc.nextInt());
        }

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("Null");
        System.out.println(" ");
        
        int i =0;
        while(i<list.size()){
            if(list.get(i)>25){
                list.remove(i);
                
            }
            else{
                i++;
            }
        }

       for( i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("Null");
        
         
    }
}
