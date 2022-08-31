package Controller;
/*
 * 
 * 
 * 
 * 
 * 1)add New Item
2)Display All Item
3)Add Customer Details
0) Exit
1
Enter The Item Number
1
Enter The item Name
apple
Enter the item price
200
1)add New Item
2)Display All Item
3)Add Customer Details
0) Exit
1
Enter The Item Number
2
Enter The item Name
mango
Enter the item price
150
1)add New Item
2)Display All Item
3)Add Customer Details
0) Exit
2
----------------------------------------------------------------------------------------------------------------------------------------------

Item Number		Item Name		Item price

1			apple			200


2			mango			150

------------------------------------------------------------------------------------------------------------------------------------------
1)add New Item
2)Display All Item
3)Add Customer Details
0) Exit
3
Enter customer name:
sheik
Enter Item Number :
1
Enter Item Quantity 
3
Do You Have More Item ?(yes/no)
yes
Enter customer name:
sheik
Enter Item Number :
2
Enter Item Quantity 
2
Do You Have More Item ?(yes/no)
no
--------------------------------------------------------------------------------------------------------

Item Number		Customer Name		Item Quantity

1			sheik			3
--------------------------------------------------------------------------------------------------

2			sheik			2
--------------------------------------------------------------------------------------------------
Total amount before discount 900.0
Total amount After discount 450.0
1)add New Item
2)Display All Item
3)Add Customer Details
0) Exit

0
 */

import java.util.ArrayList;
import java.util.Scanner;

import Customer.Customer;
import Customer.CustomerManagement;
import Shop.Shop;
import Shop.ShopMangement;

public class ShopController {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Customer> customerList = new ArrayList<>();
	static ArrayList<Shop> shopList = new ArrayList<>();

	static void menu() {
		System.out.println("1)add New Item");
		System.out.println("2)Display All Item");
		System.out.println("3)Add Customer Details");
		System.out.println("0) Exit");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int option;
		try {
			do {
				Shop shop = new Shop();
				ShopMangement shopManagement = new ShopMangement();

				menu();
				option = scan.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter The Item Number");
					shop.setItem_no(scan.nextInt());
					System.out.println("Enter The item Name");
					shop.setItem_name(scan.next());
					System.out.println("Enter the item price");
					shop.setItem_price(scan.nextInt());
					shopManagement.addNewItem(shop);
					shopList.add(shop);

					break;
				case 2:
					shopManagement.displayItem(shopList);
					break;
				case 3:
					sellItemDetails();
					break;

				default:
					break;

				}

			} while (option != 0);
		} catch (Exception e) {
			System.out.println("Enter Valid Input!!!!!");
		}

	}

	private static void sellItemDetails() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		CustomerManagement customerManagement = new CustomerManagement();
		System.out.println("Enter customer name:");

		customer.setCustomer_name(scan.next());
		System.out.println("Enter Item Number :");
		customer.setItem_no(scan.nextInt());
		System.out.println("Enter Item Quantity ");
		customer.setCustomer_qty(scan.nextInt());

		customerManagement.addCustomerDetails(customer);
		customerList.add(customer);

		System.out.println("Do You Have More Item ?(yes/no)");
		String choice = scan.next().toUpperCase();
		if (choice.equals("YES")) {
			sellItemDetails();
		} else {
			customerManagement.displayCustomerBill(customerList, customer.getCustomer_name(), shopList);
		}

	}

}
