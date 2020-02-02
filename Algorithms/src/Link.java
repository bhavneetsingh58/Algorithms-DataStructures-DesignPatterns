
public class Link {
	
   public String bookName;
   public int millionsSold;
   
   public Link next;
   
   public Link(String bookName,int millionsSold) {
	   this.bookName = bookName;
	   this.millionsSold = millionsSold;
   }
   public void display() {
	   System.out.println(bookName+":"+millionsSold+",000,000");
   }
   public String toString() {
	   return bookName;
   }
   public static void main(String[] args) {
	   
	}

}
