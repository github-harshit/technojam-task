public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        int t=scanner.nextInt();

        for(int i=0;i<t;i++) {
            int n = scanner.nextInt();
           int[] Myarray = new int[n];
            for (int j = 0; j < Myarray.length; j++) {
                Myarray[j] = scanner.nextInt();
            }


           int countEven=0;
            int countOdd=0;
            for (int k = 0; k < Myarray.length; k++) {
                if (Myarray[k] % 2 == 0) {
                    countEven += 1;
                } else {
                    countOdd += 1;
                }


            }
            if(countOdd<1){
                System.out.println("-1");
            }else{
                System.out.println(countEven);
            }
        }


            }

        }
