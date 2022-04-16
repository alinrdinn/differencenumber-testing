package com.numberdifference;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import java.util.Scanner;
import java.io.*;
import java.io.ByteArrayOutputStream;

public class NumberDifferenceTest {
	private CalcNUmberDifference sut;
	private NumberDifferenceFlow sut_1;
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	/**
	 * Setup = inisiasi sebelum test dijalankan, preparation object
	 * --> pay attention to keep components and test cases small, 
	 * --> the trade-off seems acceptable. 
	 * --> implicit setup can be used to deine the fixture common for all tests. 
	 * --> Small in-line and delegate setup statements may supplement .. 
	 *     the speciic preconditions on per-test basis. 
	 * */
	@Before
	public void setUp() throws Exception {
		sut = new CalcNUmberDifference();
		sut_1 = new NumberDifferenceFlow();
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	public void testValidasiRange_1() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 0;
		boolean actual, expected;
		expected = false;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testFlow_1() {
		// (1) setup (arrange, build)
		String data = "0";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		String expected = ("Number Difference"+"\nInput N Number : "+"\nNumber difference can not be processed").replace("\n", "");
		String b1 = "";
		String b2 = "";
		// (2) exercise (act, operate)
		sut_1.execute();
		// (3) verify (assert, check)
		String actual = outputStreamCaptor.toString().replace("\n", "");
		System.setOut(standardOut);
		assertEquals(b1, b2);
		
	}

	public void testValidasiRange_2() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 11;
		boolean actual, expected;
		expected = false;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_3a() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 1;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_3a() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(7);
            }
        };
		int actual, expected;
		expected = 0;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_3a() {
		// (1) setup (arrange, build)
		int difference = 0;
		String actual, expected;
		expected = "Difference : "+ difference +"\nNon Group "+"There's no difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_3b() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 2;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_3b() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(3);
                add(3);
            }
        };
		int actual, expected;
		expected = 0;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_3b() {
		// (1) setup (arrange, build)
		int difference = 0;
		String actual, expected;
		expected = "Difference : "+ difference +"\nNon Group "+"There's no difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_4() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 3;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_4() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(1);
                add(1);
				add(1);
            }
        };
		int actual, expected;
		expected = 0;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_4() {
		// (1) setup (arrange, build)
		int difference = 0;
		String actual, expected;
		expected = "Difference : "+ difference +"\nNon Group "+"There's no difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_5() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 5;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_5() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(2);
                add(2);
				add(2);
				add(2);
				add(2);
            }
        };
		int actual, expected;
		expected = 0;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_5() {
		// (1) setup (arrange, build)
		int difference = 0;
		String actual, expected;
		expected = "Difference : "+ difference +"\nNon Group "+"There's no difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_6() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 10;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_6() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(9);
                add(9);
				add(9);
				add(9);
				add(9);
				add(9);
				add(9);
				add(9);
				add(9);
				add(9);
            }
        };
		int actual, expected;
		expected = 0;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_6() {
		// (1) setup (arrange, build)
		int difference = 0;
		String actual, expected;
		expected = "Difference : "+ difference +"\nNon Group "+"There's no difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_7() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 2;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_7() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(6);
                add(26);
            }
        };
		int actual, expected;
		expected = 20;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_7() {
		// (1) setup (arrange, build)
		int difference = 20;
		int group = 2;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Medium Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_8() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 3;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_8() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(10);
                add(20);
				add(30);
            }
        };
		int actual, expected;
		expected = 20;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_8() {
		// (1) setup (arrange, build)
		int difference = 20;
		int group = 2;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Medium Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_9() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 5;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_9() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(11);
                add(22);
				add(33);
				add(44);
				add(55);
            }
        };
		int actual, expected;
		expected = 44;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_9() {
		// (1) setup (arrange, build)
		int difference = 44;
		int group = 2;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Medium Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_11() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 10;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_11() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
				add(3);
				add(4);
				add(5);
				add(6);
				add(7);
				add(8);
				add(9);
				add(12);
            }
        };
		int actual, expected;
		expected = 11;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_11() {
		// (1) setup (arrange, build)
		int difference = 11;
		int group = 2;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Medium Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_12() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 2;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_12() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(20);
				add(26);
            }
        };
		int actual, expected;
		expected = 6;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_12() {
		// (1) setup (arrange, build)
		int difference = 6;
		int group = 1;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Small Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_13() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 3;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_13() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(3);
				add(6);
				add(9);
            }
        };
		int actual, expected;
		expected = 6;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_13() {
		// (1) setup (arrange, build)
		int difference = 6;
		int group = 1;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Small Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_14() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 5;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_14() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(1);
				add(3);
				add(5);
				add(7);
				add(9);
            }
        };
		int actual, expected;
		expected = 8;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_14() {
		// (1) setup (arrange, build)
		int difference = 8;
		int group = 1;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Small Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_15() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 10;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_15() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(0);
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
				add(6);
				add(7);
				add(8);
				add(9);
            }
        };
		int actual, expected;
		expected = 9;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_15() {
		// (1) setup (arrange, build)
		int difference = 9;
		int group = 1;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Small Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_16() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 2;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_16() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(56);
				add(6);
            }
        };
		int actual, expected;
		expected = 50;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_16() {
		// (1) setup (arrange, build)
		int difference = 50;
		int group = 3;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Large Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_17() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 3;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_17() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(10);
				add(30);
				add(70);
            }
        };
		int actual, expected;
		expected = 60;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_17() {
		// (1) setup (arrange, build)
		int difference = 60;
		int group = 3;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Large Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_18() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 7;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_18() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(2);
				add(10);
				add(20);
				add(30);
				add(40);
				add(60);
				add(80);
            }
        };
		int actual, expected;
		expected = 78;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_18() {
		// (1) setup (arrange, build)
		int difference = 72;
		int group = 3;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Large Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testValidasiRange_19() {
		// (1) setup (arrange, build)
		int jumlahDeretBil = 10;
		boolean actual, expected;
		expected = true;
		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDiff_19() {
		// (1) setup (arrange, build)
		ArrayList<Integer> deretBil = new ArrayList<Integer>() {
            {
                add(1);
				add(11);
				add(21);
				add(31);
				add(41);
				add(51);
				add(61);
				add(71);
				add(81);
				add(91);
            }
        };
		int actual, expected;
		expected = 90;
		// (2) exercise (act, operate)
		actual = sut.numberDiffirenceProcess(deretBil);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testKategori_19() {
		// (1) setup (arrange, build)
		int difference = 90;
		int group = 3;
		String actual, expected;
		expected = "Difference : "+ difference +"\nGroup "+ group +", "+"Large Difference";
		// (2) exercise (act, operate)
		actual = sut.groupingDifference(difference);
		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}


}
