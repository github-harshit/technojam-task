import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int t=scanner.nextInt();
	for(int i=0;i<t;i++){
	    int l=scanner.nextInt();
	    String sc=scanner.next();
	    int countOne=0;
	    int countZero=0;

        ArrayList<String> al= new ArrayList<>();
        al.add("Tywin");
        al.add("Hound");
        al.add("Jaimie");
        al.add("Mountain");
        for(int j=0;j<sc.length();j++){
            if(sc.charAt(j)=='1'){
                countOne++;
            }
            if(sc.charAt(j)=='0'){
                countZero++;
            }
        }
        int finalValue=countZero-countOne;
        System.out.println(finalValue);
        if(finalValue>0){
            if(finalValue>3){
                System.out.println(al.get(finalValue%4));
            }
            if(finalValue<=3){
                System.out.println(al.get(finalValue));
            }
        }else if (finalValue<0){
            int negativeFinalValue=Math.abs(finalValue);
            if(negativeFinalValue<=3){
                System.out.println(al.get(4-negativeFinalValue));
            }
            if(negativeFinalValue>3){
                System.out.println(al.get(4-(negativeFinalValue%4)));
            }
        }
        else{
            System.out.println(al.get(0));
        }
    }
    }
}
