package virtualpet;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;





public class VirtualPetTest {


	@Test
	public void retrieveHunger(){
	//arrange
	VirtualPet underTest = new VirtualPet(); 
	
	//act
	int hunger = underTest.getHunger();
		
	//assert
	Assert.assertEquals(30, hunger);
		
	}
	
	
	@Test
	public void shouldFeedPet(){
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act
		underTest.feedPet(0);
		int hunger = underTest.getHunger();
			
		//assert
		Assert.assertEquals(30, hunger);
		
	
	}
	
	
	@Test
	public void shouldFeedPetHungerChanges25() {
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act
		underTest.feedPet(25);
		int hunger = underTest.getHunger();
			
		//assert
		Assert.assertEquals(55, hunger);
		
	}
	
	
	@Test
	public void shouldRetrieveThirstForPet() {
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act
		int thirst = underTest.getThirst();
			
		//assert
		Assert.assertEquals(25, thirst);

	}
	
	@Test 
	public void shouldRetrieveThirstForPetWhenThirstChangesInClass() {
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act
		int thirst = underTest.getThirst();
		
		//arrange
		Assert.assertEquals(25, thirst);
		
	}
	
	
//	@Test
//	public void shouldRetrieveWaste() {
//		//arrange
//		VirtualPet underTest = new VirtualPet();
//		
//		//act
//		underTest.getWaste(); 
//		
//		//assert
//		Assert.assertEquals(30, 30);
//	}
	
	
	@Test
	public void shouldRetrieveWasteFromInstance() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		
		//act
		int petWaste = underTest.getWaste();
		
		//arrange
		Assert.assertEquals(30, petWaste);
		
	}
	
	@Test
	public void removeFromPetWaste() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		
		//act
		underTest.wasteRemoval(20);
		int petWaste = underTest.getWaste();
		
		//assert
		Assert.assertEquals(10, petWaste);
		
	}
	
//	@Test
//	public void shouldRetrieveBoredom() {
//		//arrange
//		VirtualPet underTest = new VirtualPet();
//		
//		//act
//		underTest.getBoredom(); 
//		
//		//assert
//		Assert.assertEquals(30, 30);
//		
//	}
	
	@Test
	public void shouldRetrieveBoredomFromInstancePetBoredome() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		
		//act
		int petBoredom = underTest.getBoredom();
		
		//assert
		Assert.assertEquals(30, petBoredom);
		
	}
	
	
	@Test
	public void shouldHaveAbilityToPlayWithPet() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		
		//act
		underTest.playWithPet(0); 
		int petBoredom = underTest.getBoredom();
		
		//assert
		Assert.assertEquals(30, petBoredom);
	}
	
	
	@Test
	public void shouldPlayWithPetWithInstancePetBoredomEffected() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		
		//act
		underTest.playWithPet(10);
		int petBoredom = underTest.getBoredom();
		
		//assert
		Assert.assertEquals(20, petBoredom);
		
	}
	
	@Test
	public void shouldAllowSleepForPet() {
		//arrange
		VirtualPet underTest = new VirtualPet();
		
		//act
		underTest.petSleepTime(10); 
		int petSleepTimeNeeded = underTest.getPetSleep(); 
				
		//assert
		Assert.assertEquals(40, petSleepTimeNeeded);
		
	}
	
	@Test
	public void sicknessEffectOnPetHunger() {
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act 
		underTest.sickenessOfPetHunger();
		int hunger = underTest.getHunger();
		
		//assert
		Assert.assertEquals(25, hunger);
		
	}
	
	
	
	
	
	

	

	
	
	
}
