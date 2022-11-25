public class Laptop {
    
    public int id;
    public String model;
    public int price;
    public Employee owner;
    
    public Laptop(int id, String model, int price) {
        this.id = id;
        this.model = model;
        this.price = price;
    }
    
    public void printInfo() {
        System.out.printf("Laptop: %s, id = %d, price = %d\n", this.model, this.id, this.price);
    }
    
    public void setOwner(Employee e) {
        this.owner = e;
        e.device = this;
    }
}
