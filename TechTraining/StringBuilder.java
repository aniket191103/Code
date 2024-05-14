public class StringBuilder {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Append a string to the end of the StringBuilder.
        System.out.println("Before appending: " + sb);
        synchronized(sb){
       
        }
        System.out.println("After appending 'Hello': " + sb);
        
        // Insert a string into the StringBuilder at a specific index.
        System.out.println("\nBefore inserting 'World' at index 5: " + sb);
    }
}
