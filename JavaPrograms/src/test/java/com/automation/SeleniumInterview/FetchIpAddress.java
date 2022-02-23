package com.automation.SeleniumInterview;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class FetchIpAddress {

	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		       
			String s="https://www.google.com";
			InetAddress IP = InetAddress.getByName(new URL(s).getHost());
			System.out.println(IP);

}
}