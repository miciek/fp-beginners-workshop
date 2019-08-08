import java.util.ArrayList;
import java.util.List;

public class Itinerary {
    static List<String> replan(List<String> plan,
                               String newCity,
                               String beforeCity) {
        int newCityIndex = plan.indexOf(beforeCity);
        plan.add(newCityIndex, newCity);
        return plan;
    }

    public static void main(String[] args) {
    }
}
