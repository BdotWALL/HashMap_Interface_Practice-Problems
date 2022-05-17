import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private int numOfItems;
    private ArrayList<Packable> items;

    public Box (double weight) {
        this.maxCapacity = weight;
        this.numOfItems = 0;
        this.items = new ArrayList<>();
    }



    public void add(Packable packable) {

        if (this.maxCapacity > (this.weight() + packable.weight())) {
            this.items.add(packable);
            this.numOfItems++;
        }
    }

    public double weight() {
        double weight = 0;
        if (!this.items.isEmpty()) {
            for (Packable item : this.items) {
                weight += item.weight();
            }
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.numOfItems + " items, total weight " + this.weight() + " kg";
    } 
    
}
