package music.daima.ebook;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDaAn {
    public static void main(String[] args) {
        ArrayList<Gerbil1> gerbils = new ArrayList<Gerbil1>();
        for(int i = 0; i < 10; i++)
            gerbils.add(new Gerbil1(i));
        Iterator<Gerbil1> it = gerbils.iterator();
        while(it.hasNext())
            it.next().hop();
    }
}

class Gerbil1 {
    private int gerbilNumber;
    public Gerbil1(int i) {
        gerbilNumber = i;
    }
    public void hop() {
        System.out.println("Gerbil " + gerbilNumber + " hops");
    }
}
