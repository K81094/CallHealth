package com.callhealth.RedisMessageQueue2;

import java.util.List;

import redis.clients.jedis.Jedis;

public class Subscriber 
{
	public static void main( String[] args )
	{
		try{
			Jedis jedis = new Jedis("localhost"); 
			List<String> messages = null;
			
			
			while(true){
				
				if(jedis.llen("message_queue")==0){
					System.out.println("\nThere are no messages in the Message Queue");
					
				}
				//wait for message till queue has some values i.e blpop
				System.out.println("Waiting for a message in the queue");				
				messages = jedis.blpop(0,"message_queue");	

				//Process the message
				System.out.print("Got the message :");
				System.out.println("key=" + messages.get(0) + " value=" + messages.get(1));
				String msg = messages.get(1);

				//get current time from system and store it into database as lastTime
				long time=System.currentTimeMillis();
				jedis.set("lastTime", Long.toString(time));

				System.out.println("Message received:" + msg +" on :"+jedis.get("lastTime"));
				System.out.println();
			}
		}catch(Exception e){
			System.out.println("\n*****There might be some problem with the server*****");

		}

	}
}