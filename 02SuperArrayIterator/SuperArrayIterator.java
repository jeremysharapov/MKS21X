import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
    private SuperArray Sup;
    private int element;
    
    public SuperArrayIterator(SuperArray SA){
	Sup = SA;
	element = 0;
    }

    public boolean hasNext(){
	return element < Sup.size();
    }

    public String next(){
	if (hasNext()){
	    element++;
	    return Sup.get(element- 1);
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
    
