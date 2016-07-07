import java.util.Scanner;

public class Exercise1Final {
	
	public static int letterToNumber(String[] hellArray, String string1) { 
		
		// this method returns the position of the string inside the array
		
		boolean flag = false; 
		int thesi = 0; 
		int f = 0; 
		while (f < hellArray.length && flag == false) {
			if (hellArray[f].equals(string1)) {
				flag = true; //stop while when find it
				thesi = f + 1;
			}
			f = f + 1;
		}
		return thesi; // returns position
	}
	
	public static boolean findString (String[] hellArray, String string1) {
		
		// this method returns true if finds the string inside the array
		
		boolean flag = false; 
		int f = 0; 
		while (f < hellArray.length && flag == false) {
			if (hellArray[f].equals(string1)) {
				flag = true;  //stop while when find it
			}
			f = f + 1;
		}
		return flag; 
	}

	
	public static void main(String[] args) {
		
		//main method 
		
		// creating the array with the first 1000 hellenic numbers
		
		String [] hellenic = new String[1000]; // array with hellenic numbers
		int[] psDipsif = new int[2]; // array with the digits of a number with 2 digits
		int[] psTripsif = new int[3]; // array with the digits of a number with 2 digits
		int plithos = 0; // counter
		int[] finalNumbers = new int[2]; // array where are the numbers that the user inserted in decimal   
		String[] arabic = new String[1000]; //array with Arabic numbers
		
		for (int k = 0; k < hellenic.length; k++) {
			hellenic[k] = " "; //initializing the array with " " 
		}
		for (int i = 0; i < hellenic.length; i++) { // initializing the special characters of hellenic 
			if (i + 1 == 1) { 
				hellenic[i] = "Á\'";
			} else if (i + 1 == 2) {
				hellenic[i] = "Â\'";
			} else if (i + 1 == 3) {
				hellenic[i] = "Ã\'";
			} else if (i + 1 == 4) {
				hellenic[i] = "Ä\'";
			} else if (i + 1 == 5) {
				hellenic[i] = "Å\'";
			} else if (i + 1 == 6) {
				hellenic[i] = "ò\'";
			} else if (i + 1 == 7) {
				hellenic[i] = "Æ\'";
			} else if (i + 1 == 8) {
				hellenic[i] = "Ç\'";
			} else if (i + 1 == 9) {
				hellenic[i] = "È\'";
			} else if (i + 1 == 10) {
				hellenic[i] = "É\'"; 
			} else if (i + 1 == 20) {
				hellenic[i] = "Ê\'";
			} else if (i + 1 == 30) {
				hellenic[i] = "Ë\'";
			} else if (i + 1 == 40) {
				hellenic[i] = "Ì\'";
			} else if (i + 1 == 50) {
				hellenic[i] = "Í\'";
			} else if (i + 1 == 60) {
				hellenic[i] = "Î\'";
			} else if (i + 1 == 70) {
				hellenic[i] = "Ï\'";
			} else if (i + 1 == 80) {
				hellenic[i] = "Ð\'";
			} else if (i + 1 == 90) {
				hellenic[i] = "Q\'";
			} else if (i + 1 == 100) {
				hellenic[i] = "Ñ\'";
			} else if (i + 1 == 200) {
				hellenic[i] = "Ó\'";
			} else if (i + 1 == 300) {
				hellenic[i] = "Ô\'";
			} else if (i + 1 == 400) {
				hellenic[i] = "Õ\'";
			} else if (i + 1 == 500) {
				hellenic[i] = "Ö\'";
			} else if (i + 1 == 600) {
				hellenic[i] = "×\'";
			} else if (i + 1 == 700) {
				hellenic[i] = "Ø\'";
			} else if (i + 1 == 800) {
				hellenic[i] = "Ù\'";
			} else if (i + 1 == 900) {
				hellenic[i] = "W\'";
			} else if (i + 1 == 1000) {
				hellenic[i] = ",A\'";
			} else {
				//seperating the digits of number
				if (i + 1 >= 100 && i + 1 < 1000) { // if number has 3 digits
					plithos = 0;
					int modAr = (i + 1) % 10; //mod
					plithos = 2;
					int divAr = (i + 1) / 10; //div
					psTripsif[2] = modAr;
					
					while (divAr != 0 && plithos >= 0) {
						modAr = divAr % 10;
						plithos = plithos - 1;
						psTripsif[plithos] = modAr;
						divAr = divAr / 10; 
					}
										
					if (psTripsif[2] == 0 && psTripsif[1] != 0) { 
						//if last digit of 3-digited number is equal to 0 and the second not
						
						hellenic[i] = hellenic[100*psTripsif[0] - 1] + hellenic[10*psTripsif[1] - 1];
						
					} else if (psTripsif[1] == 0 && psTripsif[2] != 0) {
						//if last digit of 3-digited number is not equal to 0 and the second is
						hellenic[i] = hellenic[100*psTripsif[0] - 1] + hellenic[1*psTripsif[2] - 1]; 
						
					} else if (psTripsif[1] != 0 && psTripsif[2] != 0) {
						//if last digit of 3-digited number is not equal to 0 and the second too
						hellenic[i] = hellenic[100*psTripsif[0] - 1] + hellenic[10*psTripsif[1] - 1] + hellenic[1*psTripsif[2] - 1]; 
						
					}
					
				} else if (i + 1 > 10 && i + 1 < 100) { //2-digited number
					plithos = 2;
					int modAr = (i + 1) % 10;
					int divAr = (i + 1) / 10; 
					psDipsif[1] = modAr;
					modAr = divAr % 10;
					divAr = divAr / 10;
					psDipsif[0] = modAr;
					hellenic[i] = hellenic[10*psDipsif[0] - 1];	
					hellenic[i] = hellenic[i] + hellenic[1*psDipsif[1] - 1];
				} 
			}	
		} 
		
		// creating the array with the first 1000 latin numbers
		
		
		String[] latin = new String[1000]; //array with latin numbers
		int[] latinValue = new int[1000]; 
		// array with the value of each number, for example I has value 1
		
		for (int o = 0; o < latin.length; o++) {
			latin[o] = " "; //initializing latin array with " "
		}
		for (int y = 0; y < latin.length; y++) { //give value to specific basic characters of latin numbers
			if (y + 1 == 1) {
				latin[y] = "I";
				latinValue[y] = 1;
			} else if (y + 1 == 5) {
				latin[y] = "V";
				latinValue[y] = 5;
			} else if (y + 1 == 10) {
				latin[y] = "X";
				latinValue[y] = 10;
			} else if (y + 1 == 50) {
				latin[y] = "L";
				latinValue[y] = 50;
			} else if (y + 1 == 100) {
				latin[y] = "C";
				latinValue[y] = 100;
			} else if (y + 1 == 500) {
				latin[y] = "D";
				latinValue[y] = 500;
			} else if (y + 1 == 1000) {
				latin[y] = "M";
				latinValue[y] = 1000;
				
			} else { // creating these : II III XX XXX CC CCC
					if ((latin[y - 1].equals("I") || latin[y-1].equals("X") || latin[y-1].equals("C")) && latin[y].equals(" ")) {
						for (int m = 2; m <= 3; m++) {
							latin[latinValue[y-1] * m - 1] = latin[y-1]; // initializing
							
							for (int a = 0; a < m - 1; a++) {		
								latin[latinValue[y-1] * m - 1] = latin[y-1] + latin[latinValue[y-1] * m - 1];
							}
							 
							}
					}	
			}		
		}
		
		// creating these: IV IX XL XC CD CM
		for (int t = 0; t < latin.length - 100; t++) {
			
			if ((latinValue[t + 1] == 5 || latinValue[t + 1] == 10) && latin[t].equals(" ")) { 
				
				int dist = 1; //distance between the y and y + 1
				latin[t] = latin[dist - 1] + latin[t + 1];
				
			} else if ((latinValue[t + 10] == 50 || latinValue[t + 10] == 100) && latin[t].equals(" ")) {
				
				int dist = 10; //distance between the y and y + 10
				latin[t] = latin[dist - 1] + latin[t + 10];
				
			} else if ((latinValue[t + 100] == 500 || latinValue[t + 100] == 1000) && latin[t].equals(" ")) { 
				
				int dist = 100; //distance between the y and y + 100
				latin[t] = latin[dist - 1] + latin[t + 100];
				
			}
		}
		
		for (int s = 0; s < latin.length; s++) {
			if (latin[s] == " ") {
				int sDiair = latinValue[0]; //value of the basic number that will help us to calculate
				for (int v = 0; v < s; v++) {
					if (latinValue[v] > sDiair) {
						sDiair = latinValue[v];
					}
				}
				if ((s >= 90 && s <= 98) || (s >= 900 && s <= 998)) {
					if (s >= 900) {
						sDiair = 900;
					}	else {
						sDiair = 90;
					}
					//System.out.println((s + 1 ) % sDiair); 
				}
				int sMod = (s + 1 ) % sDiair; 
				
				int sDiv = (s + 1) / sDiair;
				if (sMod != 0) {
					latin[s] = latin[(sDiair * sDiv) - 1] + latin[sMod - 1];
				} else {
					latin[s] = latin[(sDiair * sDiv) - 1];
				}
			}
		}
				
		//create the array with the first 1000 arabic numbers
		
		
		for (int c = 0; c < arabic.length; c++) {
			arabic[c] = Integer.toString(c + 1); // converting for example 1 to "1"
		}
		
		// the procedure that user write the arithmetic expression
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("");
		System.out.print("Please insert the arithmetic expression you want to be calculated in this way: number1(space)arithmetic operator(space)number2 ");
		String ekf = scanner.nextLine();
		System.out.println("");
		String[] telestes = new String[4]; //array with the 4 arithmetical operators
		String str1 = "+", str2 = "*", str3 = "/";
		telestes[0] = str1;
		telestes[1] = "-";
		telestes[2] = str2;
		telestes[3] = str3;
		
		while (ekf.length() > 0) {
			
			String[] parts = ekf.split(" ", 3); //split the string to 3 strings 
			String part1 = parts[0]; 
			String part2 = parts[1]; 
			String part3 = parts[2];	
			String[] numbers = new String[2];// has the final 2 numbers that user wrote 
			
			for (int j = 0; j < numbers.length; j++) {
				numbers[j] = parts[j]; //initializing 
			}
		
			int thesiTelesti = 0; //position of the arithmetic operator
			for (int i = 0; i < parts.length; i++) {
				for (int k = 0; k < telestes.length; k++) {
					if (parts[i].equals(telestes[k])) { 
						thesiTelesti = i; //position of the arithmetic operator to parts array
											
					}
				}	
			}
			
			for (int u = 0; u < numbers.length; u++) {
				if (numbers[u].equals(parts[thesiTelesti])) { //if numbers[u] has the value of operator
					numbers[u] = parts[thesiTelesti + 1]; //save the third part of string
				}
			}
			
			//check which is the array that the number is content of
			
			
			for (int r = 0; r < numbers.length; r++) {
				boolean flag1 = findString(hellenic, numbers[r]); //check if the number is in hellenic array
				boolean flag2 = findString(latin, numbers[r]); //check if the number is in latin array
				boolean flag3 = findString(arabic, numbers[r]); //check if the number is in arabic array
				if (flag1 == true) { 
					finalNumbers[r] = letterToNumber(hellenic, numbers[r]); //checking the position which is equal to the value in decimal
		
				} else if (flag2 == true) { 
					finalNumbers[r] = letterToNumber(latin, numbers[r]); //checking the position which is equal to the value in decimal
				
				} else if (flag3 == true) { 
					finalNumbers[r] = letterToNumber(arabic, numbers[r]); //checking the position which is equal to the value in decimal
				}		
			}	
			
			int finalSum = 0;  //final calculation
			for (int l = 0; l < finalNumbers.length; l++) {
				finalSum = finalSum + finalNumbers[l]; //the final number in arabic arithmetics
			}
			
			System.out.print("The final number in Arabic Numerals is ");
			System.out.println(finalSum);
			String finalSumLatin = latin[finalSum - 1]; //the final number in latin arithmetics
			String finalSumHellenic = hellenic[finalSum - 1]; //the final number in hellenic arithmetics
			System.out.print("The final number in Roman Numerals is ");
			System.out.println(finalSumLatin);
			System.out.print("The final number in Hellenic Numerals is ");
			System.out.println(finalSumHellenic);
				
			System.out.println("");
			System.out.print("Please insert the arithmetic expression you want to be calculated in this way: number1(space)arithmetic operator(space)number2 ");
			ekf = scanner.nextLine();
			System.out.println("");
			
		}

	} // end of main
} // end of class


