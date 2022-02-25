package lab6;
import java.util.*;


class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  




public class MyArrayList {

	public static void main(String[] args) {
	/*	
	  ArrayList<String> al=new ArrayList<String>();
	 
	  al.add("Mounish");
	  al.add("ravi");
	  al.add("Shiva");
	 
	 System.out.println(al.get(1));
	 System.out.println(al);
	  
	 al.set(1,"yashika");
	 
	 System.out.println(al.get(1));
	 System.out.println(al);
	
	  
	  sorting Arraylist of strings
	  
		ArrayList<String> al=new ArrayList<String>();
	    al.add("Mango");
	    al.add("Apple");
	    al.add("Cebra");
	    al.add("Cake");
	    Collections.sort(al);
	  
	    for(String x:al) {
	    	System.out.println(x);
	    }
	    
    
	    //sorting Arraylist of Integers
		  
		ArrayList<Integer> al=new ArrayList<Integer>();
	    al.add(11);
	    al.add(5);
	    al.add(69);
	    al.add(3);
	  
	    Collections.sort(al);
	    for(int x:al) {
	    	System.out.println(x);
	    }
    */
		
  		ArrayList<Book> al=new ArrayList<Book>();
  		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
  		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
  		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
  		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		
		for(Book x:al) {
			System.out.println(x.id+" "+x.name+" "+x.author+" "+x.publisher+" "+x.quantity);
		}
		System.out.println();
		
	}

}
