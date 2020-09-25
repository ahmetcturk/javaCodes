package preBootCamp;

import java.util.Scanner;
class Example {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("# in:");
    int amt = inp.nextInt();
    inp.nextLine(); //this line is necessary
    System.out.print("word:");
    String word = inp.nextLine();
    int i = word.length()-1;
    if(amt==1){
      System.out.println(amt + word);
    }
    else if(word.substring(word.length()-2).equals("sh") || word.substring(word.length()-2).equals("ch")){
       System.out.println(amt  +  word+"es");
    }
     else if(word.substring(word.length()-2).equals("fe")){
       word = word.replace ("fe","ves");
       System.out.println(amt  + word);
    }
    else if (word.substring(word.length()-2).equals("us")){
       word = word.replace ("us","i");
       System.out.println(amt  +  word);
    }
    else if (word.substring(word.length()-2).equals("ay") || word.substring(word.length()-2).equals("oy")
    	|| word.substring(word.length()-2).equals("ey") || word.substring(word.length()-2).equals("uy") ){
       System.out.println(amt  +  word+"s");
    }
    else if (word.substring(word.length()-1).equals("y")){
       word = word.replace ("y","ies");
       System.out.println(amt +" "+  word);
    }
     else if (amt>1 || amt == 0){
       System.out.println(amt  + word+"s");
  }
}
}