package it.lorenticompany.ProvaIngSw_209555;

import java.util.Vector;

public class MyListUtil {
	
	public MyListUtil() {}
	
	public Vector<Integer> sort (Vector<Integer> list, int order) throws Exception {
		if(order != 0 && order != 1)
			throw new Exception();
		
		
		if(order == 0) {
			for(int i=0; i<list.size(); ++i) {
				for(int j=0; j<list.size(); ++j) {
					if(list.get(j) > list.get(j+1)) {
						Integer z = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, z);
					}
				}
			}
		}
		else if(order == 1) {
			for(int i=0; i<list.size(); ++i) {
				for(int j=0; j<list.size(); ++j) {
					if(list.get(j) < list.get(j+1)) {
						Integer z = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, z);
					}
				}
			}
		}
		
		return list;
	}

}
