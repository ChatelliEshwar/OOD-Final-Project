package abstract_factory_pattern;

//create a  class for MotorolaPhone
public class MotorolaPhone implements Phone 
{

	@Override
	public String display_model() 	// display the model of the mobile phone
	{
		System.out.print("Model: Moto G7 Power");
		return "Model: Moto G7 Power";		// return the mobile model

	}

}
