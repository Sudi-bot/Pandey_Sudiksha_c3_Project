public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return  name + ":"
                + getPrice()
                + "\n"
                ;
    }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
