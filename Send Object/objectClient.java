import java.io.*;
import java.net.*;
class objectClient 
 {
  public static void main(String arg[]) throws Exception
   {
     Socket s=new Socket("127.0.0.1",1700);
     ObjectInputStream is=new ObjectInputStream(s.getInputStream());
     packet st=(student)is.readObject();
     packet.showDetails();
     s.close();
   }
 }
