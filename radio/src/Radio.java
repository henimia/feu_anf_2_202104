package de.feu.radio;

public interface Radio {

	boolean isOn();

	void turnOn();

	int getVolume();

	void volumeUp();

	float getFrequency();

	void nextStation();

}
