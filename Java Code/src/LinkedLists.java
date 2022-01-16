import java.util.Arrays;
import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
         LinkedList linkedListOne = new LinkedList();
         LinkedList<String> names = new LinkedList<String>();
         names.add("Ahmed Bennani");
         names.add("Ali Syed");
         names.addLast("Nathan Martin");
         names.set(2,"Paul Newman");
         names.addFirst("Joshua Smith");
         names.add(0,"Noah Peters");
         //names.remove(4)
        //names.remove("Joshua Smith");
        names.set(2,"Paul Newman");
         for(String name : names){
             System.out.println(name);
         }
         System.out.println("First Index: "+names.get(0));
        System.out.println("Last Index: "+names.getLast());
        LinkedList<String> nameCopy = new LinkedList<String>(names);
        System.out.println("\nnameCopy: "+nameCopy);
        if(names.contains("Noah Peters")){
            System.out.println("Noah is here");
        }
        if(names.containsAll(nameCopy)){
            System.out.println("Collections are same");
        }
        System.out.println("Ali index at: "+names.indexOf("Ali Syed"));
        System.out.println("IsEmpty: "+names.isEmpty());
        System.out.println("How many: "+names.size());
        System.out.println("Look without error: "+names.peek());
        System.out.println("Remove first element: "+nameCopy.poll());
        System.out.println("Remove last element: "+nameCopy.pollLast());
        nameCopy.push("Noah Peters");
        nameCopy.pop();
        for(String name : nameCopy){
            System.out.println(name);
        }
        Object[] nameArray = new Object[4];
        nameArray = names.toArray();
        System.out.println(Arrays.toString(nameArray));
        names.clear();
    }
}
