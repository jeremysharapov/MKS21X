import java.util.*;
public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;


    public SuperArray(){
	size = 0;
	data = new String[10];
    }
    
    
    public SuperArray(int initialCapacity){
	if (initialCapacity < 0){
	    throw new IllegalArgumentException();
	}
	size = 0;
	data = new String[initialCapacity];
    }

    
    public int size(){
	return size;
    }


    public void add(String element){;
	if (size == data.length){
	    grow();
	}
	data[size] = element;
	size = size + 1;
    }


    private void grow(){
	String[] temp = new String[data.length * 2 + 1];
	for(int i = 0; i < data.length; i++){
	    temp[i] = get(i);
	}
	data = temp;
    }


    public String toString(){
	String ans = "[ ";
	for (int i = 0; i < size; i++) {
	    ans = ans + get(i);
	    if (!(i == size - 1)){
		ans = ans + ", ";
	    }
	}
	ans = ans + "]";
	return ans;
    }


    public String toStringDebug(){
	String ans = "[ ";
	for (int i = 0; i < size; i++) {
	    ans = ans + get(i);
	    if (!(i == size - 1)){
		ans = ans + ", ";
	    }
	}
	for (int i = data.length - size; i > 0; i--){
	    ans = ans + "_";
	    if (!(i == 1)){
		ans = ans + ", ";
	    }
	}
	ans = ans + "]";
	return ans;
    }

    
    public String get(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	return data[index];
    }


    public void clear(){
	size = 0;
    }

    
    public boolean isEmpty(){
	return size == 0;
    }

    
    public String set(int index, String element){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	String n = get(index);
	data[index] = element;
	return n;
    }


    public void add(int index, String element){
	if (index < 0 || index > size){
	    throw new IndexOutOfBoundsException();
	}
	for (int i = index; i < size; i++){
	    String n = get(index);
	    data[index] = element;
	    element = n;
	    if (i == data.length - 1){
		grow();
	    }    
	}
	size = size + 1;
    }


    public String remove(int index){
	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	String n = get(index);
	for (int i = index; i < size - 1; i++){
	    data[i] = get(i + 1);
	}
	size = size - 1;
	return n;
    }


    public String[] toArray(){
	String[] dataCopy = new String[size];
	for (int i = 0; i < size; i++){
	    dataCopy[i] = get(i);
	}
	return dataCopy;
    }
    

    public int indexOf(String i){
        for (int x = 0; x < size; x++){
	    if (get(x) == i){
		return x;
	    }
	}
	return -1;
    }


    public int lastIndexOf(String i){
	for(int x = size - 1; x > 0; x--){
	    if (get(x) == i){
		return x;
	    }
	}
	return -1;
    }


    public void trimToSize(){
	String[] temp = new String[size];
	for (int i = 0; i < size; i++){
	    temp[i] = get(i);
	}
	data = temp;
    }

    public Iterator<String> iterator(){
	return new SuperArrayIterator(this);
    }
}
