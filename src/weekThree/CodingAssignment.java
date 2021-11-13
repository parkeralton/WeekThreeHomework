package weekThree;

public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare variable
	int agesLength;
	int ageDelta;
	int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 23};//assign age values to array (including new age to test if it is dynamic
	int ageSum = 0;
	int i = 0; 
	
	agesLength = ages.length;//length of the ages array
	ageDelta = ages[agesLength-1]-ages[0];//delta between last and first age
	System.out.println("The difference in age is " +ageDelta);//answer to question 1a
	
	//following loop adds all age to be able to find average
	while (i<agesLength){
		ageSum = ageSum + ages[i];
		i=i+1;
	}
	
	System.out.println("The average age is " + ageSum/agesLength);//answer to 1c
	
	//Declare variables for question 2
	String[] names = new String[] {"Sam","Tommy","Tim","Sally", "Buck", "Rob"};//assign values to array
	int nameLengthSum=0;//sum of all name string lengths
	int namesLength; // Length of name array
	String concNames = names[0];
	
	namesLength = names.length;
	i=0; //reset i
	
	//loop to find sum of all strings in array
	while (i<namesLength){
		nameLengthSum = nameLengthSum + names[i].length();
		i=i+1;
	}
	//following is answer to 2a
	System.out.println("The average length of characters in "
			+ "a name is " + nameLengthSum/namesLength);
	
	i=1;
	
	//2c answer. concatenates names with spaces
	while (i<namesLength) {
		concNames = concNames + " " + names[i];
		i=i+1;
	}
	System.out.println(concNames);
	
	//Accessing the last element of an array. Question 3
	String lastElement = names[names.length - 1];
	//Accessing the first element of an array Question 4
	String firstElement = names[0];
	
	
	//QUESTION 5
	
	int totalNameLengths = 0;
	
	int[] nameLengths = new int[namesLength];
	
	i=0;
	
	while (i<namesLength) {
		nameLengths[i]=names[i].length();
		i=i+1;
	}
	//Question 6
	i=0;
	while (i<namesLength) {
		totalNameLengths = totalNameLengths + nameLengths[i];
		i=i+1;
	}
	
	System.out.println("Total character length is "+ totalNameLengths);
	
		//Test for Question 7
			//System.out.println(wordConc("Hello", 3)); Test for question 7
	
		//Test for Question 8
			//System.out.println(nameMaker("Parker", "Alton"));
		
		//Test for Question 9
			//int[] test = new int[] {5, 10,3};
			//System.out.println(arrayAddition(test));
			
		//Test for QUestion 10
			//double[] testArray = new double[] {2.3, 2.4, 2.2};
			//	System.out.println(doubleAvg(testArray));
			
		//Test for Question 11
			//	double[] testArray1 = new double[] {1.6, 2.4, 2.2};
			//	double[] testArray2 = new double[] {2.3, 2.4, 2.2};
			//	System.out.println(twoArrayCheck(testArray1, testArray2));
			
		//Test for Question 12
			
			//	System.out.println(willBuyDrink(true, 9.0));
			
			
		//Test for Question 13
			//	System.out.println(invoiceCheck(true, 124));
	}

	
	//Question 13
	public static boolean invoiceCheck(boolean match, double rate) {
		// TODO Auto-generated method stub
		//this method will check to see if an invoice received should be paid or not. 
		// variable match is for weather or not the invoice matches goods or services received
		// variable rate is the rate at witch the invoice is being billed
		//if the invoice matches good received and rate is less than or equal to 
		//quoted price, invoice is approved.
		if (match = true && rate <= 123.00) return true;
		else return false;
	}


//Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// TODO Auto-generated method stub
		if (isHotOutside = true && moneyInPocket> 10.5) return true;
		else return false;
	}


//Question 11
	public static boolean twoArrayCheck(double[] a1, double[] a2) {
		// TODO Auto-generated method stub
		
		if (doubleAvg(a1)>doubleAvg(a2)) return true;
		else return false;
	}


//Question 10
	public static double doubleAvg(double[] doubleArray) {
		// TODO Auto-generated method stub
		int doubleArrayLength = doubleArray.length;
		double arraySum = 0;
		int i =0;
				
	while (i<doubleArrayLength) {
		
		arraySum = arraySum + doubleArray[i];
		
		i=i+1;}
		
		return (arraySum/doubleArrayLength);
	
		
	}


//Question 9
	public static boolean arrayAddition(int[] numbers) {
		// TODO Auto-generated method stub
		int arrayLength = numbers.length;
		int totalSum =0;
		
		for (int i =0; i<arrayLength; i=i+1) {
			totalSum = totalSum + numbers[i];
		}
		if (totalSum>100)return true;
		else return false;
		}
				
//Question 8
	public static String nameMaker(String firstName, String lastName) {
		// TODO Auto-generated method stub
		
		return firstName + " " + lastName;
	}

//Question 7
	public static String wordConc(String word, int n) {
	
		String finalWord = word;
		
		for (int i = 1; i<n; i=i+1) {
			
			finalWord = finalWord + word;
					
		}
		return finalWord;
	}
	
}
