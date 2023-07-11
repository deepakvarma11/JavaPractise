package hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class MessageDigesting {

	public static void main(String[] args) {

		System.out.println(digestts("deepak"));

		String data = digestts("deepak");
		try {
			System.out.println(Hex.decodeHex(data));
		} catch (DecoderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String digestts(String data) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
			return new String(Hex.encodeHex(encodedHash));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}

	}

}
