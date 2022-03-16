class Main {
  public static void main(String[] args) {
    //tests
	  //sfsndcs
      //cvjjmbmn
	     // /gndfvlevn
	      //vnlvnlnvn
	  //1243124
	      
    System.out.println(generatePlate("VA")); // -> e.g "ADS-2252"
    System.out.println(generatePlate("MD")); // -> e.g "3BS6121"
    System.out.println(generatePlate("DC")); // -> e.g "NS7821"
    System.out.println(generatePlate("NY")); // -> ""

  }
   // implement the method
  public static String generatePlate(String str){
    
    int letter1 = 65 + (int)(Math.random() * (90 - 65));
		int letter2 = 65 + (int)(Math.random() * (90 - 65));
		int letter3 = 65 + (int)(Math.random() * (90 - 65));	
    int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);
    
		System.out.println("" + (char)(letter1) + ((char)(letter2)) + 
			((char)(letter3)) + number1 + number2 + number3 + number4);

    //fyghkjjjljlkhjg
    return "";
  }
}





