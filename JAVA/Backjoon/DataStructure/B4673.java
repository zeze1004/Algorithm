import java.io.IOException;
import java.util.TreeSet;

public class B4673 {
    public static void main(String[] args) throws IOException {
        TreeSet<Integer> unSelfNum = new TreeSet<>();

        for (int i = 1; i <= 10000; i++) {
            String numS = String.valueOf(i);
            String[] numSplit = numS.split("");

            int sumN = i;
            for (String s : numSplit) {
                sumN += Integer.parseInt(s);
            }
            unSelfNum.add(sumN);
        }

        for (int i = 1; i <= 10000; i++) {
            if (!unSelfNum.contains(i))
                System.out.println(i);
        }
    }
}
