package dz_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> autoSedan = new ArrayList<>(); //список для седанов
        List<Auto> autoSUV = new ArrayList<>(); //список для внедорожников

        Auto sedan = new Mechanical(165, 245, 378127391, "mazda", "s-12");
        Auto sedan1 = new Automatic(463, 265, 378621698, "lada", "z-83");

        autoSedan.add(sedan);
        autoSedan.add(sedan1);

        Auto suv = new Mechanical(154, 168, 312378543, "lexus", "SV");
        Auto suv1 = new Automatic(165, 245, 378127391, "honda", "R7");

        autoSUV.add(suv);
        autoSUV.add(suv1);
    }
}
