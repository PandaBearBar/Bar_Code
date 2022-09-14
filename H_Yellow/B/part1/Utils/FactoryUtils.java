package H_Yellow.B.part1.Utils;

import H_Yellow.B.part1.Beans.Track;

public class FactoryUtils {
    public static String initName(){
        String [] names = {"Let it be","Banana","Rodrigo", "Rony"};
        return names[initDigit(4, 0)];
    }
    public static int initDigit(int max,int min){
        return (int)(Math.random()*(max-min) + min);
    }
    public static String initBrand(){
        String[] bands = {"The Beatles","Queen"};
        return bands[initDigit(2, 0)];
    }
    public static double initPrice(int max,int min){
        return (Math.random()*(max-min) + min);
    }
    public static Track initTrack(){
        return new Track(initName(),initBrand(), initPrice(301, 150), initDigit(601, 120));
    }
}
