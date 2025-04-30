package Module2;

public class ReverseString {



	public static void main(String[] args)
	{
		String s = "MOM";
        String output = "";

        // Reverse the string
        for (int i = s.length() - 1; i >= 0; i--)
        {
            output += s.charAt(i);
        }

        // Print the results
        System.out.println("Input String: " + s);
        System.out.println("Reversed String: " + output);

        // Check if palindrom
        if (s.equals(output)) 
        {
            System.out.println("String is a Palindrome");
        } else 
        {
            System.out.println("String is not a Palindrome");
        }
    }
}