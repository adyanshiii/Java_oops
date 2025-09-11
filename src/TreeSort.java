import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        System.out.println("Enter no. of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            set.add(sc.nextInt());

        }
        System.out.println(set);
        System.out.println(set.subSet(2,5));
    }
}
