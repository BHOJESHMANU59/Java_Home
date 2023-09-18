package com.sy.CrudOparationUsingJPA;



public class App 
{
    public static void main( String[] args )
    {
      CrudOparationsJPA c=new CrudOparationsJPA();
      c.insertEntity();
      c.findEntity();
      c.updateEntity();
      c.removeEntity();
     
    }
}
