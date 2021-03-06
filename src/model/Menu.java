package model;

import java.util.HashMap;

import GUI.Kiosk;

public class Menu {

	private static HashMap<Integer, Item> menuItems;
	private static Menu instance;

	public Menu() {

		menuItems = new HashMap<Integer, Item>();

	}

	public static Menu getInstance() {
		if (instance == null) {
			instance = new Menu();
		}
		return instance;
	}

	public boolean hasItem(int itemID) {
		if (menuItems.containsKey(itemID)) {
			return true;
		}
		return false;
	}

	public Item getItem(int itemID) {
		return menuItems.get(itemID);
	}

	public HashMap<Integer, Item> getHashMap() {
		return menuItems;
	}

	public void addMenuItem(Item item) {
		menuItems.put(item.getItemID(), item);
	}

	public static void removeMenuItem(int itemID) {
		menuItems.remove(itemID);
	}

}
