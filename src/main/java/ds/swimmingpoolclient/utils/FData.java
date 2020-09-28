package ds.swimmingpoolclient.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FData {
    private static final Random rand = new Random();
    private static final List<String> names = Arrays.asList("Ivan", "Petro", "Alex", "Sasha");
    private static final List<String> surnames = Arrays.asList("Ivanov", "Petrov", "Durov", "Titov");
    private static final List<Double> temperature = Arrays.asList(36.6, 37.2, 36.6, 38.4);
    private static final List<String> swimmingStuff = Arrays.asList("flippers", "mask", "swimming googles", "swimming cap");
    private static final List<String> posts = Arrays.asList("admin", "coach", "cleaner", "nurse");
    private static final List<String> types = Arrays.asList("one time", "month", "year");

    public static String getName(){return names.get(rand.nextInt(names.size()));}

    public static String getSurname(){return surnames.get(rand.nextInt(surnames.size()));}

    public static Double getTemperature(){return temperature.get(rand.nextInt(temperature.size()));}

    public static String getPost(){return posts.get(rand.nextInt(posts.size()));}

    public static String getSwimmingStuff(){return swimmingStuff.get(rand.nextInt(swimmingStuff.size()));}

    public static String getType(){return types.get(rand.nextInt(types.size()));}



    public static int getPassPrice(){return rand.nextInt() * 20;}

    public static double getSalary(){return rand.nextDouble() * 2000.0;}

    public static int getPrice(){return rand.nextInt() * 10;}
}
