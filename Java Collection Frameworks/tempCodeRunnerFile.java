    Polynomial p = new Polynomial(new Term(0,5));
    p.add(new Term(1, 6));

    Polynomial p2 = new Polynomial(new Term(0,2));
    p2.add(new Term(1,7));


  Polynomial temp = p.multiplication(p2);

//   temp.simplyfy();

  System.out.println(temp);