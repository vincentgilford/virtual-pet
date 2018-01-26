package virtualpet;

public class VirtualPet {
	int hunger = 30; 
	int thirst = 25; 
	int petWaste = 30; 
	int petBoredom = 30; 

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		// TODO Auto-generated method stub
		return thirst;
	}

	public int getWaste() {
		// TODO Auto-generated method stub
		return petWaste;
	}

	public int getBoredom() {
		// TODO Auto-generated method stub
		return petBoredom;
	}

	public void feedPet(int foodForPet) {
		// TODO Auto-generated method stub
		hunger += foodForPet;
	}

	public void playWithPet(int petPlayTime) {
		// TODO Auto-generated method stub
		petBoredom -= petPlayTime;
	}
	
	public void wasteRemoval(int wasteRemoved) {
		// TODO Auto-generated method stub
		petWaste -= wasteRemoved; 
	}

	public VirtualPet() {
		
	}



}
