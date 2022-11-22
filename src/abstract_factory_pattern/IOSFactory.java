package abstract_factory_pattern;

// create a class for IOSFactory
public class IOSFactory implements OSFactory 
{

	@Override
	public Phone create(String type) 	// override the method create in OSFactory interface
	{
		if ("APPLE".equalsIgnoreCase(type)) 	//if the user select the option APPLE
		{
			return new ApplePhone();	// return to  the function ApplePhone
        } 
		// if the user entered the other options
		System.out.print("Invalid ManuFacturer for the selected operating System!!!");
        throw new UnsupportedOperationException("Choice : " + type + " not supported");

	}
}