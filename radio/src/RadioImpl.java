package de.feu.radio;

public class RadioImpl implements Radio {
	private boolean on;

	private int volume;
	private float[] frequencies;
	private int currentFrequency;

	public RadioImpl() {
		this.on = false;
		this.volume = 10;

		this.frequencies = new float[2];
		this.frequencies[0] = (float) 106.8;
		this.frequencies[1] = 107.4f;
		this.currentFrequency = 0;
	}

	@Override
	public boolean isOn() {
		return this.on;
	}

	@Override
	public void turnOn() {
		this.on = true;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void volumeUp() {
		this.volume++;
	}

	@Override
	public float getFrequency() {
		return this.frequencies[this.currentFrequency];
	}

	@Override
	public void nextStation() {
		if (this.currentFrequency < this.frequencies.length - 1) {
			this.currentFrequency++;
		} else {
			this.currentFrequency = 0;
		}
	}

}
