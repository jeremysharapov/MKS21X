public class Barcode implements Comparable<Barcode>{

    private String _zip;
    private int _checkDigit;

    public Barcode(String zip){
	if (zip.length() == 5){
	    _zip = zip;
	    _checkDigit = checkSum() % 10;
	}
	else{
	    throw new IllegalArgumentException();
	}
    }

    public Barcode clone(){
	Barcode clone = new Barcode(_zip);
	return clone;
    }

    private int checkSum(){
	int sum = 0;
	for (int num = Integer.parseInt(_zip); num > 0; num = num / 10){
	    sum = sum + num % 10;
	}
	return sum;
    }

    public String toString(){
	String s = "|";
	for (int barcode = Integer.parseInt(_zip + _checkDigit); barcode > 0; barcode = barcode / 10){
	    int digit = barcode % 10;
	    switch(digit){
	    case 0:
		s = "||:::" + s;
		break;
	    case 1:
		s = ":::||" + s;
		break;
	    case 2:
		s = "::|:|" + s;
		break;
	    case 3:
		s = "::||:" + s;
		break;
	    case 4:
		s = ":|::|" + s;
		break;
	    case 5:
		s = ":|:|:" + s;
		break;
	    case 6:
		s = ":||::" + s;
		break;
	    case 7:
		s = "|:::|" + s;
		break;
	    case 8:
		s = "|::|:" + s;
		break;
	    case 9:
		s = "|:|::" + s;
		break;
	    default:
	    }
	}
	s = _zip + _checkDigit + " " + s;
	return s;
    }

    public int compareTo(Barcode other){
	return (Integer.valueOf(_zip + _checkDigit)).compareTo(Integer.valueOf(other._zip + other._checkDigit));
    }

    public static String toCode(String zip){
	int sum = 0;
	for (int num = Integer.parseInt(zip); num > 0; num = num / 10){
	    sum = sum + num % 10;
	}
	int checkDigit = sum % 10;
	String s = "|";
	for (int barcode = Integer.parseInt(zip + checkDigit); barcode > 0; barcode = barcode / 10){
	    int digit = barcode % 10;
	    switch(digit){
	    case 0:
		s = "||:::" + s;
		break;
	    case 1:
		s = ":::||" + s;
		break;
	    case 2:
		s = "::|:|" + s;
		break;
	    case 3:
		s = "::||:" + s;
		break;
	    case 4:
		s = ":|::|" + s;
		break;
	    case 5:
		s = ":|:|:" + s;
		break;
	    case 6:
		s = ":||::" + s;
		break;
	    case 7:
		s = "|:::|" + s;
		break;
	    case 8:
		s = "|::|:" + s;
		break;
	    case 9:
		s = "|:|::" + s;
		break;
	    default:
	    }
	}
	return s;
    }
}
