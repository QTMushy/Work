import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Poly {
	private TreeMap<Integer,Double> list;
	private int degree;
	

	public Poly(double c,int p)
	{
		list = new TreeMap<>(Collections.reverseOrder());

		list.put(p, c);
		degree = p;
	}

	public void add(double c,int p)
	{
		if(list.containsKey(p))
		{
			double temp = list.get(p);
			temp += c;
			list.put(p,temp);
		}
		else
		{
			list.put(p,c);
		}
		if(p>degree)
		{
			degree = p;
		}
	}

public TreeMap<Integer, Double> getList() {
	return list;
}

	public TreeMap<Integer,Double> addPoly(Poly input)
	{
		TreeMap<Integer,Double> t  = new TreeMap<>(list);

		for(Map.Entry<Integer, Double> E: input.getList().entrySet())
		{
			if(list.containsKey(E.getKey()))
			{
				double temp = list.get(E.getKey());
				temp += E.getValue();
				t.put(E.getKey(),temp);
			}
			else
			{
				t.put(E.getKey(),E.getValue());
			}
		}

		return t;

	}

	public int getDegree() {
		return degree;
	}


	
}
