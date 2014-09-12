package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner questionScanner;
	private Scanner numberScanner;
	
	public Questions()
	{
		questionScanner = new Scanner(System.in);
		numberScanner = new Scanner(System.in);
		
	}
	
	public void start()
	{
		//askQuestions();
		askQuestionsGUI();
		//numberQuestions();
	
	}
	
	private void askQuestionsGUI()
	{
		//JOptionPane.showMessageDialog(null, "What is your name?");
		String answerGUI = JOptionPane.showInputDialog("What is your name?");
		answerGUI = JOptionPane.showInputDialog("Hi, " + answerGUI + ". What is your favorite color?");
		if(answerGUI.equals("Pink"))
		{
			JOptionPane.showInputDialog(null, "Pink is my favorite color, too! Of course it's your favorite color, right?");
			answerGUI = JOptionPane.showInputDialog(null, "Are you sure it's your favorite color?");
			if(answerGUI.equals("Yes"))
			{
				JOptionPane.showMessageDialog(null, "Alrighty then.");
			}
			else if(answerGUI.equals("No"))
			{
				JOptionPane.showMessageDialog(null, "You sure are gullible, aren't you?");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "I don't think " + answerGUI +" was the answer I was looking for. Try 'Yes' or 'No' next time.");
			}
			
		}
		else if(answerGUI.equals("Blue"))
		{
			JOptionPane.showInputDialog(null, "I sort of like Blue, but I like pink better. This is your favorite color, Yes?");
			answerGUI = JOptionPane.showInputDialog(null, "Are you sure it's your favorite color?");
			if(answerGUI.equals("Yes"))
			{
				JOptionPane.showMessageDialog(null, "Alrighty then.");
			}
			else if(answerGUI.equals("No"))
			{
				JOptionPane.showMessageDialog(null, "You sure are gullible, aren't you?");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "I don't think " + answerGUI +" was the answer I was looking for. Try 'Yes' or 'No' next time.");
			}
			
		}
		else if(answerGUI.equals("Brown"))
		{
			JOptionPane.showInputDialog(null, "Isn't brown a rather dull color? (Are you sure it's your favorite color?)");
			answerGUI = JOptionPane.showInputDialog(null, "Are you sure it's your favorite color?");
			if(answerGUI.equals("Yes"))
			{
				JOptionPane.showMessageDialog(null, "Alrighty then.");
			}
			else if(answerGUI.equals("No"))
			{
				JOptionPane.showMessageDialog(null, "You sure are gullible, aren't you?");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "I don't think " + answerGUI +" was the answer I was looking for. Try 'Yes' or 'No' next time.");
			}
			
		}
		else if(answerGUI.equals("Grey"))
		{
			JOptionPane.showInputDialog(null, "I guess Grey is OK, Silver is better than Grey though. (Are you sure Grey is your favorite color?)");
			answerGUI = JOptionPane.showInputDialog(null, "Are you sure it's your favorite color?");
			if(answerGUI.equals("Yes"))
			{
				JOptionPane.showMessageDialog(null, "Alrighty then.");
			}
			else if(answerGUI.equals("No"))
			{
				JOptionPane.showMessageDialog(null, "You sure are gullible, aren't you?");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "I don't think " + answerGUI +" was the answer I was looking for. Try 'Yes' or 'No' next time.");
			}
			
		}
		else
		{
			JOptionPane.showInputDialog(null, "I see, so you think " + answerGUI + " is your favorite color. (Are you sure?)");
			answerGUI = JOptionPane.showInputDialog(null, "Are you sure it's your favorite color?");
			if(answerGUI.equals("Yes"))
			{
				JOptionPane.showMessageDialog(null, "Alrighty then.");
			}
			else if(answerGUI.equals("No"))
			{
				JOptionPane.showMessageDialog(null, "You sure are gullible, aren't you?");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "I don't think " + answerGUI +" was the answer I was looking for. Try 'Yes' or 'No' next time.");
			}
			
		}
		
		
		
		
	}
	private String showInputDialog(Object object, String string)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private void numberQuestions()
	{
		System.out.println("How many fingers do I have?");
		int i = numberScanner.nextInt();
		if(i == 0)
		{
			System.out.println("Smart aleck. Of course I don't have any fingers, I'm a computer.");
		}
		else
		{
			System.out.println("Nope. I don't have "+ i + " fingers.");
		}
		System.out.println("How many numbers are in the alphabet?");
		i = numberScanner.nextInt();
		if(i == 0)
		{
			System.out.println("Nice. It seems you're smarter than the average human.");
		}
		else
		{
			System.out.println("That's foolish. There aren't "+ i + " numbers in the alphabet. The alphabet uses letters, not numbers.");
		}
	}

	public void askQuestions()
	{
		System.out.println("What is your name?");
		String answer = questionScanner.nextLine();
		System.out.println("Why, hello there " + answer + ". How are you today?");
		answer = questionScanner.nextLine();
		System.out.println("You feel "+ answer +". Uhh that's nice...");
		System.out.println("So what do you like to do for fun?");
		answer = questionScanner.nextLine();
		System.out.println(""+ answer + " sounds like fun.");
		System.out.println("What's your social security number, bank account, and mother's maiden name?");
		answer = questionScanner.nextLine();
		System.out.println("Haha, I didn't expect any real answer for that one.");
		System.out.println("What's your favorite color?");
		answer = questionScanner.next();
		System.out.println("I see, so "+ answer + " is your favorite color. My favorite color is Pink.");
		System.out.println("What's your favorite pokemon?");
		answer = questionScanner.next();
		if(answer.equals("Mew"))
		{
			System.out.println("Mew's my favorite, too!");
		}
		else
		{
			System.out.println(""+ answer + ", huh? My favorite is Mew.");
		}
		
		
	}

}
