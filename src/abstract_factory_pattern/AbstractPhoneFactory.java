package abstract_factory_pattern;

// create a  abstract class AbstractPhoneFactory 
public abstract class AbstractPhoneFactory 
{
	public static OSFactory getFactory(String choice) 
	{
		
		if ("ANDROID".equalsIgnoreCase(choice)) 	//if the user select the option ANDROID
		{
            return new AndroidFactory();	// return to  the function AndroidFactory
        } 
		else if ("iOS".equalsIgnoreCase(choice)) 	//if the user select the option IOS
		{
            return new IOSFactory();	// return to  the function IOSFactory
        }
		// if the user entered the other options
        throw new UnsupportedOperationException("Choice : " + choice + " not supported");
        
     
     }

}
