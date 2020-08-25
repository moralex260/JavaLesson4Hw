package package1;

public class Processor {
  private String type;
  private int core;
  private double hrz;
              Country country;

    public Processor(String type, int core, double hrz, Country country) {
        this.type = type;
        this.core = core;
        this.hrz = hrz;
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public double getHrz() {
        return hrz;
    }

    public void setHrz(int hrz) {
        this.hrz = hrz;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", core=" + core +
                ", hrz=" + hrz +
                ", country=" + country +
                '}';
    }
}
