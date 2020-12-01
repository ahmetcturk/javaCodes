package week5Tuesday;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Q1 {
	static Car car1;
	static GridLayout gridLayout = new GridLayout(0, 2);
	static JFrame frame = new JFrame();
	static JTextArea speedShower = new JTextArea();
	static JTextArea gearShower = new JTextArea();
	static JButton carStart = new JButton();
	static JButton carStop = new JButton();
	static JButton buttonSpeedUp1 = new JButton();
	static JButton buttonSpeedUp10 = new JButton();
	static JButton buttonSpeedDown1 = new JButton();
	static JButton buttonSpeedDown10 = new JButton();
	
	public static void main(String[] args) {
		int[][] speedAndGear = { { 1, 1 }, { 20, 2 }, { 40, 3 }, { 65, 4 }, { 85, 5 }, { 120, 6 }, { 160, 7 },
				{ 200, 8 }, { 240, 8 } };
		car1 = new Car("Mercedes", 8, 240, speedAndGear);
		frame(); // Setting frames
		
		speedShower.setSize(10, 10);
		gearShower.setSize(10, 10);
		carStart.setText("Start car");
		carStop.setText("Stop car");
		buttonSpeedUp1.setText("Speed Up 1");
		buttonSpeedUp10.setText("Speed Up 10");
		buttonSpeedDown1.setText("Speed Down 1");
		buttonSpeedDown10.setText("Seed Down 10");
		
		carStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.start();
				speedShower.setText(car1.start());
				// speedShower.setText(car1.showSpeed());
				// gearShower.setText(car1.showGear());
			}
		});
		carStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.stop();
				// speedShower.setText(car1.showSpeed());
				gearShower.setText(car1.showGear());
			}
		});
		buttonSpeedUp1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.speedUp();
				speedShower.setText(car1.showSpeed());
				gearShower.setText(car1.showGear());
			}
		});
		buttonSpeedUp10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.speedUp10();
				speedShower.setText(car1.showSpeed());
				gearShower.setText(car1.showGear());
			}
		});
		buttonSpeedDown1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.speedDown();
				speedShower.setText(car1.showSpeed());
				gearShower.setText(car1.showGear());
			}
		});
		buttonSpeedDown10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.speedDown10();
				speedShower.setText(car1.showSpeed());
				gearShower.setText(car1.showGear());
			}
		});
		carStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				car1.stop();
				speedShower.setText(car1.stop());
				// speedShower.setText(car1.showSpeed());
				// gearShower.setText(car1.showGear());
			}
		});
	}
	static void frame(){
		frame.setLayout(gridLayout);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.add(speedShower);
		frame.add(gearShower);
		frame.add(carStart);
		frame.add(carStop);
		frame.add(buttonSpeedUp1);
		frame.add(buttonSpeedUp10);
		frame.add(buttonSpeedDown1);
		frame.add(buttonSpeedDown10);
	}
}

class Car {
	String model;
	int gear;
	int maxSpeed;
	int speed;
	int[][] speedAndGear;
	boolean carStatus = false;

	/**
	 *
	 * @param model
	 * @param gear
	 * @param maxSpeed
	 * @param speedAndGear
	 *            <h1>Example: {{min speed for gear1,gear1},{min speed for
	 *            gear2}}</h1>
	 */
	public Car(String model, int gear, int maxSpeed, int[][] speedAndGear) {
		this.model = model;
		this.gear = gear;
		this.maxSpeed = maxSpeed;
		this.speedAndGear = speedAndGear;
	}

	public String start() {
		carStatus = true;
		return "Car is started!";
	}

	public String stop() {
		carStatus = false;
		gear = 0;
		speed = 0;
		return "Car is stopped!";
	}

	void speedUp() {
		if (carStatus) {
			if (speed < maxSpeed) {
				speed++;
				shiftGear();
			}
		}
	}

	void speedDown() {
		if (carStatus) {
			if (speed > 0) {
				speed--;
				shiftGear();
			} else {
				gear = 0;
			}
		}
	}

	void speedUp10() {
		if (carStatus) {
			if (maxSpeed - speed >= 10) {
				speed += 10;
				shiftGear();
			} else {
				speed = maxSpeed;
			}
		}
	}

	void speedDown10() {
		if (carStatus) {
			if (speed >= 10) {
				speed -= 10;
				shiftGear();
			} else {
				gear = 0;
				speed = 0;
			}
		}
	}

	void shiftGear() {
		for (int i = 0; i < speedAndGear.length - 1; i++) {
			if (speed >= speedAndGear[i][0] && speed < speedAndGear[i + 1][0]) {
				gear = speedAndGear[i][1];
			}
		}
	}

	String showSpeed() {
		return speed + "";
	}

	String showGear() {
		return gear + "";
	}
}
