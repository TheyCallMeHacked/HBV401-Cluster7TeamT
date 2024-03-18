import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Engine {
    ServiceController[] controllers;

    Engine(ServiceController[] controllers){
        this.controllers = controllers;
    }

    public Service[] search(String str) {
        ArrayList result = new ArrayList<>();

        for (ServiceController sc : controllers) {
            result.addAll(sc.search(str));
        }
        return (Service[]) result.toArray();
    }

    public Service[] search(ServiceController controller, String str) {
        return controller.search(str);
    }

    public Service[] sort(Service[] services, SortingParam sortingParam, boolean reverse) {
        Service[] result = services.clone();

        Comparator comp;

        switch (sortingParam) {
            case ID:
                comp = (Service s1, Service s2) -> s2.getId() - s1.getId();
                break;

            case PRICE:
                comp = (Service s1, Service s2) -> s2.getPrice() - s1.getPrice();
                break;

        }

        if (reverse) comp = comp.reversed();

        Arrays.sort(result, comp);

        return result;
    }

    public Service[] filter(Service[] services, Filter[] filters) {
        ArrayList<Service> filteredServices = new ArrayList<>();
        for (Service s: services) {
            boolean pass = true;
            for (Filter f: filters) {
                pass = pass && f.filter(s);
            }
            if (pass) filteredServices.add(s);
        }
        return (Service[]) filteredServices.toArray();
    }

    public Service[] recommend(Trip trip) {
        return new Service[0];
    }

    public void contactAdministrators(String message) {}

    enum SortingParam {
        ID,
        PRICE
    }

}
