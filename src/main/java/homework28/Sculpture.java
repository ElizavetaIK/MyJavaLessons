package homework28;

import java.util.Objects;

public class Sculpture extends ArtParams implements Artwork {
    private Material material;

    private double weight;

    public Sculpture(String creator, String name, Material material, double weight) {
        super(creator, name);
        this.material = material;
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sculpture " +
                "material - " + material +
                ", weight - " + weight +
                "} " + super.toString());
    }

    @Override
    public String getCreator() {
        return super.getCreator();
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sculpture{" +
                "material=" + material +
                ", weight=" + weight +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sculpture sculpture)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(getWeight(), sculpture.getWeight()) == 0 && getMaterial() == sculpture.getMaterial();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaterial(), getWeight());
    }
}
