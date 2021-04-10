
import java.util.*;
public class ebill
{
    public static void main(String[] args) {
        customerdata cd=new customerdata();
        cd.getdata();
        cd.calc();
        cd.display();

    }
}
class customerdata
{
    Scanner s=new Scanner(System.in);
    String name,type;
    int num;
    double current,previous,units,tbills;
    void getdata()
    {
        System.out.println("ENTER THE CONSUMER ID: ");
        num=s.nextInt();
        System.out.println("ENTER THE CONSUMER NAME: ");
        name=s.next();
        System.out.println("ENTER THE TYPE OF CONNECTION (D FOR DOMESTIC & C FOR COMMERCIAL): ");
        type=s.next();
        System.out.println("ENTER THE PREVIOUS MONTH READING: ");
        previous=s.nextDouble();
        System.out.println("ENTER THE CUREENT MONTH READING: ");
        current=s.nextDouble();

        //System.out.println("");
    }
    void calc()
    {
        units=current-previous;
        if(type.equals("D"))
        {
            if(units<=100)
            {
                tbills=1*units;
            }
            else if(units>100 && units<=200)
            {
                tbills=2.50*units;
            }
            else if(units>200 && units<=500)
            {
                tbills=4*units;
            }
            else
            {
                tbills=6*units;
            }

        }
        else
        {
            if(units<=100)
            {
                tbills=2*units;
            }
            else if(units>100 && units<=200)
            {
                tbills=4.50*units;
            }
            else if(units>200 && units<=500)
            {
                tbills=6*units;
            }
            else
            {
                tbills=7*units;
            }
        }

    }
    void display()
    {
        System.out.println("CONSUMER NUMBER: "+num);
        System.out.println("CONSUMER NAME: "+name);
        if(type.equals("D"))
        {
            System.out.println("TYPE OF CONNECTION =DOMESTIC ");
        }
        else
        {
            System.out.println("TYPE OF CONNECTION =COMMERCIAL");
        }
        System.out.println("PREVIOUS MONTH READING: "+previous);
        System.out.println("CURRENT MONTH READING: "+current);
        System.out.println("UNITS CONSUMED FOR THIS MONTH: "+units);
        System.out.println("TOTAL BILL: "+tbills);
    }
}
