import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float[][] list = new float[20][2];


        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String subject = st.nextToken();
            float credit = Float.parseFloat(st.nextToken());
            String grade = st.nextToken();

            switch (grade) {
                case "A+":
                    list[i][0] = credit;
                    list[i][1] = 4.5F;
                    break;
                case "A0":
                    list[i][0] = credit;
                    list[i][1] = 4.0F;
                    break;
                case "B+":
                    list[i][0] = credit;
                    list[i][1] = 3.5F;
                    break;
                case "B0":
                    list[i][0] = credit;
                    list[i][1] = 3.0F;
                    break;
                case "C+":
                    list[i][0] = credit;
                    list[i][1] = 2.5F;
                    break;
                case "C0":
                    list[i][0] = credit;
                    list[i][1] = 2.0F;
                    break;
                case "D+":
                    list[i][0] = credit;
                    list[i][1] = 1.5F;
                    break;
                case "D0":
                    list[i][0] = credit;
                    list[i][1] = 1.0F;
                    break;
                case "F":
                    list[i][0] = credit;
                    list[i][1] = 0.0F;
                    break;
                case "P":
                    break;
            }
        }

        float res = 0;
        int sum = 0;

        for (float[] floats : list) {
            if (floats[0] != 0) {
                res += (floats[0] * floats[1]);
                sum += floats[0];
            }
        }

        System.out.println(res / sum);
    }
}
