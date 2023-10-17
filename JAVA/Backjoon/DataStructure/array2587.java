import java.util.*;

public class array2587 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>(5);

        for (int i = 0; i < 5; i++)
            x.add(stdIn.nextInt());

        Collections.sort(x);

        // java.util에서 제공하는 간단한 통계 제공 라이브러리
        IntSummaryStatistics statistics = x
                .stream()
                .mapToInt(num -> num)
                .summaryStatistics();

        System.out.println((int)statistics.getAverage());
        System.out.println(x.get(2));
    }
}
