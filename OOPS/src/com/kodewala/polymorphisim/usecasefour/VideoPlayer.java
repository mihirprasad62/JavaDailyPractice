package com.kodewala.polymorphisim.usecasefour;

//parent class video player

class VideoPlayer {
	// method to play content

	public void playContent() {
		System.out.println("playing video content");
	}

}

//child class sports 

class Sports extends VideoPlayer {
	@Override
	public void playContent() {
		System.out.println("playing Sports");
	}
}

//child class movies 

class Movies extends VideoPlayer {
	@Override
	public void playContent() {
		System.out.println("playing Movies");
	}
}