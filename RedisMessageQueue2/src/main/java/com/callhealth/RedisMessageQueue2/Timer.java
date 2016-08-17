package com.callhealth.RedisMessageQueue2;

import redis.clients.jedis.Jedis;

public class Timer {
	public static void main(String args[]){
		Jedis jedis=new Jedis("localhost");

		while(true){
			//Set Current Time into the database for future purpose
			try{
				long time=System.currentTimeMillis();			
				jedis.set("currentTime", Long.toString(time));

				//Retreive Last Time and Current Time from the database
				Long lastTime=Long.parseLong(jedis.get("lastTime"));
				Long currentTime=Long.parseLong(jedis.get("currentTime"));	



				System.out.println("Last Time the subscriber Received Message on : "+lastTime);
				System.out.println("Systems current time :"+currentTime);

				Long timeDiff=(currentTime-lastTime);
				System.out.println("Time Diff :"+ timeDiff +" milliseconds");
				
				/*
				 //process the time difference here
				 
				 */	
				System.out.println();
				break;

			}
			catch (Exception c){
				System.out.println("\n*****There might be some problem with the server*****");
			}

			


		}
	}

}