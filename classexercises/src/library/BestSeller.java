package library;

import java.util.Objects;

public class BestSeller extends Book {
    private String summary;
    private int worldCopies;

    public BestSeller(int id, String name, double price, String summary, int worldCopies) {
        super(id, name, price);
        this.summary = summary;
        this.worldCopies = worldCopies;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void increaseWorldCopies(){
        worldCopies++;
    }

    public void reduceWorldCopies(){
        worldCopies--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BestSeller that = (BestSeller) o;
        return summary.equals(that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), summary);
    }

    @Override
    public String toString() {
        return String.format("BestSeller: %s - %f Summary: %s, %d Copies Sold!", getName(), getPrice(), summary, worldCopies);
    }
}
