package com.kodewala.polymorphisim.usecasefour;

public class Clients {

	public static void main(String[] args) {
		//creating instance of process class
		ProcessStreamingContent process=new ProcessStreamingContent();
		
		//creating instance of sports
		Sports cricket=new Sports();
		
		//process the instance and play
		process.videoContentType(cricket);

	}

}
