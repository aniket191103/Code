public class Allpos {
    static void AllpossibleAtoZ(int n,String res){

        if(res.length()==n){
            System.out.print(res+" ");
            return;
        }
for(char alpha ='A' ;alpha<='Z';alpha++){
    
AllpossibleAtoZ(n,res+alpha);
}
    }public static void main(String[] args) {
        AllpossibleAtoZ(3,"");
    }
}
