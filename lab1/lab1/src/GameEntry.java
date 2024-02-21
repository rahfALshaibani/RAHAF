//Qr_2
public class GameEntry {

    public int score;

    public GameEntry(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[]{new GameEntry(604), new GameEntry(653),
                new GameEntry(234), new GameEntry(997), new GameEntry(764)};

        //الطريقة الاولى
        GameEntry[] B=new GameEntry[]{new GameEntry(604), new GameEntry(653),
                new GameEntry(234), new GameEntry(997), new GameEntry(764)};
        //طريقة الثانية

        //clone طريقة تقوم بعمل نسخة كم المصفوفة الاولى
         GameEntry[] S = A.clone();

        A[4].score = 550;

        System.out.println(S[4].score);

    }
}
