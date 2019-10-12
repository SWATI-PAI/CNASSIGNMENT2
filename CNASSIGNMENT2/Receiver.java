import java.io.*;
import java.util.*;
import java.net.*;

public class Receiver
{
public static int size=k;
public static int next_seq;
public static void main ( String [] args) throws exception
{
for(int i=0;i<N;i++)
{
next_seq=i+1;
if(pkt_rcv(i))
{
buf();
}
else
if(new remainder(T))  //until 2seconds
{
System.out.println("Time out!!");
retransmit(send_ack(k));
}
   
public void send_ack(int packet) throws exception
{
DatagramSocket ds=new DatagramSocket(20089);
byte[] b1=new byte[1024];
DatagramPacket dp=new DatagramPacket(b1,b1.length);
ds.receive(dp);
String str=new String(dp.getData());
}

public int receive_ack(int packet) throws Exception
{
if(packet<W)
return true;
else 
return false;
}

public void buf(int size) throws Exception
{
for(int k=0;k<N;k++)
{
if (k<next_seq)
{
send_ack(k);
}
}
}