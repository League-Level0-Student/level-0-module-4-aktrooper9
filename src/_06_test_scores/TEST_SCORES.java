package _06_test_scores;

import javax.swing.JOptionPane;

public class TEST_SCORES {
	public static void main(String[] args) {
		String score = JOptionPane.showInputDialog("what are your test scores rounded ot the nearest whole number");
		int scores = Integer.parseInt(score);
		if(scores>69 && scores<81){
			JOptionPane.showMessageDialog(null, "You can do better");
		}
		else if (scores> 50 && scores< 70) {
			JOptionPane.showMessageDialog(null, "Did you Study");
		}
		else if (scores>10 && scores<50) {
			JOptionPane.showMessageDialog(null, "YOU NEED TO STUDY!!");
		}
		else if (scores>10 && scores<0) {
			JOptionPane.showMessageDialog(null, "SIGH -}-- ");
		}
		else if (scores>70 && scores<90) {
			JOptionPane.showMessageDialog(null, "Could be a bit better");
		}
		else if (scores>90 && scores<99) {
			JOptionPane.showMessageDialog(null, "Good but could be better");
		}
		else if (scores<100) {
			JOptionPane.showMessageDialog(null, "GOOD GET THAT SCORE NEXT TIME");
		}
		else
			JOptionPane.showMessageDialog(null, "DOES NOT COMPUTE");
	
	}
}
