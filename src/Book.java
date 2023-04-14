
public class Book {
String Title;
String Author;
String Publisher;
int BookId;

   public Book() {
      
   }

   public Book(String Title, String Author, String Publisher, int BookId) {
      this.Title = Title;
      this.Author = Author;
      this.Publisher = Publisher;
      this.BookId = BookId;
      
   }
   public String getTitle() {
      return Title;
   }
   public String getAuthor() {
      return Author;
   }
   public String getPublisher(){
      return Publisher;
   }
   public int getBookId() {
      return BookId;
   }
   public String printInfo() {
      return "Book{Title : " + Title +" Author : "+ Author+" Publisher : "+ Publisher+" BookId : "+BookId+"}";
   }
}
 
