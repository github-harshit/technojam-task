import java.util.*;



public class Main {

    static int disk_size = 200;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size ");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(" enter head position ");
        int head = scanner.nextInt();

        System.out.println("Enter direction ");
        String direction=scanner.next();

        System.out.println("Initial position of head: " +
                head);
        LOOK(arr, head, direction, size);
    }
    public static void LOOK(int arr[], int head,
                            String direction, int size)
    {
        int seek_count = 0;
        int distance, cur_track;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> seek_sequence = new ArrayList<>();
        for(int i = 0; i < size; i++)
        {
            if (arr[i] < head)
                left.add(arr[i]);
            if (arr[i] > head)
                right.add(arr[i]);
        }
        Collections.sort(left);
        Collections.sort(right);


        int run = 2;
        while (run-- > 0)
        {
            if (direction.equalsIgnoreCase("left"))
            {
                for(int i = left.size() - 1;
                    i >= 0; i--)
                {
                    cur_track = left.get(i);
                    seek_sequence.add(cur_track);
                    distance = Math.abs(cur_track - head);
                    seek_count += distance;
                    head = cur_track;
                }

                direction = "right";
            }
            else if (direction.equalsIgnoreCase("right"))
            {
                for(int i = 0; i < right.size(); i++)
                {
                    cur_track = right.get(i);
                    seek_sequence.add(cur_track);
                    distance = Math.abs(cur_track - head);
                    seek_count += distance;
                    head = cur_track;
                }
                direction = "left";
            }
        }

        System.out.println("Total number of seek " +
                "operations = " + seek_count);

        System.out.println("Seek Sequence is");

        for(int i = 0; i < seek_sequence.size(); i++)
        {
            System.out.println(seek_sequence.get(i));
        }
        System.out.println("seek count =  " + seek_count);

    }

        }
