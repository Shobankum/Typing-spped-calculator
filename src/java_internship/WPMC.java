package java_internship;


import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMC {
	public static float accuracy(String teststring, String typedwords) // Function to calculate the accuracy of the
																		// typed words with the given string and typed
																		// words as parameters
	{
		String[] ts = teststring.split(" "); // split the teststring into array of words
		String[] tw = typedwords.split(" "); // split the typedwords into array of words
		int correctwords = 0; // variable to count the number of correct words and is initialized to 0
		float ac; // variable to store the accuracy rate
		for (int i = 0; i < ts.length; i++) // traverse through the words in teststring array
		{
			if (tw.length <= i) // To maintain the loop count upto the length of the typed words
				break;
			else {
				if (ts[i].equals(tw[i])) // check if the typed word matches the given string's word
					correctwords = correctwords + 1; // if the condition is true, then increement the number of correct
														// words by 1
			}
		}
		ac = (float) correctwords / (float) ts.length; // Formula to calculate the accuracy rate
		return (ac * 100); // return the accuracy rate in percentage
	}

	public static void main(String[]args) throws InterruptedException {
    String[] words= {"envelope", "catelope", "cap", "beautiful","wonderful","more","through","go","come","sleep"};
      System.out.println("3");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("2");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("1");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("Start typing ");
      Random rand=new Random();
      for (int i=0;i<10;i++){
          System.out.print(words[rand.nextInt(9)]+" ");

      }
      System.out.println();
     double start= LocalTime.now().toNanoOfDay();
      Scanner sc=new Scanner(System.in);
      String Typewords=sc.nextLine();
      System.out.println(Typewords);
      double end=LocalTime.now().toNanoOfDay();
      double elapsedTime =end-start;

      double seconds=elapsedTime/1000000000.0;
      System.out.println(seconds);
      int numChars=Typewords.length();
      int wpm=(int) ((((double)numChars/5 ) /seconds)*60);
      System.out.println("your wpm is "+wpm+"");
      int cpm=(int)(((double)numChars)*60);
      System.out.println("Your cpm is "+cpm+"");
        String teststring = "";
        System.out.println(accuracy("accuracy is "+teststring,Typewords));
        sc.close();
	}
}
