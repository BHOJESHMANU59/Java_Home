package com.sy;

public class App 
{
    public static void main( String[] args )
    {
        CriteriaRead c=new CriteriaRead();
        //c.insert();
        c.criteriaget();
        System.out.println("--------------------------------------------");
        c.restrictionsget();
        System.out.println("---------------------------------------------");
        c.projectionsget();
    }
}
