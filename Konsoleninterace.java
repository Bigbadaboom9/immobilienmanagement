/**
 * 
 */
package oszimt;

/**
 * @author yaschmidt
 * version 1.0
 * date: 06/11/2017
 */
import java.util.Scanner;

public class Konsoleninterace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = new Scanner(System.in); 
		Scanner sc3 = new Scanner(System.in); 
		Scanner sc4 = new Scanner(System.in); 
		Scanner sc5 = new Scanner(System.in); 
				
		int menueeingabe = 0;
		int vorname;
		int name;
		int id;
		int anschrift;
		int stadt;
		int plz;
		int land;
		int hauptmenue;
		int i=0;
							
			System.out.println("--------------------------------------------------------");
			
			System.out.println("|	> Willkommen in der Immobilienverwaltung <	|");
			
			System.out.println("--------------------------------------------------------");
			
			System.out.println("|1) Datensatz anlegen					|");
			
			System.out.println("|2) Datensatz löschen					|");

			System.out.println("|3) Suchen						|");
			
			System.out.println("|4) back to mainmenue					|");
			
			System.out.println("|0) Exit						|");
			
			System.out.println("--------------------------------------------------------");
			
			
			//read input
			System.out.println("Bitte wählen Sie eine Option.");
			int s = sc1.nextInt(); 
			
			
			
			
			switch(s) {
			
				case 1 :
					
					if (i==1) //{									
					
						System.out.println("--------------------------------------------");
						System.out.println("|1)create Statement");
						System.out.println("|2)alle Values des Datensatzes ausfüllen");
						System.out.println("----------------------------------------------");
						System.out.println("Bitte wählen Sie eine Option.");
						int p = sc2.nextInt();
						
						switch(s) {
						
							case 1:
								System.out.println("----------------------------------");
								System.out.println("neue Daten eingeben");
								System.out.println("-----------------------------------");
								
								break;
								
							case 2: 
								System.out.println("alle values ausfüllen");

								break;
						}//}
					/*else {
						System.out.println("Goodbye!");
						break;
					}	*/			
						break;
					
				case 2 :
					
					if (i==2) //{				
										
					System.out.println("--------------------------------------------");
					System.out.println("|1)search");
					System.out.println("|2)search for any");
					System.out.println("|3)delete");
					System.out.println("----------------------------------------------");
					System.out.println("Bitte wählen Sie eine Option.");
					int q = sc3.nextInt();
					
					switch(s) {
					
						case 1:
							System.out.println("-----------------------------------");
							System.out.println("suchen");
							System.out.println("-----------------------------------");
							break;
							
						case 2: 
							System.out.println("-----------------------------------");
							System.out.println("search for any");
							System.out.println("-----------------------------------");
							break;
						
						case 3:
							System.out.println("-----------------------------------");
							System.out.println("delete");
							System.out.println("-----------------------------------");
							break;
							
					/*	default: 
							System.out.println("-----------------------------------");
							System.out.println("Goodbye!");
							System.out.println("-----------------------------------");
							break; */
					}//}
					

				/*	else {
						System.out.println("Goodbye!");
						break;
					}	*/			
					break;
				case 3 :
					
					if (i==3) //{				
					
					System.out.println("--------------------------------------------");
					System.out.println("|1)search for any");
					System.out.println("----------------------------------------------");
					System.out.println("Bitte wählen Sie eine Option.");
					int r = sc4.nextInt();
					
					switch(s) {
					
						case 1:
							System.out.println("-----------------------------------");
							System.out.println("suchen");
							System.out.println("-----------------------------------");
							break;
							
					}//}
					

				/*	else {
						System.out.println("Goodbye!");
						break;
					}	*/			
					break;
					
				case 4 :
					
					if (i==4) //{					
					
					System.out.println("--------------------------------------------");
					System.out.println("|1)back to mainmenue");
					System.out.println("----------------------------------------------");
					System.out.println("Bitte wählen Sie eine Option.");
					int t = sc5.nextInt();
					
					switch(s) {
					
						case 1:
							System.out.println("-----------------------------------");
							System.out.println("back to mainmenue");
							System.out.println("-----------------------------------");
							break;
							
					}//}					

				/*	else {
						System.out.println("Goodbye!");
						break;
					}	*/			
					break;
					
					
				default :
				//	clear();
					System.out.println("Exit");
				//	hauptmenue();					
					break;
					
				
					
			
			} 
			
			
			
			
	}

}
