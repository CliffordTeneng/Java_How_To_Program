import java.util.Scanner;

class BarChartPrintingProgram{

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

      do{ 
            System.out.print("Please enter a number");
            int num1 = input.nextInt();
        }while(num1 < 0 || num1 > 30);
      do{ 
            System.out.print("Please enter a number");
            int num2 = input.nextInt();
        }while(num2 < 0 || num2 > 30);
      do{ 
            System.out.print("Please enter a number");
            int num3 = input.nextInt();
        }while(num3 < 0 || num3 > 30);
      do{ 
            System.out.print("Please enter a number");
            int num4 = input.nextInt();
        }while(num4 < 0 || num4 > 30);
      do{ 
            System.out.print("Please enter a number");
            int num5 = input.nextInt();
        }while(num5 < 0 || num5 > 30);

        for (int i = 1; i <= num1 ; i++ ) {
        	if(i == 1){
        		System.out.println(num1+": ");
        	}
        	System.out.print("*");
        }

        for (int i = 1; i <= num2 ; i++ ) {
        	if(i == 1){
        		System.out.println(num2+": ");
        	}
        	System.out.print("*");
        }

        for (int i = 1; i <= num3 ; i++ ) {
        	if(i == 1){
        		System.out.println(num3+": ");
        	}
        	System.out.print("*");
        }

        for (int i = 1; i <= num4 ; i++ ) {
        	if(i == 1){
        		System.out.println(num4+": ");
        	}
        	System.out.print("*");
        }

        for (int i = 1; i <= num5 ; i++ ) {
        	if(i == 1){
        		System.out.println(num5+": ");
        	}
        	System.out.print("*");
        }

    }

}