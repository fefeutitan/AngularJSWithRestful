package entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "product")
public class Product {
	
	public String id;
	public String name;
	public double price;
	public int quantity;
	public String getId() {
		return id;
	}
	@XmlElement(name="id")
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement(name="name")
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@XmlElement(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(String id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	
	

}
