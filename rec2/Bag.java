package rec2;

public interface Bag {
	public int getSize();
	public boolean isEmpty();
	public boolean add (Product p);
	public boolean remove(Product p);
	public void clear();
	public boolean contains(Product p);
	public int getFrequencyOf(Product p);
}
