package model.customer;

import java.util.List;
import java.util.Random;

import modelAtractions.FairGround;

public class RandomCustomerMother {
	private int rides = 4;
	private float maxRate = 10;

	public RandomCustomerMother() {
		super();
	}

	public RandomCustomerMother(int rides) {
		super();
		this.rides = rides;
	}

	public CustomerVisit visitPark(List<FairGround> fairs) {
		assert fairs != null && fairs.size() >= this.rides;
		CustomerVisit visit = new CustomerVisit();
		for (int i = 0; i < this.rides;) {
			if (visit.insertAtraccionCard(fairs.get(new Random().nextInt(fairs.size())),
					new Random().nextFloat() * maxRate)) {
				i++;
			}
			;
		}
		return visit;
	}
}
