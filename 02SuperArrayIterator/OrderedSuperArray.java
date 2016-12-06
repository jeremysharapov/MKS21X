public class OrderedSuperArray extends SuperArray{


    public OrderedSuperArray(){
	super();
    }

    
    public OrderedSuperArray(int capacity){
	super(capacity);
    }

    
    public OrderedSuperArray(String[]ary){
	super(ary.length);
	for (int i = 0; i < size(); i++){
	    add(get(i));
	}
    }

    
    public String set(int index, String element){
	throw new UnsupportedOperationException();
    }


    public void add(String element){
	super.add(findIndex(element), element);
    }


    private int findIndex(String element){
	for (int i = 0; i <= size(); i++){
	    if (get(i).compareTo(element) > 0){
		return i;
	    }
	}
	return size();
    }

    
    public void add(int index, int element){
	throw new UnsupportedOperationException();
    }
}
