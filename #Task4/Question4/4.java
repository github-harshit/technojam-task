public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        int sum=0;
        int [] intArray=new int[size];
        for(int i=0;i<intArray.length;i++){
            intArray[i]= scanner.nextInt();

            }
        for(int j=0;j<intArray.length;j++){
            if(isPrime(intArray[j])){
                sum+=intArray[j];

            }
        }
        System.out.println(sum);
        String temp=Integer.toString(sum);
        int[] myArray=new int[temp.length()];
        for(int i=0;i<temp.length();i++){
            myArray[i]=temp.charAt(i);

        }
        for(int i=1;i<myArray.length;i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(myArray[i]==myArray[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }



    }
    public static boolean isPrime(int n ){
        if(n==1){
            return false;
        }
        for(int i=2;i<n/2;i++){
            if(n%2==0){
                return false;
            }

        }
        return true;
    }
}
