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
		boolean result = userRegistration.lastName("prashant");
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
		boolean result = userRegistration.phoneNumber("91 9970799057");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("+91 9970899057");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule1("abcdegss");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule1("abcd");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("Abcdefgss");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule2("abcdefgss");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule3_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule3("Prashant98");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule3("Prashant");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule4_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule4("Prashant@98");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule4_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule4("Prashant");
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

	@Test
	public void givenMessage_WhenHappy_ShouldReturnEntrySuccessful() {
		String result = null;
		try {
			result = MoodAnalyzer.analyseMood("I am in Happy mood");
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("Entry Successful", result);
	}

	@Test
	public void givenEmail2_WhenNotProper_ShouldReturnEntryFailed() {
		String result = null;
		try {
			result = MoodAnalyzer.analyseMood("I am in Sad mood");
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("Entry Failed", result);
	}

	@Test
	public void givenMessage_NULL_ShouldReturnMoodAnalyserException() throws MoodAnalyzerException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		try {
			MoodAnalyzer.analyseMood(null);
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.type.NULL, e.type);
		}
	}

	@Test
	public void givenMessage_EMPTY_ShouldReturnMoodAnalyzerException() throws MoodAnalyzerException {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		try {
			MoodAnalyzer.analyseMood("");
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.type.EMPTY, e.type);
		}
	}
}