package labass6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Agent> data=new ArrayList<>();
		data.add(new Agent(101,"om","ranar"));
		data.add(new Agent(102,"mai","sainagar"));
		data.add(new Agent(103,"shree","pune"));
		data.add(new Agent(104,"adi","Nigdi"));
		data.add(new Agent(105,"sony","laxmnnagr"));
		Collections.sort(data);
		for(Agent i:data) {
			System.out.println("id"+i.getId()+"name"+i.getName()+"Area"+i.getArea());
	}

}
class Agent implements Comparable<Agent>{
	
	
	private int id;
	private String name;
	private String Area;
	public Agent(int id,String name,String Area) {
		super();
		this.id=id;
		this.name=name;
		this.Area=Area;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	@Override
	public int compareTo(Agent o) {
		// TODO Auto-generated method stub
		return this.Area.compareTo(o.Area);
		
	}
}
}
