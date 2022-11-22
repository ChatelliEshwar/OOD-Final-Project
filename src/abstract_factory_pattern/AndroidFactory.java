package abstract_factory_pattern;

//create a  class AndroidFactory
public class AndroidFactory implements OSFactory {

	@Override
	public Phone create(String type) // override the method create in OSFactory interface
	{

		if ("SAMSUNG".equalsIgnoreCase(type)) // if the user select the option SAMSUNG
		{
			return new SamsungPhone(); // return to the function SamsungPhone
		} else if ("MOTOROLA".equalsIgnoreCase(type)) // if the user select the option MOTOROLA
		{
			return new MotorolaPhone(); // return to the function MotorolaPhone
		} else if ("LG".equalsIgnoreCase(type)) // if the user select the option LG
		{
			return new LgPhone(); // return to the function LgPhone
		} else if ("GOOGLE".equalsIgnoreCase(type)) // if the user select the option GOOGLE
		{
			return new GooglePhone(); // return to the function GooglePhone
		}
		// if the user entered the other options
		throw new UnsupportedOperationException(
				"Manufacturer " + type + " not available for this type of Opearting System");

	}
}