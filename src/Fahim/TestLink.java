package Fahim;

public class TestLink {
	
	private String link1;
	private String link2;
	private String name;
	private String result;
	
	public String sendLink()
	{
		link1 = "getName.action?name=Fahim";
		link2 = "getName.action?name=Lenin";
		return "success";
	}
	
	public String getValue()
	{
		if(name.equals("Fahim"))
		{
			result = "Fahim";
		}
		else if(name.equals("Lenin"))
		{
			result = "Lenin";
		}
		return "success";
	}
	
	public String getLink1() {
		return link1;
	}
	public void setLink1(String link1) {
		this.link1 = link1;
	}
	public String getLink2() {
		return link2;
	}
	public void setLink2(String link2) {
		this.link2 = link2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
