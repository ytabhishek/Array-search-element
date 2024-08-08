package Array;
class element{
    void searchelement(){
        int[] arr = {1,2,3,4,2,35,4};
        int x= 4;
        int ans = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==x){
               ans = i;
               break;
            }

        }
        System.out.println("Found " + x + " at index " +  ans);
    }

}
public class search_element {
    public static void main(String[] args) {
        element obj = new element();
        obj.searchelement();

    }
}
