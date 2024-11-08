package J101.collection;

import java.util.LinkedList;
import java.util.Queue;

public class J101_FIFO_Queue {

	public static void main(String[] args) {

		
		Queue<Message> msgQ = new LinkedList<>();
		
		
		msgQ.offer(new Message("카톡", "정형돈"));
		msgQ.offer(new Message("메일", "유재석"));
		msgQ.offer(new Message("문자", "박명수"));
		
		
		while(!msgQ.isEmpty()) {
			
			Message msg = msgQ.poll();
			System.out.printf("%s에게 %s를 보냅니다.%n", msg.to, msg.command);
			
		}
		
	}

}



class Message {
	
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
}