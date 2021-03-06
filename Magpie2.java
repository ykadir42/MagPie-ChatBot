/**
Activity 2 Answer Sheet
Orig. Author Laurie White
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("platek") >= 0
				|| statement.indexOf("richard") >= 0)
		{
			response = "I heard he's PRETTY good.";
		}
		else if (statement.trim().length() == 0)
		{
			response = "Please write something.";
		}
		else if (statement.indexOf("meme") >= 0
				|| statement.indexOf("haha") >= 0
				|| statement.indexOf("xd") >= 0)
		{
			response = "That's really funny!";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Cool story, bro.";
		}
		else if (whichResponse == 5)
		{
			response = "I'm feeling depressed right now.";
		}

		return response;
	}
}

/*
	Keyword:Response
	meme : That's really funny!
	haha : That's really funny!
	xd   : That's really funny!
	

	Question: It detects it anyway.
*/
