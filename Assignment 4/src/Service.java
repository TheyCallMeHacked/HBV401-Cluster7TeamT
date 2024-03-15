public class Service {
    long id;
    String name;
    String description;
    Float price;
    Location location;
    Language[] languages;
    boolean childSafe;
    boolean available;

    enum Language {
        ICELANDIC,
        ENGLISH,
        FRENCH,
        GERMAN,
        POLISH
    }

}