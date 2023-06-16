import java.net.*;
import java.io.*;
class objectServer
 {
  public static void main(String arg[]) throws Exception
   {
  
   // Server will be started on 1700 port number
    ServerSocket server=new ServerSocket(1700);
	
   // Server listening for connection
    Socket s=server.accept();
	
   // Stream object for sending object 
    ObjectOutputStream os=new ObjectOutputStream(s.getOutputStream());
	
   packet object1=new packet(10.00,"Akkas",10);
   os.writeObject(object1);
   
   s.close();
   }
 }
 