import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public class arraylist {
   public static void main(String[] args) {
    //creating an arraylist declaring the arraylist
      ArrayList<Integer> arr = new ArrayList<Integer>();
      arr.add(10);
      arr.add(20);
      System.out.println(arr);
      arr.add(30);
      System.out.println(arr);
      arr.add(40);
      System.out.println(arr);
      arr.remove(0);
      // adding all the elements of arr1 to arr
      List<Integer> arr1 = new ArrayList<Integer>();
      arr1.add(50);
      arr1.add(60);
      arr.addAll(arr1);
    System.out.println(arr);
    // to get the value at index 0
    System.out.println(arr.get(0));
    // to set the value at index 0 to 100 and it will return the old value at index 0
    System.out.println(arr.set(0,100));
    System.out.println(arr);
    //contains method is used to check if the arraylist contains the value 100 or not it will return true if it contains and false if it does not contain
    System.out.println(arr.contains(100));
    // to check if the arraylist contains the value 100
    Object[] arr3 = arr.toArray();
    for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
    }
    Collections.sort(arr);
    System.out.println(arr);
    // to create a new arraylist and add all the elements of arr to newlist make a shallow copy of arr to newlist
    ArrayList<Integer> newlist = (ArrayList<Integer>)arr.clone();
    System.out.println(newlist);
    //iterating through the arraylist to print the elements
      // iterating move to next element and check if it has next element or not if it has next element then it will print the true and move to next element and print the element
   Iterator<Integer> arr2 = arr.iterator();
   System.out.println(arr2);
      while(arr2.hasNext()){
         System.out.println(arr2.next());
      }
// to ensure the capacity of the arraylist to 100 it will increase the capacity of the arraylist to 100 if the current capacity is less than 100 
    ArrayList<Integer> arr4 = new ArrayList<Integer>();
    arr4.ensureCapacity(100);
    System.out.println(arr4.isEmpty ());
    System.out.println(arr.indexOf(100));
      
   }
    
}
