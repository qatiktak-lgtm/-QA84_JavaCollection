import com.aittr.javacollections.centaurus.Centautus; // или если хочу все классы то ставим *

public class MainCentaurus {
    public static void main(String[] args) {
        Centautus ctr = new Centautus("Nessus", 1234, 36.5, "fireball");

        System.out.println(ctr);
        ctr.toJump();

    }
}
