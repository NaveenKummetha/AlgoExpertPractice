package com.hello;

import java.net.*;

import java.util.Iterator;

public class ValidateIPAddress {
	public static void main(String[] args) {
		System.out.println(new ValidateIPAddress().validIPAddress1("01.01.01.01"));
		int k = 172;
		if (k > 0) {
			System.out.println("hello");
		}
	}

	public String validIPAddress1(String IP) {
		try {
			return (InetAddress.getByName(IP) instanceof Inet6Address) ? "IPv6" : "IPv4";
		} catch (Exception e) {
		}
		return "Neither";
	}

	public String validIPAddress(String queryIP) {
		if (queryIP.charAt(queryIP.length() - 1) == ':' || queryIP.charAt(queryIP.length() - 1) == '.') {
			return "Neither";
		}
		String[] ip4arr = queryIP.split("\\.");
		String[] ip6arr = queryIP.split("\\:");

		boolean finalBool = true;

		if (ip4arr.length == 4) {
			for (String string : ip4arr) {
				int k;
				try {
					k = Integer.parseInt(string);
				} catch (NumberFormatException nfe) {
					finalBool = false;
					break;
				}

				if (!((string.charAt(0) == '0' && string.length() == 1) || (k >= 0 && k <= 255))) {
					finalBool = false;
					break;
				}

			}
			if (finalBool) {
				return "IPv4";
			}
		} else if (ip6arr.length == 8) {
			for (String string : ip6arr) {
				if (string.length() >= 1 && string.length() <= 4) {
					for (char string2 : string.toCharArray()) {
						int val2 = (int) string2;
						if (!((val2 >= 48 && val2 <= 65) || (val2 >= 65 && val2 <= 70)
								|| (val2 >= 97 && val2 <= 102))) {
							finalBool = false;
							break;
						}
					}
				} else {
					finalBool = false;
				}
			}
			if (finalBool) {
				return "IPv6";
			}
		}
		return "Neither";
	}
}
