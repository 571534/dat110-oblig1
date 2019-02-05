package no.hvl.dat110.rpc;

import java.util.Arrays;

public class RPCUtils {

	public static byte[] marshallString(byte rpcid, String str) {

		// TODO: marshall RPC identifier and string into byte array

		byte[] encoded = new byte[1 + str.getBytes().length];
		
		encoded[0] = rpcid;
		
		for (int i = 0; i < str.getBytes().length; i++) {
			encoded[i+1] = str.getBytes()[i];
		}
		

		return encoded;
	}

	
	public static String unmarshallString(byte[] data) {

		// TODO: unmarshall String contained in data into decoded

		String decoded = new String(Arrays.copyOfRange(data, 1, data.length));


		return decoded;
	}

	
	public static byte[] marshallVoid(byte rpcid) {

		// TODO: marshall RPC identifier in case of void type

		byte[] encoded = new byte[1];
		
		encoded[0] = rpcid;

		
		return encoded;

	}

	
	public static void unmarshallVoid(byte[] data) {

		// TODO: unmarshall void type
		return;
		
	}

	
	public static byte[] marshallBoolean(byte rpcid, boolean b) {

		byte[] encoded = new byte[2];

		encoded[0] = rpcid;

		if (b) {
			encoded[1] = 1;
		} else {
			encoded[1] = 0;
		}

		return encoded;
	}

	
	public static boolean unmarshallBoolean(byte[] data) {

		return (data[1] > 0);

	}

	
	public static byte[] marshallInteger(byte rpcid, int x) {

		// TODO: marshall RPC identifier and string into byte array

		byte[] encoded = new byte[5];
		
		encoded[0] = rpcid;
		
		for (int i = 0; i < 4; i++) {
			encoded[i + 1] = (byte) (x >> (i * 8));
		}


		return encoded;
	}

	
	public static int unmarshallInteger(byte[] data) {

		// TODO: unmarshall integer contained in data

		int decoded = 0;

		for (int i = 0; i < 4; i++) {
			decoded += Byte.toUnsignedInt(data[i + 1]) << (i * 8);
		}

		return decoded;

	}

}
