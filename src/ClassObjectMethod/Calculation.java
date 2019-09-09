package ClassObjectMethod;
                            //doesn't take any parameter and not returned any value
public class Calculation
{
    int x = 10;
    int y = 20;

                //case 1; doesn't take any parameter and not returned any value
    /* void sum() // no returning any value so void & not taking any parameter so brackets are empty    {
    {
        System.out.println(x+y);
    } */

   /*int sum () //Case 2; not taking parameters but returning value; returning value int and no para. so bracket is empty
   {
       return (x+y);
   }
  */
    /*void sum (int a, int b)     //case 3; taking parameters and not returning any value

    {
        System.out.println(a+b);
    }*/

    int sum (int a, int b)        //case 4; taking parameter and also returning value
    {
        return (a+b);
    }
    public static void main(String[] args)
    {
        Calculation cal = new Calculation(); //this is an object , object always come under main mehtod

        //cal.sum();  //case 1 :  doesn't take any parameter and not returned any value

        /*int res = cal.sum();  //case 2; not taking para but returning value
        System.out.println(res);      //in case 1 in method itself sout has been used so dont need to use it again but in case 2 sout is not used in method
        System.out.println(cal.sum());  //you can use cal.sum directly in sout if you wish to
        */
        cal.sum(100,200); //case 3; taking para but not returning any value

        int res = cal.sum(100, 200); //case 4; taking para and returning value as well
        System.out.println(res);
        System.out.println(cal.sum(100, 200));
    }

}
