import java.util.*;
public class SubsequencesOfStringBT {
    static List<String> GetallSUbsequence(String str){
        if(str.length()==0){
            List<String> list= new ArrayList<>();
            list.add(" ");
            return list;
        }
        List<String > newList= new ArrayList<>();
        List <String > oldList= GetallSUbsequence(str.substring(1));

        for (int i = 0; i < oldList.size(); i++) {
            newList.add(oldList.get(i)); // not included
            newList.add(str.charAt(0)+oldList.get(i)); // included
        }
        return newList;
    }
    public static void main(String[] args) {
        String str = "yash";
     List<String> ans=   GetallSUbsequence(str);
     System.out.print(ans);
    }
}
