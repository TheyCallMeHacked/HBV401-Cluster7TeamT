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

    enum SortingParam {
        ID,
        PRICE
    }

}