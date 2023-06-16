 import java.io.Serializable;

class packet implements Serializable
 {
	float h;
    
	String d;
   
	int p;
    
	Boolean t;

 
   packet(int p,String d,Boolean t,float h)
    {
    	this.h = h;
     
 	this.d = d;
     
 	this.p = p;
     
 	this.t = t;
   
    }
   void showDetails()
    {
     System.out.println("Header:"+h);
     System.out.println("Data:"+d);
     System.out.println("ProtocolID:"+p);
     System.out.println("Tailer:"+t);
    }
 }