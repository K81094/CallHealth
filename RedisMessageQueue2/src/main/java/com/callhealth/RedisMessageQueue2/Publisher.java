package com.callhealth.RedisMessageQueue2;

import redis.clients.jedis.Jedis;

public class Publisher {

	public static void main(String[] args) throws InterruptedException {
		try{
			Jedis jedis = new Jedis("localhost");
			int i=0;
			Thread th =new Thread();
			while(true){
				
				//Set message queue size 2
				if(jedis.llen("message_queue")==2){
					System.out.println("\nMessage Queue is already full .");
					th.sleep(10000);
				}
				//If Message Queue is not full , insert values into the message queue
				else{
					System.out.println("\nInserting values to Message Queue :" +"message"+i);
					jedis.rpush("message_queue", "message"+i);
					System.out.println("Value inserted at "+System.nanoTime());						
					i++;
				}  
				th.sleep(5000);
			}
		}catch(Exception e){
			System.out.println("\n*****There might be some problem with the server*****");
		}


	}

}