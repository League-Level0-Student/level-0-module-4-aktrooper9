package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
	
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want; fish or shrimp");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

for(int i=0; i<999;i+=0)	{	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy

			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you wish to take care of your pet?", "Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Sleep", "Play"}, null);
   // 5. Use user input to call the appropriate method created in step 4.
	
if(task == 0) {
	feed();
} 
if(task == 1) {
	Sleep();
} 
if(task == 2) {
	Play();
} 

if( happinessLevel == 10){
	break ;
}
} 
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	 
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	 static void feed() {
		 happinessLevel+=1;
		 JOptionPane.showMessageDialog(null, "You fed your pet 1 food you have earned 1 happiness point");
	 }
	 static void Sleep() {
		 happinessLevel+=1;
		 JOptionPane.showMessageDialog(null, "You have allowed your pet to rest you have earned 1 happiness point");
	 }
	 static void Play () {
		 happinessLevel+=1;
		 JOptionPane.showMessageDialog(null, "You played with your pet you have earned 1 happiness point");
	 }
	 static void Complete() {
		 JOptionPane.showMessageDialog(null, "Your Pet is happy keep it up");
	 }
}