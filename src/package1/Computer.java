package package1;

import java.util.Objects;

public class Computer {
    private String model;
   private int manufacturedYear;
   private int rom;
    private int price;
                Hdd hdd;
                 Processor processor;

    public Computer(String model, int manufacturedYear, int rom, int price, Hdd hdd, Processor processor) {
        this.model = model;
        this.manufacturedYear = manufacturedYear;
        this.rom = rom;
        this.price = price;
        this.hdd = hdd;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getManufacturedYear() == computer.getManufacturedYear() &&
                getRom() == computer.getRom() &&
                getPrice() == computer.getPrice() &&
                getModel().equals(computer.getModel()) &&
                getHdd().equals(computer.getHdd()) &&
                getProcessor().equals(computer.getProcessor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getManufacturedYear(), getRom(), getPrice(), getHdd(), getProcessor());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", manufacturedYear=" + manufacturedYear +
                ", rom=" + rom +
                ", price=" + price +
                ", hdd=" + hdd +
                ", processor=" + processor +
                '}';
    }


}
