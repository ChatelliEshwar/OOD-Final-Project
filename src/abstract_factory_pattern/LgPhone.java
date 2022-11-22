package abstract_factory_pattern;


//create a  class for LgPhone
public class LgPhone implements Phone 
{

	@Override
	public String display_model() 	// display the model of the mobile phone
	{
		System.out.print("Model: LG G7 ThinQ");
		return "Model: LG G7 ThinQ";	// return the mobile model

	}

}
