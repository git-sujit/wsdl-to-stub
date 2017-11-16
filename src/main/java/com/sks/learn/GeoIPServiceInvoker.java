package com.sks.learn;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class GeoIPServiceInvoker {

	public static void main(String[] args) {
		System.out.println("Web Service: To Get Country of an IP");
		String ipAddress = "216.58.195.78";
		// Corresponding to wsdl:service
		GeoIPService ipService = new GeoIPService();
		// Corresponding to wsdl:PortType
		GeoIPServiceSoap stub = ipService.getGeoIPServiceSoap();
		// Invoking the method ~ wsdl:operation ~ SOAP Web Service
		GeoIP ip = stub.getGeoIP(ipAddress);
		System.out.println("Country = " + ip.getCountryCode() + " : " + ip.getCountryName());
	}

}
