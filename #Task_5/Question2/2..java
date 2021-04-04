import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter test cases");
        int t=scanner.nextInt();
        List<Student> studentList=new ArrayList<>();
        while(t>0){
            System.out.println("enter name");
            String name=scanner.next();
            System.out.println("enter admission no ");
            int adNo=scanner.nextInt();
            System.out.println("enter maths no");
            int Maths=scanner.nextInt();
            System.out.println("enter physics name");
            int Physics=scanner.nextInt();
            System.out.println("enter chemistry no ");
            int Chemistry=scanner.nextInt();
            System.out.println("enter computer science name");
            int CS=scanner.nextInt();
            System.out.println("enter english name");
            int English=scanner.nextInt();
            int total=total(Maths,Physics,Chemistry,CS,English);
            int totalPCM=total(Maths,Physics,Chemistry,0,0);
            Student student =new Student(total,totalPCM,name,adNo);
            studentList.add(student);
            t--;



        }
     Collections.sort(studentList);
        for(Student s: studentList){
            System.out.println(s.getName() + " " + s.getAdmo());
        }

        }
        public static int total(int a, int b, int c, int d, int e){
        return a+b+c+d+e;


        }




        }


public class Student implements Comparable {
    private int total;
    private int totalPCM;
    private String name;
    private int admo;


    public Student(int total, int totalPCM, String name,int admo) {
        this.total = total;
        this.totalPCM = totalPCM;
        this.name = name;
        this.admo=admo;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalPCM() {
        return totalPCM;
    }

    public String getName() {
        return name;
    }
    public int getAdmo(){
        return admo;
    }

    public int compareTo(Object o) {
        Student s=(Student) o ;
        if(total==s.total){
            if(totalPCM==s.totalPCM){
                if(name.equalsIgnoreCase(s.name)){
                    return admo=s.admo;
                }else{
                    name.compareTo(s.name);
                }
            }else{
                if((s.totalPCM-totalPCM)>0){
                    return 1;

                }else{
                    return -1;
                }
            }
        }else{
            if((s.total-total)>0){
                return 1;
            }else{
                return -1;
            }
        }
        return 0;

    }


}
