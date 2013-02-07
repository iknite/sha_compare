import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class sha{
	public static void main(String[] args) throws Exception{
		if(args.length < 1){return;}

		MessageDigest md = MessageDigest.getInstance("SHA-1");
		String buffer = args[0];

		md.reset();
		md.update(buffer.getBytes("UTF-8"));
		System.out.print(DatatypeConverter.printHexBinary(md.digest()));

		md.reset();
		md.update(buffer.getBytes("UTF-8"));
		System.out.print(" ");
		System.out.print(DatatypeConverter.printBase64Binary(md.digest()));

	}
}


