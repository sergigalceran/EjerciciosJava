package edu.upc.eetac.dsa.sgalceran.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket("Servidor",12345);
		BufferedReader b = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String hora = b.readLine();
        System.out.println(hora);
	}
	}

