package ChislaFibonachi;

public class chislaFibonachi1 {

    int kolvo, start, start1;

        public static void fibonachi(int kolvo, int start, int start1){
        int doblestart = start;
        for (int i=0; i<=kolvo; i++) {
            start = doblestart;
            doblestart = start1;
            start1 = start+doblestart;
            System.out.print(start + " ");

        }
    }

}
