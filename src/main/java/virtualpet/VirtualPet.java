package virtualpet;

public class VirtualPet {
	private int energyForPet = 30; 
	private int hydrationForPet = 25; 
	private int petWaste = 30; 
	private int petBoredom = 30; 
	private int petSleepTimeNeeded = 50; 
	private String petName = ""; 

	
	public int getHunger() {
		return energyForPet;
	}

	public int getThirst() {
		// TODO Auto-generated method stub
		return hydrationForPet;
	}

	public int getWaste() {
		// TODO Auto-generated method stub
		return petWaste;
	}

	public int getBoredom() {
		// TODO Auto-generated method stub
		return petBoredom;
	}

	public int getPetSleep() {
		// TODO Auto-generated method stub
		return petSleepTimeNeeded;
	}
	
	public void feedPet(int foodForPet) {
		// TODO Auto-generated method stub
		energyForPet += foodForPet;
	}

	public void playWithPet(int petPlayTime) {
		// TODO Auto-generated method stub
		petBoredom -= petPlayTime;
	}
	
	public void wasteRemoval(int wasteRemoved) {
		// TODO Auto-generated method stub
		petWaste -= wasteRemoved; 
	}

	
	public VirtualPet(String petName) {
		this.petName = petName; 
	}
	

	public void petSleepTime(int amountPetSlept) {
		// TODO Auto-generated method stub
		petSleepTimeNeeded -= amountPetSlept; 
	}

	public void sickenessOfPetHunger() {
		// TODO Auto-generated method stub
		energyForPet -=5; 
	}

	public void sicknessOfPetThirst() {
		// TODO Auto-generated method stub
		hydrationForPet -=5; 
		
	}

	public void sicknessOfPetWaste() {
		// TODO Auto-generated method stub
		petWaste +=5;
	}

	public String getPetName() {
		// TODO Auto-generated method stub
		return petName;
	}
	
	
	
	
	public VirtualPet() {
		
	}

	public void hydratePet(int waterForPet) {
		// TODO Auto-generated method stub
		hydrationForPet += waterForPet;
	}

	


}
