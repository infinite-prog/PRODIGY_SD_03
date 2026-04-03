package contactmanagement;

import java.util.Scanner;
import java.util.ArrayList;

public class ContactManager {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<Contact>contacts=new ArrayList<Contact>();
		while(true){
			System.out.println("Welcome to Contact Manager");
			
			System.out.println("Option 1: Add a New Contact"
					+ "\nOption 2: View All Contatcts"
					+ "\nOption 3: Exit");
			
			System.out.print("Choose an Option: ");
			int choice = in.nextInt();
			in.nextLine();
			System.out.println();
			
			
			if(choice==1) {
			
				System.out.print("Enter Name: ");
				String name = in.nextLine();
				
				System.out.print("Enter Phone Number: ");
				String phone = in.nextLine();
				
				System.out.print("Enter Email Address: ");
				String email = in.nextLine();
				
				Contact newUser = new Contact(name,phone,email);
				
				contacts.add(newUser);
				
				System.out.println();
				
				
			}
		
			else if(choice==2) {
				
				if(contacts.size()==0) {
					System.out.println("No Contacts Exist Currently");
				}
				
				else {
					System.out.println("Your Contact Details are: ");
					System.out.println();
					
					for(int i=0;i<contacts.size();i++) {
						
						System.out.println((i+1 + ". " + contacts.get(i).getDetails()));
						System.out.println();
					}
				}
				
			}
			
			else if (choice==3) {
				
				System.out.println("Thank You for Visiting Contact Manager");
				break;
				
			}
			
			else {
				System.out.print("The Number You Have Entered Is Not An Option(Pick 1,2 or 3)");
			}

		}
	}

}
