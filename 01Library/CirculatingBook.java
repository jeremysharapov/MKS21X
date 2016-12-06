public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String a, String t, String I, String CN){
	super(a, t, I, CN);
    }

    public void setCurrentHolder(String s){
	currentHolder = s;
    }

    public String getCurrentHolder(){
	return currentHolder;
    }

    public void setDueDate(String s){
	dueDate = s;
    }

    public String getDueDate(){
	return dueDate;
    }

    public void checkout(String patron, String due){
	setCurrentHolder(patron);
	setDueDate(due);
    }

    public void returned(){
	setCurrentHolder(null);
	setDueDate(null);
    }

    public String circulationStatus(){
	if (currentHolder == null){
	    return "book available on shelves";
	}
	else{
	    return "held by" + getCurrentHolder() + "and is due" + getDueDate();
	}
    }

    public String toString(){
	if (currentHolder == null){
	    return super.toString();
	}
	else{
	    return super.toString() + "," + getCurrentHolder() + "," + getDueDate();
	}
    }
}
