package Shop;

import java.util.ArrayList;

public class ShopMangement {
	public void addNewItem(Shop s) {
	s.setItem_no(s.getItem_no());	
	s.setItem_name(s.getItem_name());
	s.setItem_price(s.getItem_price());
	
		
	}
	
	public void displayItem(ArrayList<Shop> list) {
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Item Number\t\tItem Name\t\tItem price");
		for(Shop shop:list) {

			System.out.println();
			System.out.println(shop.getItem_no()+"\t\t\t"+shop.getItem_name()+"\t\t\t"+shop.getItem_price());
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");

	}

}
