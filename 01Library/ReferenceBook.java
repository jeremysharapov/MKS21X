public class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String a, String t, String I, String CN, String c){
	super(a, t, I, CN);
	setCollection(c);
    }

    public void setCollection(String s){
	collection = s;
    }

    public String getCollection(){
	return collection;
    }

    public void checkout(String patron, String due){
        System.out.println("cannot check out a reference book");
    }

    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
    }

    public String circulationStatus(){
	return "non-circulating reference book";
    }

    public String toString(){
	return super.toString() + "," + getCollection();
    }
}
