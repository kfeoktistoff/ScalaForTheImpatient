package Chapter5.exc9;

/**
 * Reimplement the class of the preceding exercise in Java, C#, or C++ (your
 * choice). How much shorter is the Scala class?
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

public class Car {
    private String creator;
    private String model;
    private long year = -1;
    private String vin = "";

    public Car(String creator, String model) {
        this.creator = creator;
        this.model = model;
    }

    public Car(String creator, String model, long year) {
        this(creator, model);
        this.year = year;
    }

    public Car(String creator, String model, String vin) {
        this(creator, model);
        this.vin = vin;
    }

    public Car(String creator, String model, long year, String vin) {
        this(creator, model);
        this.year = year;
        this.vin = vin;
    }

    public String getCreator() {
        return creator;
    }

    public String getModel() {
        return model;
    }

    public long getYear() {
        return year;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
