import java.util.ArrayList;

public class Engine {
    ServiceController[] controllers;

    Engine(ServiceController[] controllers){
        this.controllers = controllers;
    }

    public Service[] search(ServiceController controller, String str) {
        return controller.search(str);
    }

    public Service[] sort(Service[] services, SortingParam sortingParam, boolean reverse) {
        return services; // Fill in later?
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