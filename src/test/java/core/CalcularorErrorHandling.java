package core;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalcularorErrorHandling {

	@Test(timeout = 1000) // @Ignore
	public void test_01_add_2() {
		System.out.println("Test # 01: Add 2 params");
		assertEquals("Not correct. 200 + 150 = 350.", Calculator.add(200.0, 150.0), 300.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_02_add_3() {
		System.out.println("Test # 02: Add 3 params");
		assertEquals("Not correct. 8 + 5 + 7 = 20", Calculator.add(8.0, 5.0, 7.0), 10.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_03_add_4() {
		System.out.println("Test # 03: Add 4 params");
		assertEquals("Not correct. 185.3 + 0.7 + 10.0 + 74.0 = 270", Calculator.add(185.3, 0.7, 10.0, 74.0), 20.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_04_divide_2() {
		System.out.println("Test # 04: Divide 2 params");
		assertEquals("Not correct. 90 / 30 = 3", Calculator.divide(90.0, 30.0), 2.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_05_divide_3() {
		System.out.println("Test # 05: Divide 3 params");
		assertEquals("Not correct. 40.0 / 8.0 / 2.0 = 2.5", Calculator.divide(40.0, 8.0, 2.0), 2.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_06_divide_4() {
		System.out.println("Test # 06: Divide 4 params");
		assertEquals("Not correct. 600 / 50 / 4 / 2 = 1.5", Calculator.divide(600.0, 50.0, 4.0, 2.0), 1.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_07_multiply_2() {
		System.out.println("Test # 07: Multiply 2 params");
		assertEquals("Not correct. 9 * 5 = 45", Calculator.multiply(9.0, 5.0), 40.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_08_multiply_3() {
		System.out.println("Test # 08: Multiply 3 params");
		assertEquals("Not correct. 20 * 5 * 8 = 800", Calculator.multiply(20.0, 5.0, 8.0), 400.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_09_multiply_4() {
		System.out.println("Test # 09: Multiply 4 params");
		assertEquals("Not correct. 24 * 4 * 10 * 5 = 4800", Calculator.multiply(24.0, 4.0, 10.0, 5.0), 4000.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_10_subtract_2() {
		System.out.println("Test # 10: Subtract 2 params");
		assertEquals("Not correct. 28 - 14 = 14", Calculator.subtract(28.0, 14.0), 10.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_11_subtract_3() {
		System.out.println("Test # 11: Subtract 3 params");
		assertEquals("Not correct. 220 - 20 - 120 = 80", Calculator.subtract(220.0, 20.0, 120.0), 100.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_12_subtract_4() {
		System.out.println("Test # 12: Subtract 4 params");
		assertEquals("Not correct. 400 - 150 - 50 - 45 = 155", Calculator.subtract(400.0, 150.0, 50.0, 45.0), 105.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_13_subtract_5() {
		System.out.println("Test # 13: Subtract 5 params");
		assertEquals("Not correct. 400 - 150 - 50 - 45 - 5 = 150", Calculator.subtract(400.0, 150.0, 50.0, 45.0, 5.0), 100.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_14_subtract_6() {
		System.out.println("Test # 14: Subtract 6 params");
		assertEquals("Not correct 400 - 150 - 50 - 45 - 5 - 10 = 140", Calculator.subtract(400.0, 150.0, 50.0, 45.0, 5.0, 10.0), 140.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_15_add_5() {
		System.out.println("Test # 15: Add 5 params");
		assertEquals("Not correct. 40 + 15 + 5 + 4 + 6 = 70", Calculator.add(40.0, 15.0, 5.0, 4.0, 6.0), 60.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_16_add_6() {
		System.out.println("Test # 16: Add 6 params");
		assertEquals("Not correct. 40 + 15 + 5 + 4 + 6 + 10 = 80", Calculator.add(40.0, 15.0, 5.0, 4.0, 6.0, 10.0), 90.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_17_multiply_5() {
		System.out.println("Test # 17: Multiply 5 params");
		assertEquals("Not correct. 4 * 1 * 5 * 4 * 2 = 160", Calculator.multiply(4.0, 1.0, 5.0, 4.0, 2.0), 100.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_18_multiply_6() {
		System.out.println("Test # 18: Multiply 6 params");
		assertEquals("Not correct. 4 * 1 * 5 * 4 * 2 * 100 = 16000", Calculator.multiply(4.0, 1.0, 5.0, 4.0, 2.0, 100.0), 16000.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_19_divide_5() {
		System.out.println("Test # 19: Divide 5 params");
		assertEquals("Not correct. 400 / 10 / 4 / 2 / 5 = 1", Calculator.divide(400.0, 10.0, 4.0, 2.0, 5.0), 2.0, 0.09);
	}

	@Test(timeout = 1000) // @Ignore
	public void test_20_divide_6() {
		System.out.println("Test # 20: Divide 6 params");
		assertEquals("Not correct. 400 / 4 / 2 / 5 / 2 / 1 = 5", Calculator.divide(400.0, 4.0, 2.0, 5.0, 2.0, 1.0), 4.0, 0.09);
	}
	@Test(expected=Exception.class) // expected result = MojoFailureException
	public void test () {fail ("Not correct");}
}
