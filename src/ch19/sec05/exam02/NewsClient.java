package ch19.sec05.exam02;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {

		try {
			
			DatagramSocket datagramSocket = new DatagramSocket();
			
			String data = "과학";
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes,bytes.length,new InetSocketAddress("172.20.21.78",50001));
			datagramSocket.send(sendPacket);
			
			while(true) {
			
			DatagramPacket receivePacket = new DatagramPacket(new byte[1024],1024);
			datagramSocket.receive(receivePacket);
			
			String news = new String(receivePacket.getData(),0,receivePacket.getLength(),"UTF-8");
			System.out.println(news);
			
			if(news.contains("뉴스 10")) {
				break;
			}
			
		}
		datagramSocket.close();
		}
		catch(Exception e) {}
		}
		
	}


