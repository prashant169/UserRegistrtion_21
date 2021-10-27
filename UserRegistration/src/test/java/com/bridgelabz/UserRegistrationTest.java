package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Prashant");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("prashant");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Phad");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddress("abc@gmail.com.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddress("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}
	 @Test
	    public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.phoneNumber("91 9970899057");
	        Assert.assertEquals(true, result);
	    }
	 @Test
	    public void givenPassword_WhenInFormat_ShouldReturnTrue() {
	        boolean result = userRegistration.passwordRule1("abcdegfhij");
	        Assert.assertEquals(true, result);
	    }
	    @Test
	    public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
	        boolean result = userRegistration.passwordRule1("abcd");
	        Assert.assertEquals(false, result);
	    }

	}