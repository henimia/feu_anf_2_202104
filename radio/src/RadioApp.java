package de.feu.radio;

public class RadioApp {

	public static void main(String[] args) {
		Radio radio = new RadioImpl();

		boolean on = radio.isOn(); // false
		radio.turnOn();
		on = radio.isOn(); // true

		int volume = radio.getVolume(); // 10
		radio.volumeUp();
		volume = radio.getVolume(); // 11

		float frequency = radio.getFrequency(); // 106.8
		radio.nextStation();
		frequency = radio.getFrequency(); // 107.4
	}

}
