package abstract_factory_pattern;

//create a  class for GooglePhone
public class GooglePhone implements Phone 
{

	@Override
	public String display_model() 	// display the model of the mobile phone
	{		
		System.out.print("Model: Google Pixel 7 Pro");
		return "Model: Google Pixel 7 Pro";		// return the mobile model 
	}

}
