import java.io.*;
import java.net.*;

class server1
{
private ServerSocket serverSocket; // jab bhi server ka object banega to ek serversocket Name ka pointer hoga or ek Socket name ka
private Socket socket ;

server1()   // constructor
{
try
{
serverSocket=new ServerSocket(5500);// server ko bind kara humne port 5500 per
startListening(); // listening mode m dal diya 
}catch(Exception e)
{
System.out.println(e);
}
}

// method for server for listening

private void startListening()
{
try
{
InputStream is;
InputStreamReader isr;
OutputStream os;
OutputStreamWriter osw;
StringBuffer sb;
int c1,c2;
int x;
String pc1,pc2,pc3;
int rollNumber;
String name, gender, response, request;
while(true)
{
System.out.println("Server Is Ready For Accepting Request On Port 5500");
socket=serverSocket.accept(); // Server Socket Goes in Wait Mode To Accept
is=socket.getInputStream();
isr=new InputStreamReader(is);
sb=new StringBuffer();
while(true)
{
x=isr.read();
if(x==-1) break;
if(x=='#') break;
sb.append((char)x);
}
request=sb.toString();
System.out.println("Request Arrived : " + request);
c1=request.indexOf(",");
c2=request.indexOf(",",c1+1);
pc1=request.substring(0,c1);
pc2=request.substring(c1+1,c2);
pc3=request.substring(c2+1);
rollNumber=Integer.parseInt(pc1);
name=pc2;
gender=pc3;
System.out.printf("Roll Number %d, Name %s , Gender %s\n" , rollNumber, name, gender);
response= "Data Saved#";
os=socket.getOutputStream();
osw=new OutputStreamWriter(os);
osw.write(response);
osw.flush(); // imp
socket.close();
}
}catch(Exception e)
{
System.out.println(e.getMessage());
}

}





public static void main(String gg[])
{
try
{
server1 server=new server1();
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}



}