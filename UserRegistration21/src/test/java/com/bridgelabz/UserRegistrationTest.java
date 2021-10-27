package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Msd");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("msd");
		Assert.assertEquals(false, result);
	}
}