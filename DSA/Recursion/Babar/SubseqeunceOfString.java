public class SubseqeunceOfString 
{

static void Subseqeunce(String str , int i , String output){
if( i >=str.length()){

        System.out.println( output);
        return;
    }

//exclude 
Subseqeunce(str, i+1, output);

//include

output =  str.charAt(i)+output;
Subseqeunce(str, i+1, output);
}
    public static void main(String[] args) {
        String str = "ab";
        String output="";
         int i =0;
        Subseqeunce(str, i,output);

    }
}
