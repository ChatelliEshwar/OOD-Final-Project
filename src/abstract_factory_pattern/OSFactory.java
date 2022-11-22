package abstract_factory_pattern;

//create an interface for Operating Systems
public interface OSFactory 
{
	
	Phone create(String manufacturer);	// define a function for manufacturer
	
	
}
