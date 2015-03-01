package edu.upc.eetac.dsa.sgalceran.tcp;


import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class Servidor {
	public static void main(String argv[]) throws Exception
    {
       ServerSocket s = new ServerSocket(12345);
       Socket ser = s.accept();
       SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       while(true)
       {
    	  PrintWriter p = new PrintWriter(ser.getOutputStream());
    	  p.println(""+ hora);
           
    }

}}
