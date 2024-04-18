import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class B5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;

        String[] names = new String[num];
        LocalDate[] birthDays = new LocalDate[num];

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            LocalDate birth = LocalDate.of(year, month, day);

            System.out.println(birth);

            names[i] = name;
            birthDays[i] = birth;
        }

        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < num; i++) {
            if (birthDays[i].isBefore(birthDays[minIdx])) minIdx = i;
            if (birthDays[i].isAfter(birthDays[maxIdx])) maxIdx = i;
        }

        System.out.println(names[maxIdx]);
        System.out.println(names[minIdx]);
    }
}
