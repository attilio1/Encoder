package com.encryption;

import org.junit.Assert;
import org.junit.Test;


public class EncoderTest {
	
	private static String DECODED = "*CDC is the trademark of the Control Data Corporation.";
	private static String ENCODED = "1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5";

	@Test
	public void testEncode() {
		Encoder enconder = new Encoder();
		String encoded = enconder.encode(DECODED);
		Assert.assertEquals(encoded, ENCODED);
	}

	@Test
	public void testEncodeToFailure() {
		Encoder enconder = new Encoder();
		String encoded = enconder.encode(DECODED);
		Assert.assertNotEquals(encoded, "IT IS NOT THE SAME");
	}
	
	@Test
	public void testDecode() {
		Encoder enconder = new Encoder();
		String decoded = enconder.decode(ENCODED);
		Assert.assertEquals(decoded, DECODED);
	}

	@Test
	public void testDecodeToFailure() {
		Encoder enconder = new Encoder();
		String decoded = enconder.decode(ENCODED);
		Assert.assertNotEquals(decoded, "IT IS NOT THE SAME");
	}
}
