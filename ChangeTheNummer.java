import java.util.List;

public class ChangeTheNummer {

    public int a;
    public int b;

    public ChangeTheNummer(int a, int b) {
        this.a = a;
        this.b = b;
    }
//TODO: Напишите программу на Java, чтобы поменять местами значения, хранящиеся в двух переменных, без использования третьей переменной
    public static List<Integer> changeTheNummer (int a, int b) {
        a-=b;
        b=a+b;
        a=b-a;
        return List.of(a, b);
    }
}


