package com.devoteam.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DemoController {

	public static String devoteam() {
		return System.getenv("DEVOTEAM");
	}
	public static String itech() {
		return System.getenv("ITECH");
	}
	public static String events() {
		return System.getenv("EVENTS");
	}
	public static String careers() {
		return System.getenv("CAREERS");
	}
	public static String insights() {
		return System.getenv("INSIGHTS");
	}
}
