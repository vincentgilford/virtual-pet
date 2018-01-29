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
		System.out.println(userPet.getPetName() + " says Hi!!");

		System.out.println(userPet.getPetName()
				+ " requires a lot of attendance a quick explanation on how to properly take care of it!");
		System.out.println("For explanation purpose here are the stats:");
		System.out.println(userPet.getPetName() + "'s Energy " + userPet.getHunger());
		System.out.println("When you feed " + userPet.getPetName()
				+ " its energy will go up which is good! You do not want energy to get too low or it will get sick");
		System.out.println(userPet.getPetName() + "'s Hyrdration Level " + userPet.getThirst());
		System.out.println("When you water " + userPet.getPetName()
				+ " its Hydration level will go up which is good! You do not want Hydration to get too low or it will get sick");
		System.out.println(userPet.getPetName() + "'s waste level " + userPet.getWaste());
		System.out.println("When you remove waste: " + userPet.getPetName() + " will go down which is good!");
		System.out.println(userPet.getPetName() + "'s boredom level " + userPet.getBoredom());
		System.out.println("When you play with " + userPet.getPetName() + " will got down which is good!");
		System.out.println(userPet.getPetName() + "'s sleep needed " + userPet.getPetSleep());
		System.out
				.println("When you allow " + userPet.getPetName() + " to sleep, the amount of sleep time will go down");

		System.out.println("Before we begin you need to understand the cycle.");
		System.out.println("Everytime you interact with your pet that it will complete a cycle for the pet");
		System.out.println(
				"Each time a cycle passes the stats of your pet will change, Please be wary of this as you choose to interact with your pet");
		System.out.println("So let's get started!");

		// userMenu
		String userChoice;
		System.out.println("What would you like to do for " + userPet.getPetName());
		System.out.println("Please Enter a number to match the action associated.");
		System.out.println("1. Feed " + userPet.getPetName());
		System.out.println("2. Water " + userPet.getPetName());
		System.out.println("3. Remove Waste for " + userPet.getPetName());
		System.out.println("4. Play with " + userPet.getPetName());
		System.out.println("5. Put " + userPet.getPetName() + " to sleep!");
		System.out.println("6. See status of " + userPet.getPetName());
		System.out.println("7. To Quit Menu.");
		userChoice = input.next();
		while (!userChoice.equals("7")) {

			if (userChoice.equals("1")) {
				System.out.println("How much would you like to feed?, Please enter a number no greater than 10.");
				int foodForPet = input.nextInt();
				userPet.feedPet(foodForPet);
				System.out.println("Energy Level: " + userPet.getHunger());
			}

			if (userChoice.equals("2")) {
				System.out.println(
						"How much fluid would you like provide it?, Please enter a number no greater than 10.");
				int waterForPet = input.nextInt();
				userPet.hydratePet(waterForPet);
				System.out.println("Hydration Level: " + userPet.getThirst());
			}

			if (userChoice.equals("3")) {
				System.out.println("How much waste would you like to remove for " + userPet.getPetName());
				int wasteRemoved = input.nextInt();
				userPet.wasteRemoval(wasteRemoved);
				System.out.println("Waste Level: " + userPet.getWaste());
			}

			if (userChoice.equals("4")) {
				System.out.println("How many long will you like to play with  " + userPet.getPetName());
				int petPlayTime = input.nextInt();
				userPet.playWithPet(petPlayTime);
				System.out.println("Play level: " + userPet.getBoredom());
			}

			if (userChoice.equals("5")) {
				System.out.println("How long would you like " + userPet.getPetName() + " to sleep?");
				int amountPetSlept = input.nextInt();
				userPet.petSleepTime(amountPetSlept);
			}

			if (userChoice.equals("6")) {
				System.out.println(userPet.getPetName() + "'s Energy " + userPet.getHunger());
				System.out.println(userPet.getPetName() + "'s Hyrdration Level " + userPet.getThirst());
				System.out.println(userPet.getPetName() + "'s waste level " + userPet.getWaste());
				System.out.println(userPet.getPetName() + "'s boredom level " + userPet.getBoredom());
				System.out.println(userPet.getPetName() + "'s sleep needed " + userPet.getPetSleep());
			}

			if (userPet.getHunger() < 15) {
				userPet.sickenessOfPetHunger();
				System.out.println("Uh-oh your pet is sick! " + userPet.getHunger());
				System.out.println("Please take care to watch your Pet");
			}

			if (userPet.getWaste() > 50) {
				userPet.sicknessOfPetWaste();
				System.out.println("Uh-oh your pet is sick! " + userPet.getWaste());
				System.out.println("Please take care to watch your Pet");

			}

			if (userPet.getThirst() < 15) {
				userPet.sicknessOfPetThirst();
				System.out.println("Uh-oh your pet is sick! " + userPet.getThirst());
				System.out.println("Please take care to watch your Pet");

			}

			// sickness implementation -- doctor
			
			
			System.out.println("What would you like to do for " + userPet.getPetName());
			System.out.println("Please Enter a number to match the action associated.");
			System.out.println("1. Feed " + userPet.getPetName());
			System.out.println("2. Water " + userPet.getPetName());
			System.out.println("3. Remove Waste for " + userPet.getPetName());
			System.out.println("4. Play with " + userPet.getPetName());
			System.out.println("5. Put" + userPet.getPetName() + " to sleep!");
			System.out.println("6. See status of " + userPet.getPetName());
			System.out.println("7. To Quit Menu.");
			userChoice = input.next();
			userPet.tickCycle();
		}
	}

}
