import java.util.*;
import java.net.*;
import java.io.*;

public class Sender
{
  public static byte N=15;   //N=>packets to be sent; where N is from "Go-Back-N"
  public static byte S=10;   //Maximum sequence number
  public static int W=4;      //Window Size 
  public static int T=2;  //2second wait for acknowledgement
  public static int P=20089;  //Port number
  public static String msgs="Message number";   //to store the message content
  Timer timer;  //for timer

  public static void main (String [] args) throws Exception
 {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //to take input from user
    String [] msg=new String[N];    //to store the message
    for(int i=0; i<N; i++)
    {  
       if(i==(i+4))
      {
         System.out.println("Packet" +(i+4)+ "lost");
         retransmit(i);
       }
     
     else
     
     {
       msg[i]=(msgs + i + checksum());   //stores message content along with checksum in msg array
       byte[] b=msg[i].getBytes();   //converts every Ith value into bytes 
       DatagramSocket ds=new DatagramSocket();  //create a socket to connect to server
       InetAddress ia=InetAddress.getLocalHost();
       DatagramPacket dp=new DatagramPacket(b,b.length,ia,P);
       ds.send(dp);       
      }
    
      //after sending packet wait for ack packet
     for(int k=0;k<N;k++)   
     {
        send_ack(k);   
        window.receive_ack(k); //if ack received move window
        if(new remainder(T))  //until 2seconds
        {
          System.out.println("Time out!!");
          retransmit(send_ack(k));
        }
    }
   

     if(i>N)
        break;
    }
  }
}
public void retransmit (int pkt)  throws Exception
{
          for(int i=pkt;i<W;i++)
             ds.send(pkt);     
             System.out.println("Message "+i+"sent");
}
    
public Reminder(int seconds)   throws Exception//for timer
{
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
}
class RemainderTask extends TimerTask
{
         public int run() 
        {
            return true;
            timer.cancel();       //Terminates the timer thread
         }
}


public void checksum( String []  msg) throws Exception  //for checksum sending length of message
{
      for(int i=0;i<N;i++)
     {
      len=msg[i].length;
      return len;
     }
}

public void window() throws Exception  //for movement of window
{
    if(ack_receive(m))
    W+=1;
}
    
    