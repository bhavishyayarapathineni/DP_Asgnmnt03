package que23;

import java.util.ArrayList;

public class safe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private final String name;
		private final ArrayList addresses;
		public safe(String name, ArrayList addresses) {
		super();
		this.name = name;
		ArrayList tempAdd=new ArrayList();
		for (int i = 0; i < addresses.size(); i++) {
		tempAdd.add(addresses.get(i));
		}
		this.addresses = tempAdd;
		}
		 
		public String getName() {
		return name;
		}
		public ArrayList getAddresses() {
		return addresses;
	}

}
