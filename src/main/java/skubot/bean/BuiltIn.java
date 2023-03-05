package skubot.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BuiltIn implements Serializable {

	private static final long serialVersionUID = 1L;

	final static private Map<String, Integer> brands = new HashMap<String, Integer>() {

		private static final long serialVersionUID = 1L;

		{
			put("lg", 0);
			put("ss", 0);
			put("bsh", 0);
			put("lux", 0);
			put("haier", 0);
			put("other", 0);
		}
	};

	private Map<String, Integer> oven;
	private Map<String, Integer> hob;
	private Map<String, Integer> hood;

	public BuiltIn() {
		oven = brands;
		hob = brands;
		hood = brands;
	}
	
	public void plusOneOven(String brand) {
		//LOGIC
	}
	
	public void get
	

}
