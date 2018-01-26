package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the Virtual Pet Game!");
		System.out.println("What is the name of your Pet");
		String userNameInput = input.nextLine();
		VirtualPet userPet = new VirtualPet(userNameInput);
		System.out.println(userPet.getPetName() + "says Hi!!");
		
		System.out.println(userPet.getPetName() + "requires a lot of attendance a quick explanation on how to properly take care of it!");
		System.out.println("For explanation purpose here are the stats:");
		System.out.println("Pet's Energy:" + userPet.getHunger());
		System.out.println("When you feed" + userPet.getPetName() + "its energy will go up which is good! You do not want energy to get too low or it will get sick");
		System.out.println("Pet's Hydration:" + userPet.getThirst());
		System.out.println("When you water" + userPet.getPetName() + " its Hydration level will go up which is good! You do not want Hydration to get too low or it will get sick");
		System.out.println("Pet's waste:" + userPet.getWaste());
		System.out.println("When you remove waste:" + userPet.getPetName() + "will go down which is good!");
		System.out.println("Pet's Boredom:" + userPet.getBoredom());
		System.out.println("When you play with" + userPet.getPetName() + "will got down which is good!");
		System.out.println("Pet's Sleeptime needed:" + userPet.getPetSleep());
		System.out.println("When you allow" + userPet.getPetName() + " to sleep, the amount of sleep timme needed will go down");
		
		System.out.println("So let's get started!");
		//userMenu
		System.out.println();
		
		
		
		
	}

}
