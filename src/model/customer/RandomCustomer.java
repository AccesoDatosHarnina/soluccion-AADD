package model.customer;

import java.util.List;
import java.util.Random;

import modelAtractions.FairGround;

public class RandomCustomer {
	private int rides=4;
	private float maxRate=10;
	
	public CustomerVisit visitPark(List<FairGround> fairs) {
		CustomerVisit visit=new CustomerVisit();
		for (int i = 0; i < this.rides; i++) {
			visit.insertAtraccionCard(fairs.get(new Random().nextInt(fairs.size())), new Random().nextFloat()*maxRate);
		}
		return visit;
	}
}
