package additionally;

public class GeneradeId {
    private static long counter = 1;
    public static long generateId(){
        return counter++;
    }
}
