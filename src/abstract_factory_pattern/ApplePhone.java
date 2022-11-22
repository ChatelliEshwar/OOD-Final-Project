package abstract_factory_pattern;

//create a  ApplePhone class
public class ApplePhone implements Phone 
{

	@Override
	public String display_model()	// display the model of the mobile phone
	{
		System.out.print("Model: iPhone 14 pro Max");
		return "Model: iPhone 14 pro Max";	// return the mobile model 

	}

}
