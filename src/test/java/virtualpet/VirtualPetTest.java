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
	Assert.assertEquals(0, hunger);
		
	}
	
	
	@Test
	public void shouldFeedPet(){
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act
		underTest.feedPet(0);
		int hunger = underTest.getHunger();
			
		//assert
		Assert.assertEquals(0, hunger);
		
	
	}
	
	
	@Test
	public void shouldFeedPetHungerChanges25() {
		//arrange
		VirtualPet underTest = new VirtualPet(); 
		
		//act
		underTest.feedPet(25);
		int hunger = underTest.getHunger();
			
		//assert
		Assert.assertEquals(25, hunger);
		
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
	

	

	

	
	
	
}
