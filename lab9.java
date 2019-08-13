/****
* Yamel Hernandez 80590552
/*****/


import java.util.Scanner;

public class lab9 {

    /***** Method from printing triangles of stars 
     ***** Given to you *****/
    public static void printTriangleOfStars(int size) {
        for (int i=0; i<size; i++) {
            for (int j=0; j<= i; j++) //prints out the triangle on the side of the screen
                System.out.print("* ");
            System.out.println();
        }
	}

    /***** Functionality 1 ***********************************************************************
     ***** Method for printing centered triangles of stars of a size given by the user
     ***** The triangle should not "lean" on the left side but be centered
     ***** The signature is given to you
     ***** You have to complete the body of the method ************/
    /***** EXAMPLE: for a size of 5, your functionality will print the following triangle:
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
                
     ***** Note: this is just an example: your method should work for any size of triangle            
     *********************************************************************************************************/            
    public static void printCenteredTrianglesOfStars(int size) {
            for (int i=0; i<size; i++){
				for (int x = size -i -1; x > 0; x--) {
					System.out.print(" ");
				}							//prints out triangle centered due to two for loop statements, one for the triangle and the other to center it
            	for (int j=0; j<= i; j++){ //still need to create another loop to make it upside down
                	System.out.print("* ");
				}
				System.out.println();
			}
    }
    
    /***** Functionality 2 ***********************************************************************
     ***** Method for printing centered triangles of any symbol as passed as a parameter
     ***** whose size is given by the user as for previous functionalities
     ***** The triangle should not "lean" on the left side but be centered
     ***** The signature is PARTIALLY given to you
     ***** You have to complete the signature and the body ************/
    /***** EXAMPLE: for a size of 5 and the character &, your functionality will print the following triangle:
                    &
                   & &
                  & & &
                 & & & &
                & & & & &
                
     ***** Note: this is just an example: your method should work for any size of triangle and any character            
     ***********************************************************************************************************/            
    public static void printCenteredTrianglesOfSymbols(int size) {
       	Scanner input = new Scanner(System.in);
        System.out.println("Enter the symbol for the triangle you wish to create: ");
		String symbol = input.nextLine(); //same thing as the centered triangle, only changed the *'s to be user input symbol
			for (int i=0; i<size; i++){
				for (int x = size -i -1; x > 0; x--) {
					System.out.print(" ");
				}
            	for (int j=0; j<= i; j++){
                	System.out.print(symbol + " ");
				}
				System.out.println();
			}
    }
    
    /***** Functionality 3 ***********************************************************************
     ***** Method for printing a thick square of stars of the side size given by the user
     ***** and of thickness given by the user as well 
     ***** The signature is given to you
     ***** You have to complete the body of the method ************/
    /***** EXAMPLE: for a size of 9 and a thickness of 2, your functionality will print the following square:
                *********
                *********
                **     **
                **     **
                **     **
                **     **
                **     **
                *********
                *********
                
     ***** Note: this is just an example: your method should work for any size and thickness of square            
     ************************************************************************************************************/            
    public static void printThickSquare(int side, int thickness) {
			for (int i = 0; i < side; i++) {
				for (int x = 0; x < side; x++){ //prints out a square, pretty much the same type of loops as the triangle in the beginning, but making it a square, couldn't figure out how to make the inside empty
					System.out.print("*");
				}
					System.out.println();
			}
		}
    
    /***** Functionality 4 ***********************************************************************
     ***** Method for printing a diamond of stars of the side size given by the user
     ***** The signature is given to you
     ***** You have to complete the body of the method ************/
    /***** EXAMPLE: for a size of side 5, your functionality will print the following diamond:
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
                 * * * *
                  * * *
                   * *
                    *
                                
     ***** Note: this is just an example: your method should work for any size of diamond            
     ************************************************************************************************************/            
    public static void printDiamondOfStars(int side) {
			for (int i=0; i<side; i++){
				for (int x = side -i -1; x > 0; x--) {
					System.out.print(" ");
				} 							// supposed to print a triangle was gonna figure out how to print it upside down to complete the triangle
            	for (int j=0; j<= i; j++){
                	System.out.print("*");
				}
				System.out.println();
			
    }
	}
							
    /************************************************************************************************************
     * Below is the main method you will have to complete to allow
     * testing the printing functionalities you will have designed
     ************************************************************************************************************/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the triangle of stars you want to print: ");
        int size = input.nextInt();
        printTriangleOfStars(size);
        
        // Here goes your code to test the other 4 methods your designed...
		
		printCenteredTrianglesOfStars(size);
		System.out.println("Enter the size of the triangle of symbols you want to print: ");
		size = input.nextInt();
		printCenteredTrianglesOfSymbols(size);
		System.out.println("Enter the thickness of the square of stars you want to print: ");
		int thickness = input.nextInt();
		System.out.println("Enter the size of the square of stars you want to print: ");
		int side = input.nextInt();
		printThickSquare(side, thickness);
		System.out.println("Enter the size of the diamond of symbols you want to print: ");
		side = input.nextInt();
		printDiamondOfStars(side);
		
    }
        
}