public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
	setAuthor("Bob");
	setTitle("Bob's Book");
	setISBN("0");
    }
    
    public Book(String a, String t, String I){
	setAuthor(a);
	setTitle(t);
	setISBN(I);
    }
    
    public String getAuthor(){
	return author;
    }

    public void setAuthor(String s){
	author = s;
    }

    public String getTitle(){
	return title;
    }

    public void setTitle(String s){
	title = s;
    }

    public String getISBN(){
	return ISBN;
    }

    public void setISBN(String s){
	ISBN = s;
    }

    public String toString(){
	return getTitle() + "," + getAuthor() + "," + getISBN();
    }
}
