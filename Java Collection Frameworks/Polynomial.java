import java.util.Collection;
import java.util.LinkedList;

public class Polynomial {

    LinkedList<Term> p = new LinkedList<Term>();

    public Polynomial()
    {
       

    }

    public Polynomial(LinkedList<Term> input)
    {
        this.p = input;
    }


    public Polynomial(Term p)
    {
        
      this.p.add(p);
    }

    public void add(Term p)
    {
        this.p.addFirst(p);;
    }

    public LinkedList<Term> getpolynomial()
    {
        return p;
    }

    public Polynomial multiplication(Polynomial input)
    {
        Polynomial output = new Polynomial();
        LinkedList<Term> temp = input.getpolynomial();
        for(int i =0; i<p.size();i++)
        {
            for(int j=0;j<temp.size();j++)
            {
                output.add(new Term(p.get(i).getPower()+temp.get(j).getPower(), p.get(i).getCoefficent()*temp.get(j).getCoefficent()));
                output.display();
                
                

            }
           // System.out.println(i);

        }
        return output;

        


    }

    public void simplyfy()
    {
        for(int i=0;i<p.size()-1;i++)
        {
            for(int j=i+1;j<p.size();j++)
            {
                if(p.get(i).getPower()==p.get(j).getPower())
                {
                    p.add(i,new Term(p.get(i).getPower(),p.get(i).getCoefficent()+p.get(j).getCoefficent()));
                    p.remove(j);
                    j--;
                }
            }
        }
    }

    public void display()
    {
        for(int i=0;i<p.size();i++)
        {
            System.out.print(p.get(i)+" + ");
        }
    }
    
}
