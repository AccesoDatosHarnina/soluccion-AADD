package model.park;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelAtractions.PerformanceProductor;
import modelAtractions.RollerCoasterProduct;
import modelAtractions.ShowProductor;

class ParkTest {

	@Test
	void test() throws Exception {
		Park park=new Park();
		park.addFairGround(new PerformanceProductor());
		park.addFairGround(new PerformanceProductor());
		park.addFairGround(new PerformanceProductor());
		park.addFairGround(new PerformanceProductor());
		park.addFairGround(new PerformanceProductor());
		assertEquals(5,park.getFairGrounds().size());
		park.addFairGround(new ShowProductor());
		park.addFairGround(new ShowProductor());
		assertEquals(7,park.getFairGrounds().size());
		park.addFairGround(new RollerCoasterProduct());
		park.addFairGround(new RollerCoasterProduct());
		assertEquals(9,park.getFairGrounds().size());
	}

}
