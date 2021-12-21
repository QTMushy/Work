import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;

public class Polynomial implements Comparable<Polynomial>{
	TreeMap<Integer, Integer> num;
	int degree;

	public Polynomial()
	{
		num = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		degree = -1;
	}
	public Polynomial(int power,int coefficient)
	{
		num = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		try{
            if (power < 0) {
                throw new IllegalArgumentException();
            }
            num.put(power, coefficient);
			degree = power;
            
        }
        catch (IllegalArgumentException e){
            System.out.println("java.lang.IllegalArgumentException: Power of a term can't be negative.");
        }
	}
	public Polynomial(Polynomial p)
	{
		num = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		degree = p.degree;
		num.putAll(p.num);
	}
	public Polynomial(TreeMap<Integer, Integer> in)
	{
		this.num = new TreeMap<>(Collections.reverseOrder());
		for(Map.Entry<Integer, Integer> entry : in.entrySet())
		{
			this.num.put(entry.getKey(), entry.getValue());
		}
		degree = num.firstKey();
	}

	public void add(Polynomial input)
	{
		TreeMap<Integer,Integer> temp = input.num;
		

		Set<Integer> power = temp.keySet();

		Iterator<Integer> it = power.iterator();

		while(it.hasNext())
		{
			int po = it.next();
			if(this.num.containsKey(po))
			{
				
				int co = this.num.get(po);
				int co1 = temp.get(po);
				this.num.put(po, co+co1);
			}
			else
			{
				this.num.put(po, temp.get(po));
			}
			
		}
	}
	public void subtract(Polynomial input)
	{
		TreeMap<Integer,Integer> temp = input.num;
		

		Set<Integer> power = temp.keySet();

		Iterator<Integer> it = power.iterator();

		while(it.hasNext())
		{
			int po = it.next();
			if(this.num.containsKey(po))
			{
				
				int co = this.num.get(po);
				int co1 = temp.get(po);
				if(co-co1!=0)
				{
					this.num.put(po, co-co1);
				}
				else
				{
					this.num.remove(po);
				}
				
			}
			else
			{
				this.num.put(po, -(temp.get(po)));
			}
			
		}

		
	}

	public int getDegree()
	{
		this.degree = num.firstKey();
		return this.degree;
	}

	// public Polynomial multiply(Polynomial P){

    // }

	public int coefficient(int power){
        return num.get(power);
    }

	public void changeCoefficient(int power, int coefficient){
		if(num.containsKey(power))
		{
			num.put(power, coefficient);
		}
	}

	public void removeTerm(int power){
		num.remove(power);
	}

	public int evaluate(Double x){
		int sum = 0;
		Iterator<Integer> it = num.keySet().iterator();
		while(it.hasNext()){
			int power = it.next();
			int co = num.get(power);
			sum += co*(int)Math.pow(x, power);
		}
		return sum;
	}

	
	@Override
	public boolean equals(Object p)
	{
		Polynomial input = (Polynomial) p;
		if(num.size()!=input.num.size())
		{
			return false;
		}
		if(this.getDegree() == input.getDegree())
		{
			Iterator<Integer> it = num.keySet().iterator();
			while(it.hasNext())
			{
				int po = it.next();
				if(input.num.containsKey(po))
				{
					if(this.num.get(po) != input.num.get(po))
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
    public int compareTo(Polynomial input) {
        double num1 = this.evaluate(0.0);
        double num2 = input.evaluate(0.0);
        if (num1 > num2){
            return 1;
        }
        else if (num1 < num2){
            return -1;
        }
        return 0;
    }

	@Override
	public String toString() {
		String str = "";
		Iterator<Integer> it = num.keySet().iterator();
		int po = it.next();
			int co = num.get(po);
			if(co!=0)
			{
				if(po==0)
				{
					str += co;
				}
				else if(po==1)
				{
					str += co + "x";
				}
				else
				{
					str += co + "x" + po;
				}
			}

		while(it.hasNext())
		{
			 po = it.next();
			 co = num.get(po);
			 if(co>0)
			 {
				 str+="+";
			 }
			if(co!=0)
			{
				if(po==0)
				{
					str += co;
				}
				else if(po==1)
				{
					str += co + "x";
				}
				else
				{
					str += co + "x" + po;
				}
			}
			
		}
		return str;
	}
}







