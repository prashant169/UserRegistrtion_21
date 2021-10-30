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
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("phad");
		Assert.assertEquals(false, result);

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
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("+91 9970899057");
		Assert.assertEquals(false, result);
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

	@Test
	public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("Abcdefghij");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule2("abcdefghij");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule3("Prashant22");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule3("Prashant");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule4("Prashant@22");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule4("Prashant");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail1_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddressSample("abc1@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_1WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddressSample("abc@yahoo.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_2WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddressSample("abc-100@yahoo.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail2_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddressSample("abc123@.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail3_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddressSample("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail3_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddressSample("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail4_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddressSample("abc@1.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail4_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddressSample("aabc.@gmail.com");
		Assert.assertEquals(false, result);
	}

}