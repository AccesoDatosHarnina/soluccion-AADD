package model.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import modelAtractions.FairGround;
import modelAtractions.Performance;
import modelAtractions.RollerCoaster;
import modelAtractions.Show;

class CustomerVisitTest {

	/**
	 * Controlar si se puede repetir la votacion
	 * a la misma atraccion
	 */
	@Test
	void testInsertAtraccionCard() {
		CustomerVisit customerVisit=new CustomerVisit();
		Performance performance=new Performance();
		Performance performance2=new Performance();
		customerVisit.insertAtraccionCard(performance, 1);
		customerVisit.insertAtraccionCard(performance2, 1);
		assertEquals(2, customerVisit.getCustomerCards().size());
		//comprobamos si repite atracciones
		customerVisit.insertAtraccionCard(performance2, 3);
		assertEquals(2, customerVisit.getCustomerCards().size());
	}
	
	/**
	 * probamos que, por defecto, el usuario solo visita 4 atracciones
	 */
	@Test
	void testInsertAtraccionRAndomDefaultRides() {
		RandomCustomerMother randomCustomer=new RandomCustomerMother();
		ArrayList<FairGround> fairgrounds=new ArrayList<>();
		fairgrounds.add(new Performance());
		fairgrounds.add(new Performance());
		fairgrounds.add(new Show());
		fairgrounds.add(new Show());
		fairgrounds.add(new RollerCoaster());
		fairgrounds.add(new RollerCoaster());
		CustomerVisit visitPark = randomCustomer.visitPark(fairgrounds);
		assertEquals(4, visitPark.getCustomerCards().size());
	}
	
	
	//Probamos que puede votar a seis, usando el otro constructor
	// el número de votaciones es correcto
	@Test
	void testInsertAtraccionRAndomCustomRides() {
		RandomCustomerMother randomCustomer=new RandomCustomerMother(6);
		ArrayList<FairGround> fairgrounds=new ArrayList<>();
		fairgrounds.add(new Performance());
		fairgrounds.add(new Performance());
		fairgrounds.add(new Show());
		fairgrounds.add(new Show());
		fairgrounds.add(new RollerCoaster());
		fairgrounds.add(new RollerCoaster());
		CustomerVisit visitPark = randomCustomer.visitPark(fairgrounds);
		//No permitimos repeticiones
		assertEquals(6, visitPark.getCustomerCards().size());
	}

}
