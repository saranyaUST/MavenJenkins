package test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import service.CitizenService;

public class TestCitizenService {
	CitizenService cService = new CitizenService();

	@Test
	public void testComputeAgeWithPastDate() {
		LocalDate input = LocalDate.of(1985, Month.JUNE, 11);
		int expected = 34;

		int actual = cService.computeAge(input);
		assertTrue("expected value matched", expected == actual);

	}

	@Test
	public void testComputeAgeWithToday() {
		LocalDate input = LocalDate.now();
		int expected = 0;

		int actual = cService.computeAge(input);
		assertTrue("expected value mismatched", expected == actual);
	}

}
