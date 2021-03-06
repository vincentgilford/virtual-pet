package virtualpet;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void retrieveHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		int energyForPet = underTest.getHunger();

		// assert
		Assert.assertEquals(30, energyForPet);

	}

	@Test
	public void shouldFeedPet() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.feedPet(0);
		int energyForPet = underTest.getHunger();

		// assert
		Assert.assertEquals(30, energyForPet);

	}

	@Test
	public void shouldFeedPetHungerChanges25() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.feedPet(25);
		int energyForPet = underTest.getHunger();

		// assert
		Assert.assertEquals(55, energyForPet);

	}

	@Test
	public void shouldRetrieveThirstForPet() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		int hydrationForPet = underTest.getThirst();

		// assert
		Assert.assertEquals(25, hydrationForPet);

	}

	@Test
	public void shouldRetrieveThirstForPetWhenThirstChangesInClass() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		int hydrationForPet = underTest.getThirst();

		// arrange
		Assert.assertEquals(25, hydrationForPet);

	}

	@Test
	public void shouldRetrieveWasteFromInstance() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		int petWaste = underTest.getWaste();

		// arrange
		Assert.assertEquals(30, petWaste);

	}

	@Test
	public void removeFromPetWaste() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.wasteRemoval(20);
		int petWaste = underTest.getWaste();

		// assert
		Assert.assertEquals(10, petWaste);

	}

	
	@Test
	public void shouldRetrieveBoredomFromInstancePetBoredome() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		int petBoredom = underTest.getBoredom();

		// assert
		Assert.assertEquals(30, petBoredom);

	}

	@Test
	public void shouldHaveAbilityToPlayWithPet() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.playWithPet(0);
		int petBoredom = underTest.getBoredom();

		// assert
		Assert.assertEquals(30, petBoredom);
	}

	@Test
	public void shouldPlayWithPetWithInstancePetBoredomEffected() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.playWithPet(10);
		int petBoredom = underTest.getBoredom();

		// assert
		Assert.assertEquals(20, petBoredom);

	}

	@Test
	public void shouldAllowSleepForPet() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.petSleepTime(10);
		int petSleepTimeNeeded = underTest.getPetSleep();

		// assert
		Assert.assertEquals(40, petSleepTimeNeeded);

	}

	@Test
	public void sicknessEffectOnPetHunger() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.sickenessOfPetHunger();
		int hunger = underTest.getHunger();

		// assert
		Assert.assertEquals(25, hunger);

	}

	@Test
	public void sicknessEffectOnPetThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.sicknessOfPetThirst();
		int thirst = underTest.getThirst();

		// assert
		Assert.assertEquals(20, thirst);

	}

	@Test
	public void sicknessEffectOnPetWaste() {
		// arrange
		VirtualPet underTest = new VirtualPet();

		// act
		underTest.sicknessOfPetWaste();
		int petWaste = underTest.getWaste();

		// assert
		Assert.assertEquals(35, petWaste);
	}

	@Test
	public void virtualPetConstructorNameTest() {
		// arrange
		VirtualPet underTest = new VirtualPet("Drogon");

		// act
		underTest.getPetName();
		String petName = underTest.getPetName();

		// assert
		Assert.assertEquals("Drogon", petName);

	}

	@Test
	public void hydratePet() {
		// arrange
		VirtualPet underTest = new VirtualPet("Drogon");

		// act
		underTest.hydratePet(10);
		int hydrationForPet = underTest.getThirst();

		// assert
		Assert.assertEquals(35, hydrationForPet);
	}

	@Test
	public void implementationOfTickOnEnergy() {
		// arrange
		VirtualPet underTest = new VirtualPet("Drogon");

		// act
		underTest.tickCycle();
		int energyForPet = underTest.getHunger();

		// assert
		Assert.assertEquals(25, energyForPet);

	}

	@Test
	public void implementationOfTickOnThirst() {
		// arrange
		VirtualPet underTest = new VirtualPet("Drogon");

		// act
		underTest.tickCycle();
		int hydrationForPet = underTest.getThirst();

		// assert
		Assert.assertEquals(20, hydrationForPet);
	}

	@Test
	public void implementationOfTickOnWaste() {
		// arrange
		VirtualPet underTest = new VirtualPet("Drogon");

		// act
		underTest.tickCycle();
		int petWaste = underTest.getWaste();

		// assert
		Assert.assertEquals(35, petWaste);

	}

	@Test
	public void implementationOfTickOnSleep() {
		// arrange
		VirtualPet underTest = new VirtualPet("Drogon");

		// act
		underTest.tickCycle();
		int petSleepTimeNeeded = underTest.getPetSleep();

		// assert
		Assert.assertEquals(55, petSleepTimeNeeded);

	}

}
