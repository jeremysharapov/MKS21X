public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

     public LibraryBook(String a, String t, String I, String CN){
	 super(a, t, I);
	 setCallNumber(CN);
     }
    
    public void setCallNumber(String s){
	callNumber = s;
    }

    public String getCallNumber(){
	return callNumber;
    }

    abstract void checkout(String patron, String due);

    abstract void returned();

    abstract String circulationStatus();

    public int compareTo(LibraryBook L){
	return this.getCallNumber().compareTo(L.getCallNumber());
    }
    
    public String toString(){
	return super.toString() + "," + circulationStatus() + "," + getCallNumber();
    }
}
