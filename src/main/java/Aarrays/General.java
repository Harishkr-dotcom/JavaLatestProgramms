package Aarrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class General {

	public static void main(String[] args) {
		String TESTUSR1 = "orcladmin";
		String usrRow = "//td[text()='" + TESTUSR1 + "']";
		String s2 = "(//td[text()='" + TESTUSR1 + "'])[2]";
		System.out.println(TESTUSR1);
		System.out.println(s2);

	}

}
