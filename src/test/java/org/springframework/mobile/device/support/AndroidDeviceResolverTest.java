package org.springframework.mobile.device.support;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.support.AndroidDeviceResolver;

public class AndroidDeviceResolverTest {
	
	@Test
	public void resolve() {
		AndroidDeviceResolver resolver = new AndroidDeviceResolver();
		Device device = resolver.resolveDevice(new StubDeviceRequest("Mozilla/5.0 (Linux; U; Android 2.2; en-us; Nexus One Build/FRF91) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"));
		assertNotNull(device);
		assertTrue(device.isMobileBrowser());
		assertFalse(device.isApple());
	}
	
	@Test
	public void noResolve() {
		AndroidDeviceResolver resolver = new AndroidDeviceResolver();
		Device device = resolver.resolveDevice(new StubDeviceRequest());
		assertNull(device);
	}
	
}