package club.westcs.NifflerCeciliaB;

public class Stopwatch {
//Attributes
	private boolean running;
	private long startTime, stopTime, pausedTime;
	
//Constructor
	public Stopwatch() {
		running = false;
		startTime = 0;
		stopTime = 0;
		pausedTime = 0;
	}
//Methods
	public boolean isRunning() {
		return this.running;
	}
	
	public void start() {
		this.running = true;
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.running = false;
		this.stopTime = System.currentTimeMillis();
	}
	
	public void pause() {
		if(this.running) {
			stop();
			this.pausedTime += this.stopTime - this.startTime;
		}
	}
	
	public void unpause() {
		if(this.running = false) {
			start();
			this.pausedTime += this.startTime = this.stopTime;
		}
	}
	
	public long getElapedTime() {
		long elapsed = 0;
		if(this.running) {
			elapsed = System.currentTimeMillis() - this.startTime;
			elapsed += this.pausedTime;
		}
		else {
			elapsed = this.pausedTime;
		}
		return elapsed/1000;
	}
}
