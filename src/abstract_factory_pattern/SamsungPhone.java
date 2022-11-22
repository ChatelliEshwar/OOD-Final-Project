package abstract_factory_pattern;

//create a  class for SamsungPhone
public class SamsungPhone implements Phone 
{

	@Override
	public String display_model() 	// display the model of the mobile phone
	{
		System.out.print("Model: Samsung Galaxy S21 Ultra");
		return "Model: Samsung Galaxy S21 Ultra";	// return the mobile model

	}

}
