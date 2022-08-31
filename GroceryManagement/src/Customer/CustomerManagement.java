package Customer;

import java.util.ArrayList;

import Shop.Shop;

public class CustomerManagement {

	public void addCustomerDetails(Customer c) {
		c.setCustomer_name(c.getCustomer_name());
		c.setCustomer_qty(c.getCustomer_qty());
		c.setItem_no(c.getItem_no());

	}

	public void displayCustomerBill(ArrayList<Customer> list, String name, ArrayList<Shop> shopList) {

		float total = 0;
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Item Number\t\tCustomer Name\t\tItem Quantity");
		for (Customer customer : list) {
			if (customer.getCustomer_name().equals(name)) {
				
				System.out.println();
				System.out.println(customer.getItem_no() + "\t\t\t\t" + customer.getCustomer_name() + "\t\t\t"
						+ customer.getCustomer_qty() );

				System.out.println("--------------------------------------------------------------------------------------------------");
				for (Shop shop : shopList) {

					if (shop.getItem_no() == customer.getItem_no()) {
						total += customer.getCustomer_qty() * shop.getItem_price();

					}
				}

			}
			
		}
		System.out.println("Total amount before discount "+total);
		float discount = 0;
		if(total<200) {
			discount = (total*15)/100;
			
		}else if(total>=200 && total<700) {
			discount = (total*25)/100;

		}else if(total>700) {
			discount = (total*50)/100;

		}
		System.out.println("Total amount After discount "+(total-discount));

	}
}
