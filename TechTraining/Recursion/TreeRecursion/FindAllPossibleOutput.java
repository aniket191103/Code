public class FindAllPossibleOutput{
    static int count=0;
    static void dice(int currentVal,int end,String result){
        if(currentVal==end){
            count=count+1;
            System.out.println(result+" "+count) ;
            return;
        }
        if(currentVal>end){
            return;
        }
        for(int i=1;i<=6;i++){
            dice(currentVal+i, end, result+i);
        }

    }
    public static void main(String[] args) {
        dice(0, 10,"");
}
}
