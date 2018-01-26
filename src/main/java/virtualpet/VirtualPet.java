package virtualpet;

public class VirtualPet {
	int hunger = 0; 
	int thirst = 25; 
	
	public VirtualPet() {
			
	}
	
	
	public int getHunger() {
		return hunger;
	}


	public void feedPet(int foodForPet) {
		// TODO Auto-generated method stub
		hunger += foodForPet;
	}


	public int getThirst() {
		// TODO Auto-generated method stub
		return thirst;
	}

}
