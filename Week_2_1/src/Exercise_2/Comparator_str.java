package Exercise_2;

import java.util.Comparator;

class StringComparatorLen implements Comparator<String> {

    public int compare(String a, String b){

        return b.length() - a.length();
    }
}

class StringComparator implements Comparator<String> {

    public int compare(String a, String b){
        if(!a.equals(b)){
            return 1;
        }else{
            return -1;
        }
    }
}