import java.util.*;  
interface Restaurant {
    void details();
    void bill();
    void foodChoice();
}
class getDetails implements Restaurant{
    String name;
    String e;
    String c;
    ArrayList<String> item=new ArrayList<String>();
    ArrayList<Integer>quantity=new ArrayList<Integer>();
    ArrayList<Integer>price=new ArrayList<Integer>();
    static int billNo=00;
    public void details()
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=n.next();
        System.out.println("Enter your e-mail: ");
        e=n.next();
        System.out.println("Enter your contact number: ");
        c=n.next();
        billNo++;
        
    }

}
class starter extends getDetails {
static String [][]starter1={
                        {"Manchurian","60"},
                        {"Spring Roll","60"},
                        {"Chilly Cheese","80"},
                        {"Chilly Potato","70"},
                        {"Tomato Soup","60"},
                        {"Sweet Corn Soup","70"},
                        {"Hara kabab","90"},
                        {"French Fries","50"}
                        };
void input()
{
    System.out.println("____STARTER____");
    for(int i=0;i<8;i++)
     for(int j=0;j<2; j++)
     {
        System.out.println(i+"\t"+starter1[i][j] );

     }
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the serial number of the dish: ");
    int n=in.nextInt();
    System.out.println("Enter the quantity (number of plates): ");
    int q=in.nextInt();
    item.add(starter1[n-1][0]);
    quantity.add(q);
    price.add(q*(Integer.parseInt(starter1[n-1][1])));
    System.out.println("Still Hungry! Try out our more delicious itmes :D");
    System.out.println("\t1. Main Course");
    System.out.println("\t2. Sweets");
    System.out.println("\t3. Beverages");
    System.out.println("\t4. Breakfast");
    System.out.println("\t5. More from Starter");
    System.out.println("\t0. Exit");
    int a=in.nextInt();
    switch(a)
    {
        case 1:
        {

        }
        case 2:
        {


        }
        case 3:
        {


        }
        case 4:
        {


        }
        case 5:
        {


        }
        case 0:
        {


        }


    }
}


}
class breakfast extends getDetails
{
    static String [][]breakfast1={
        {"Aloo Parantha","20"},
        {"Idli Sambhar","40"},
        {"Dosa sambhar","50"},
        {"Vada Sambhar","40"},
        {"Poha","40"},
        {"Samosa with chutney","15"},
        {"Grilled Cheese Sandwich","90"},
        {"Samosa with chole","30"},
        {"Burger with french fries","120"}             
    
        };
        void input()
{
    System.out.println("____Breakfast____");
    for(int i=0;i<9;i++)
     for(int j=0;j<2; j++)
     {
        System.out.println(i+"\t"+breakfast1[i][j] );

     }
    Scanner iin =new Scanner(System.in);
    System.out.println("Enter the serial number of the dish: ");
    int n=iin.nextInt();
    System.out.println("Enter the quantity (number of plates): ");
    int q=iin.nextInt();
    item.add(breakfast1[n-1][0]);
    quantity.add(q);
    price.add(q*(Integer.parseInt(breakfast1[n-1][1])));
    System.out.println("Still Hungry! Try out our more delicious itmes :D");
    System.out.println("\t1. Main Course");
    System.out.println("\t2. Sweets");
    System.out.println("\t3. Beverages");
    System.out.println("\t4. Starter");
    System.out.println("\t5. More from breakfast");
    System.out.println("\t0. Exit");
    int a=iin.nextInt();
    switch(a)
    {
        case 1:
        {

        }
        case 2:
        {


        }
        case 3:
        {


        }
        case 4:
        {


        }
        case 5:
        {


        }
        case 6:
        {

        }


    }
}

}
class mainCourse extends getDetails{
    static  String [][]mainCourse1={
        {"Roti","20"},
        {"Rice","20"},
        {"Dum Aloo","150"},
        {"Shahi Paneer","200"},
        {"Palak Paneer","190"},
        {"Veg Kofta","150"},
        {"Paneer Bhurji","200"},
        {"Kadhaai Paneer","250"},
        {"Zeera Aloo","100"},
        {"Dal Fry","250"},
        {"Dal Makhani","100"},
        {"Veg Biryani","150"},
        {"Mix veg","90"},
        
        };
        void input()
{
    System.out.println("____Main Course____");
    for(int i=0;i<13;i++)
     for(int j=0;j<2; j++)
     {
        System.out.println(i+"\t"+mainCourse1[i][j] );

     }
    Scanner iin =new Scanner(System.in);
    System.out.println("Enter the serial number of the dish: ");
    int n=iin.nextInt();
    System.out.println("Enter the quantity (number of plates): ");
    int q=iin.nextInt();
    item.add(mainCourse1[n-1][0]);
    quantity.add(q);
    price.add(q*(Integer.parseInt(mainCourse1[n-1][1])));
    System.out.println("Still Hungry! Try out our more delicious itmes :D");
    System.out.println("\t1. Breakfast");
    System.out.println("\t2. Sweets");
    System.out.println("\t3. Beverages");
    System.out.println("\t4. Starter");
    System.out.println("\t5. More from Main Course");
    System.out.println("\t0. Exit");
    int a=iin.nextInt();
    switch(a)
    {
        case 1:
        {

        }
        case 2:
        {


        }
        case 3:
        {


        }
        case 4:
        {


        }
        case 5:
        {


        }
        case 0:
        {

        }


    }


}

class beverages extends getDetails{
    static   String  [][]beverages1={
        {"Coke","20"},
        {"Mojito","40"},
        {"Coffee","20"},
        {"Tea","15"},
        {"Lemonade","20"},
        {"Iced tea","30"},
        {"Milkshake","40"},
        {"Juice","30"},
        {"Water","25"},            
    
        };
        void input()
        {
            System.out.println("____Beverages____");
            for(int i=0;i<13;i++)
             for(int j=0;j<2; j++)
             {
                System.out.println(i+"\t"+beverages1[i][j] );
        
             }
            Scanner iin =new Scanner(System.in);
            System.out.println("Enter the serial number of the dish: ");
            int n=iin.nextInt();
            System.out.println("Enter the quantity (number of plates): ");
            int q=iin.nextInt();
            item.add(mainCourse1[n-1][0]);
            quantity.add(q);
            price.add(q*(Integer.parseInt(mainCourse1[n-1][1])));
            System.out.println("Still Hungry! Try out our more delicious itmes :D");
            System.out.println("\t1. Breakfast");
            System.out.println("\t2. Sweets");
            System.out.println("\t3. Beverages");
            System.out.println("\t4. Starter");
            System.out.println("\t5. More from Main Course");
            System.out.println("\t0. Exit");
            int a=iin.nextInt();
            switch(a)
            {
                case 1:
                {
        
                }
                case 2:
                {
        
        
                }
                case 3:
                {
        
        
                }
                case 4:
                {
        
        
                }
                case 5:
                {
        
        
                }
                case 0:
                {

                }
        
        
            }
        



}
 class sweets extends getDetails{
   static String [][]sweets1={
        {"Balushahi(1 piece)","20"},
        {"Gajar ka halwa","50"},
        {"Gulab jamun (1 piece)","20"},
        {"Jalebi","15"},
        {"Peda","30"},
        {"Barfi","50"},
        {"Pastery","40"},
        {"Milk cake","50"},
        {"Ice-Cream","35"},
        {"Rasmalai","45"}   
    
};
void input()
{
    System.out.println("____Beverages____");
    for(int i=0;i<13;i++)
     for(int j=0;j<2; j++)
     {
        System.out.println(i+"\t"+beverages1[i][j] );

     }
    Scanner iin =new Scanner(System.in);
    System.out.println("Enter the serial number of the dish: ");
    int n=iin.nextInt();
    System.out.println("Enter the quantity (number of plates): ");
    int q=iin.nextInt();
    item.add(mainCourse1[n-1][0]);
    quantity.add(q);
    price.add(q*(Integer.parseInt(mainCourse1[n-1][1])));
    System.out.println("Still Hungry! Try out our more delicious itmes :D");
    System.out.println("\t1. Breakfast");
    System.out.println("\t2. Sweets");
    System.out.println("\t3. Beverages");
    System.out.println("\t4. Starter");
    System.out.println("\t5. More from Main Course");
    System.out.println("\t0. Exit");
    int a=iin.nextInt();
    switch(a)
    {
        case 1:
        {

        }
        case 2:
        {


        }
        case 3:
        {


        }
        case 4:
        {


        }
        case 5:
        {


        }
        case 0:
        {

        }


    }




}




 }


