package pkgShapeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Ellipsoid;

public class EllipsoidTest {

	@Test
	public void EllipsoidTest() {
		Ellipsoid e2 = new Ellipsoid(10,20,25);
		assertEquals(20943.95,e2.area(), 0.01);
	}

}
