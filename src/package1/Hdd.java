package package1;

import java.util.Objects;

public class Hdd {
  private String model;
          Type type;
   private int capacity ;
           Country country;

    public Hdd(String model, Type type, int capacity, Country country) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hdd)) return false;
        Hdd hdd = (Hdd) o;
        return getCapacity() == hdd.getCapacity() &&
                getModel().equals(hdd.getModel()) &&
                getType() == hdd.getType() &&
                getCountry() == hdd.getCountry();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getType(), getCapacity(), getCountry());
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", capacity=" + capacity +
                ", country=" + country +
                '}';
    }
}
