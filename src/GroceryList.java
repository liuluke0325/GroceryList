import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> grocerylist = new ArrayList<String>();

    public void addGroceryItem (String name) {

        grocerylist.add(name);
        System.out.println("Add Item : " + name);

    }

    public void printGroceryItem(){

        System.out.println("There are " + grocerylist.size() + " in the list");

        for (int i=0; i<grocerylist.size(); i++){

            System.out.println(i+1 +" . " + grocerylist.get(i));
        }


    }

    public void modifiedGroceryItem(int index, String newName){

        grocerylist.set(index, newName);

        System.out.println("Item number " + (index+1) + " has been modified to " + newName );


    }


    public void deleteGroceryItem(int index){
        System.out.println("Deleting................ " + grocerylist.get(index) + " has been deleted");
        grocerylist.remove(index);

    }


   public String findItem(String name){

        boolean isExist = grocerylist.contains(name);
        int index = grocerylist.indexOf(name);
        if( isExist){
            System.out.println("find the item..." + index+1 + " . " + name);
            return name;
        }else {
            System.out.println("Can not find in the list");
        }

        return null;
   }








}
