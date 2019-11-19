package _11_own_adventure;

import java.awt.Robot;

import javax.swing.JOptionPane;

public class OWNAdventure {
	static int health = 16;
	static int speed = 15;
	static int Pork = 1;
	static int Water = 1;
	static int Armor = 2;
	static int Damage = 2;

	public static void main(String[] args) {
		int task = JOptionPane.showOptionDialog(null,
				"You are getting ready for an adventure .You are at a village. You walk into the store. You can buy pork, salt or water. What do you get?",
				"Options", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "get Pork", "get Water", "get Light Armor", "get Short Sword" }, null);
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "you Have pork eat when low on health");
			int moving = JOptionPane.showOptionDialog(null,
					"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
			if (moving == 0) {
				leave();
			}

			else {
				stay();

				int staying = JOptionPane.showOptionDialog(null,
						"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
				if (staying == 0) {
					leave();
				} else {
					stay();
				}
			}
		}
		if (task == 1) {
			JOptionPane.showMessageDialog(null, "You have water drink for health and speed");
			int moving = JOptionPane.showOptionDialog(null,
					"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
			if (moving == 0) {
				leave();
			} else {
				stay();

				int staying = JOptionPane.showOptionDialog(null,
						"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
				if (staying == 0) {
					leave();
				} else {
					stay();
				}
			}

		}
		if (task == 2) {
			lightarmor();
			JOptionPane.showMessageDialog(null, "You have light armor YAY");
			int moving = JOptionPane.showOptionDialog(null,
					"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
			if (moving == 0) {
				leave();
			} else {
				stay();

				int staying = JOptionPane.showOptionDialog(null,
						"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
				if (staying == 0) {
					leave();
				} else {
					stay();
				}
			}

		}
		if (task == 3) {
			sword();
			JOptionPane.showMessageDialog(null, "You have Short sword YAY");
			int moving = JOptionPane.showOptionDialog(null,
					"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
			if (moving == 0) {
				leave();
			} else {
				stay();
				int staying = JOptionPane.showOptionDialog(null,
						"You are ready for an adventure. You may leave the village What do you do?", "Options", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave", "stay" }, null);
				if (staying == 0) {
					leave();
				} else {
					stay();
				}
			}

		}
	}

	static void Pork() {
		int pork = JOptionPane.showOptionDialog(null, "How much do you want to eat?", "Options", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "1/8", "1/4", "1/2" }, null);

		if (pork == 0) {
			health += 2;
			Pork -= .125;
			speed -= 1;
		} else if (pork == 1) {
			health += 4;
			Pork -= .25;
			speed -= 3;
		} else {
			health += 8;
			Pork -= .5;
			speed -= 7;
		}

	}

	static void Water() {
		int water = JOptionPane.showOptionDialog(null, "How much do you want to drink?", "Options", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "1/8", "1/4", "1/2" }, null);
		if (water == 0) {
			health += 1;
			Water -= .125;
			speed += 2;
		}
		if (water == 1) {
			health += 2;
			Water -= .25;
			speed += 3;
		}
		if (water == 2) {
			health += 3;
			Water -= .5;
			speed += 4;
			Damage -= 1;
		}

	}

	static void lightarmor() {
		int armor = JOptionPane.showOptionDialog(null, "How much armor do you want", "Options", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "1/8 clad ", "1/4 clad", "1/2 clad" }, null);
		if (armor == 0) {
			Armor += 3;
			speed -= 1;
		}
		if (armor == 1) {
			Armor += 10;
			speed -= 2;
		}
		if (armor == 2) {
			Armor += 20;
			speed -= 4;
		}
	}

	static void sword() {
		Damage += 30;
	}

	static void stay() {
		JOptionPane.showMessageDialog(null,
				"You have done nothing now you will have to wait before you can travel. You can use this once more before you have to leave. There are no added benefites except for being able to heal.");
	}

	static void leave() {
		JOptionPane.showMessageDialog(null, "You are traveling through the forest.");

	}

}
