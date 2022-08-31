package Customer;

public class Customer {
	private int customer_id;
	private String customer_name;
	private int customer_qty;
	private int item_no;
	private float total_Bill;
	
	
	
	
	public Customer() {
		super();
	}
	public float getTotal_Bill() {
		return total_Bill;
	}
	public void setTotal_Bill(float total_Bill) {
		this.total_Bill = total_Bill;
	}
	public Customer(int customer_id, String customer_name,int customer_qty) {
		super();
		this.customer_qty = customer_qty;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getItem_no() {
		return item_no;
	}
	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}
	public int getCustomer_qty() {
		return customer_qty;
	}
	public void setCustomer_qty(int customer_qty) {
		this.customer_qty = customer_qty;
	}
	

}
