package abstract_factory_pattern;

// import required packages
import java.io.*;

// create a class to execute the design pattern
public class AbstractFactoryPatternExample {

	public static void main(String[] args) throws IOException // main method
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // create a reader to read the user
																					// inputs
		System.out.print("\nChoose Operating System (ANDROID / IOS): ");
		String type = br.readLine(); // read the input entered by the user
		if ("ANDROID".equalsIgnoreCase(type)) // if the user select the OS 'ANDROID'
		{
			try {

			System.out.print("\nChoose ManuFacturer(SAMSUNG / MOTOROLA / LG / GOOGLE): "); // display message for user
																							// choose the manufacturer
			String manufacturer = br.readLine(); // read the input entered by the user
			System.out.println();
			OSFactory factory = AbstractPhoneFactory.getFactory(type); // create a instance for the OSFactory
			Phone phone = factory.create(manufacturer); // select a mobile manufacturer from user input
			phone.display_model(); // display the mobile model
			}catch(UnsupportedOperationException uoe) {
				System.out.println(uoe.getMessage());
			}

		}

		else if ("IOS".equalsIgnoreCase(type)) // if the user select the OS 'iOS'
		{
			OSFactory factory = AbstractPhoneFactory.getFactory(type); // create a instance for the OSFactory
			Phone ApplePhone = factory.create("APPLE"); // select a mobile manufacturer
			ApplePhone.display_model(); // display the mobile model

		} else {
			System.out.println("Invalid selection");
		}

	}

}
