package control;

import java.util.ArrayList;
import java.util.List;

public class Db {
	static List<String> list=new ArrayList<>();
	static List<String> temp=new ArrayList<>();
	public List<String> theList(){
		return list;
	}
	public String output(int x){
		if(!list.isEmpty()){
			return list.get(x);
		}
		else{
			return "empty";
		}
	}
	
	public void input(String word){
		temp.addAll(list);
		list.clear();
		list.add(word);
		list.addAll(temp);
		if(list.size()>11){
			for(int x=list.size()-1;x>11;x--){
				list.remove(x);
			}
		}
		temp.clear();
	}
	
}

