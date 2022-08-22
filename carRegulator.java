package carRegulator;

import java.util.Scanner;

public class carRegulator {

	public static void main(String[] args) {
		cars[] carlar = new cars[0];
		boolean m = true;
		
		
		System.out.println("---------------"+"\n"+"1-Add car"+
				"\n"+"2-Enter piece"+
				"\n"+"3-Print cars"+
				"\n"+"4-Calculate Income"+
				"\n"+"5-Exit"+"\n"+
				"---------------");
		
		Scanner enter = new Scanner(System.in);
		
		int control=0;
		
		do {
			
			System.out.println();
			System.out.println("Enter operation:");
			
			int key = enter.nextInt();	
			
			if(key==1) {
					
					System.out.println("Car model: ");
					String model = enter.next();
					System.out.println("Car price: ");
					double price = enter.nextDouble();
					System.out.println("Seller: ");
					String seller = enter.next();
					
					cars car1 = new cars(model,price,seller);
					
					cars[] tuna = new cars[carlar.length+1];
					for(int i= 0;i<carlar.length;i++) {
						tuna[i]=carlar[i];
					}
					carlar = tuna;
					
					carlar[control]=car1;
					control++;
			}
			
			
			else if (key==2) {
				System.out.println("Enter car model: ");
				
				int e=0;
				int piece=0;
				boolean pControl=true;
				
				do {
			
					String pModel = enter.next();
					for (e=0;e<carlar.length;e++)
						if (pModel.equals(carlar[e].getModel())) {
							pControl=false;
							break;	
						}
					
					if (pControl==true) {
						System.out.println("Entered car can't founded. Please try again.");
					}
						
					
				} while (pControl);
					
				System.out.println("Enter the piece of the car model: ");
				piece = enter.nextInt();
				
				carlar[e].setPiece(piece);
				e=0;
			}	
			
			
			else if (key==3) {	
				for (int engin=0;engin<carlar.length;engin++)
				carlar[engin].printInfo();
			}
		
			
			else if (key==4) {
				
				boolean cControl=true;
				int t=0;
				
				for (t=0;t<carlar.length;t++) {
					if (carlar[t].getPiece()==0) {
						cControl=false;
					}
				}
				
				if (cControl==false) {
					System.out.println("You didn't enter piece value of the below given cars: ");
					for (t=0;t<carlar.length;t++) {
						if (carlar[t].getPiece()==0) {
							System.out.println("- "+carlar[t].getModel());
						}
					}
				}
				
				for (int engin=0;engin<carlar.length;engin++) {
					System.out.println("Income of '"+carlar[engin].getSeller()+"' is "+(carlar[engin].getPiece()*carlar[engin].getPrice())+"$");
				}
			
			}
			
			
			else if (key==5) {
				System.out.println("Bye!");
				System.exit(0);
			}

		
			} while (m);
		}
	}


