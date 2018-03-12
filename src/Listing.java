import java.util.ArrayList;

public class Listing {

    private ArrayList<String> myList = new ArrayList<String>();

    public void addToMyList(String token) {
        myList.add(token);
    }
    public void printMyList() {
        System.out.println("List has "+myList.size()+" items");

        for (int i=0;i<myList.size();i++) {
            System.out.println("Pos: "+(i+1)+" value: " + myList.get(i));
        }
    }
    public void modifyMyList(int pos, String token) {
        myList.set(pos, token);
        System.out.println("Change has been made at pos : " + (pos+1) +
        " and new value is : " + token);
    }
    public void removeFromMyList(int pos) {
        String deleted = myList.get(pos);
        myList.remove(pos);
        System.out.println("Item has been deleted from pos: "+(pos+1)
        +" and its value has been: "+deleted);
    }
    public String findItem(String searchItem) {
        int position = myList.indexOf(searchItem);
        if (position >=0) {
            return myList.get(position);
        }
        return null;
    }
}

