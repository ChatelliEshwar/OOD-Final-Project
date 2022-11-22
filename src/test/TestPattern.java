package test;

// import all required packages
import org.junit.jupiter.api.Test;

import abstract_factory_pattern.AbstractPhoneFactory;
import abstract_factory_pattern.OSFactory;
import abstract_factory_pattern.Phone;

import org.junit.jupiter.api.Assertions;

// create a class to test the design pattern
public class TestPattern
{
	
	@Test
    public void makeGooglePhone() 
	{
		OSFactory factory = AbstractPhoneFactory.getFactory("ANDROID");	// get the OS type
        Phone phone = factory.create("GOOGLE");	// select manufacturer to create a phone
        Assertions.assertEquals("Model: Google Pixel 7 Pro",phone.display_model());		//true
    }
	
	@Test
    public void makeLgPhone()
	{
		OSFactory factory = AbstractPhoneFactory.getFactory("ANDROID");	// get the OS type
        Phone phone = factory.create("LG");	// select manufacturer to create a phone
        Assertions.assertEquals("Model: LG G7 ThinQ",phone.display_model());	//true
    }
	
	@Test
    public void makeSamsungPhone()
	{
		OSFactory factory = AbstractPhoneFactory.getFactory("ANDROID");		// get the OS type
        Phone phone = factory.create("SAMSUNG");		// select manufacturer to create a phone
        Assertions.assertEquals("Model: Samsung Galaxy S21 Ultra",phone.display_model());	//true
    }
	
	@Test
    public void makeMotorolaPhone()
	{
		OSFactory factory = AbstractPhoneFactory.getFactory("ANDROID");		// get the OS type
        Phone phone = factory.create("MOTOROLA");		// select manufacturer to create a phone
        Assertions.assertEquals("Model: Moto G7 Power",phone.display_model());		//true
    }
	
	@Test
    public void makeAppleiPhone()
	{
		OSFactory factory = AbstractPhoneFactory.getFactory("IOS");		// get the OS type
        Phone phone = factory.create("APPLE");		// select manufacturer to create a phone
        Assertions.assertEquals("Model: iPhone 14 pro Max",phone.display_model());		//true
    }
	
	
	
}
