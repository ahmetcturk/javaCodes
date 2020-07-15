package week10Recap;
import java.util.Scanner;
import java.util.Random;
import java.applet.Applet;
import java.awt.*;
//8-ball java.The idea is a simple magic 8-ball program complete with graphics.  
//Hopefully I will get extra credit
//Requirements: 20 possible answers, user must input a yes/no question. Output answer on an 8 ball, possibly more creative.
//Design: random number generator for the 20 possible values, use a swith statement to pick out the answer.  Use a driver method to drive.  And output onto an applet.
//The driver method should ask user to input a question. Then reply the answer on an 8 ball by creating an object and calling the answer method.  
//Then this method should be applied onto an applet.

class Answers
{  
private int selection;
private String response;

public Answers(int x)
{
  selection = x;
}

public String answer()
{
  switch (selection)
  {
    case 1: response = "It is certain"; break;
    case 2: response = "It is decidedly so"; break;
    case 3: response = "Without a doubt"; break;
    case 4: response = "Yes – definitely"; break;
    case 5: response = "You may rely on it"; break;
    case 6: response = "As I see it, yes"; break;
    case 7: response = "Most likely"; break;
    case 8: response = "Outlook good"; break;
    case 9: response = "Signs point to yes"; break;
    case 10: response = "Yes"; break;
    case 11: response = "Reply hazy, try again"; break;
    case 12: response = "Ask again later"; break;
    case 13: response = "Better not tell you now"; break;
    case 14: response = "Cannot predict now"; break;
    case 15: response = "Concentrate and ask again"; break;
    case 16: response = "Don't count on it"; break;
    case 17: response = "My reply is no"; break;
    case 18: response = "My sources say no"; break;
    case 19: response = "Outlook not so good"; break;
    case 20: response = "Very doubtful"; break;
    default: response = "nothing";
  }
  return response;
}
}


class Ball_8
{
public static void main(String []args)
{
  String question;
  
  Scanner scan = new Scanner(System.in);
  Random generator = new Random();
  
  System.out.println("Ask away. (Preferably yes or no questions");
  question = scan.next();
  Answers quest = new Answers(generator.nextInt(20)+1);
  System.out.println(quest.answer());
}
}


class DrawBall extends Applet
{
public void paint(Graphics page)
{
  final int MID =150;
  setBackground(Color.cyan);
  page.setColor(Color.black);
  page.fillOval(0,0,300,300);
  page.setColor(Color.blue);
  page.fillOval(75,60,150,150);
  page.setColor(Color.white);
  page.drawLine(MID-65,100, MID+65,100);
  page.drawLine(MID-65,100, MID,210);
  page.drawLine(MID+65,100, MID,210);
}
}
