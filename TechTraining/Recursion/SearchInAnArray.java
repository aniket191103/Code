public class SearchInAnArray {
    public static boolean Search(int arr[], int target, int index) {
        if (arr.length == index) {
            return false;
        }
        if (arr[index] == target) {
            return true;
        }
        return Search(arr, target, index + 1);
    }
    public static void SearchIn(){
        
    }
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50 };
        Boolean result = Search(arr, 90, 0);
        System.out.println(result ? "Found" : "NotFound");
    }
}
