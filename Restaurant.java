import java.time.LocalDateTime;
import java.util.*;

interface Restaurant {
    void input();

    void output();
}

class getDetails implements Restaurant {
    String name;
    String e;
    String c;
    double amount, t;
    double sum = 0;
    ArrayList<String> item = new ArrayList<String>();
    ArrayList<Integer> quantity = new ArrayList<Integer>();
    ArrayList<Integer> price = new ArrayList<Integer>();
    static int billNo = 00;
    LocalDateTime ob = LocalDateTime.now();

    class calculate {
        void bill() {
            Scanner in = new Scanner(System.in);
            for (int i = 0; i < price.size(); i++) {
                sum += price.get(i);

            }
            System.out.println("Applying GST on total amount: ");
            {

                sum = sum + sum * 0.1;
            }
            System.out.println("If you want to give tip enter 1 else 0");
            String s = in.next();
            if (s == "1") {
                System.out.println("Enter amount to give as a tip");
                int t = in.nextInt();
            } else {
                t = 0;
            }
            amount = sum + t;
            System.out.println("Could you please give us feedback, Yes for 1 and No for 0 ");
            String f = in.next();
            if (f == "1") {
                System.out.println("Give Feedback:");
                String fb = in.next();
            } else {
                String fb = "No Feedback";
                // System.out.println("No feedback");
            }
        }
    }

    
    public void input() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = n.next();
        System.out.println("Enter your e-mail: ");
        e = n.next();
        System.out.println("Enter your contact number: ");
        c = n.next();
        
        billNo++;
        
    }
    
    public void output() {
    
        System.out.println("Name of the customer:" + name);
        System.out.println("Email of the customer:" + e);
        System.out.println("Contact Number of the customer:" + c);
        System.out.println("food ordered");
        for (int i = 0; i < item.size(); i++) {
            System.out.println(item.get(i) + "\t\t" + "quantity(number of plates\t\t" + quantity.get(i));
        }
        System.out.println("Total amount paid INR" + amount + "including tip of INR" + t);
    
    }
}

class starter extends getDetails
{
    static String[][] starter1 = { { "Manchurian", "60" }, { "Spring Roll", "60" }, { "Chilly Cheese", "80" },
            { "Chilly Potato", "70" }, { "Tomato Soup", "60" }, { "Sweet Corn Soup", "70" }, { "Hara kabab", "90" },
            { "French Fries", "50" } };

    public void input() {
        System.out.println("STARTER");
        try {
            for (int i = 0; i < 8; i++)
                for (int j = 0; j < 2; j++) {
                    System.out.println(i + "\t" + starter1[i][j]);

                }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the serial number of the dish: ");
        int n = in.nextInt();
        System.out.println("Enter the quantity (number of plates): ");
        int q = in.nextInt();
        item.add(starter1[n - 1][0]);
        quantity.add(q);
        price.add(q * (Integer.parseInt(starter1[n - 1][1])));

    }
}
    class breakfast extends getDetails {
        static String[][] breakfast1 = { { "Aloo Parantha", "20" }, { "Idli Sambhar", "40" }, { "Dosa sambhar", "50" },
                { "Vada Sambhar", "40" }, { "Poha", "40" }, { "Samosa with chutney", "15" },
                { "Grilled Cheese Sandwich", "90" }, { "Samosa with chole", "30" },
                { "Burger with french fries", "120" }

        };

        public void input() {
            System.out.println("Breakfast");
            try {
                for (int i = 0; i < 9; i++)
                    for (int j = 0; j < 2; j++) {
                        System.out.println(i + "\t" + breakfast1[i][j]);

                    }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            Scanner iin = new Scanner(System.in);
            System.out.println("Enter the serial number of the dish: ");
            int n = iin.nextInt();
            System.out.println("Enter the quantity (number of plates): ");
            int q = iin.nextInt();
            item.add(breakfast1[n - 1][0]);
            quantity.add(q);
            price.add(q * (Integer.parseInt(breakfast1[n - 1][1])));
            System.out.println("Still Hungry! Try out our more delicious itmes :D");
            System.out.println("\t1. Main Course");
            System.out.println("\t2. Sweets");
            System.out.println("\t3. Beverages");
            System.out.println("\t4. Starter");
            System.out.println("\t5. More from breakfast");
            System.out.println("\t0. Exit");
            int a = iin.nextInt();
            

            
        }

    }

    class mainCourse extends getDetails {
        static String[][] mainCourse1 = { { "Roti", "20" }, { "Rice", "20" }, { "Dum Aloo", "150" },
                { "Shahi Paneer", "200" }, { "Palak Paneer", "190" }, { "Veg Kofta", "150" },
                { "Paneer Bhurji", "200" }, { "Kadhaai Paneer", "250" }, { "Zeera Aloo", "100" }, { "Dal Fry", "250" },
                { "Dal Makhani", "100" }, { "Veg Biryani", "150" }, { "Mix veg", "90" },

        };

        public void input() {
            System.out.println("Main Course");
            try {
                for (int i = 0; i < 13; i++)
                    for (int j = 0; j < 2; j++) {
                        System.out.println(i + "\t" + mainCourse1[i][j]);

                    }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            Scanner iin = new Scanner(System.in);
            System.out.println("Enter the serial number of the dish: ");
            int n = iin.nextInt();
            System.out.println("Enter the quantity (number of plates): ");
            int q = iin.nextInt();
            item.add(mainCourse1[n - 1][0]);
            quantity.add(q);
            price.add(q * (Integer.parseInt(mainCourse1[n - 1][1])));
            System.out.println("Still Hungry! Try out our more delicious itmes :D");
            System.out.println("\t1. Breakfast");
            System.out.println("\t2. Sweets");
            System.out.println("\t3. Beverages");
            System.out.println("\t4. Starter");
            System.out.println("\t5. More from Main Course");
            System.out.println("\t0. Exit");
            int a = iin.nextInt();
    

        }
    }

        class beverages extends getDetails {
            static String[][] beverages1 = { { "Coke", "20" }, { "Mojito", "40" }, { "Coffee", "20" }, { "Tea", "15" },
                    { "Lemonade", "20" }, { "Iced tea", "30" }, { "Milkshake", "40" }, { "Juice", "30" },
                    { "Water", "25" },

            };

            public void input() {
                System.out.println("Beverages");
                try {
                    for (int i = 0; i < 13; i++)
                        for (int j = 0; j < 2; j++) {
                            System.out.println(i + "\t" + beverages1[i][j]);

                        }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
                Scanner iin = new Scanner(System.in);
                System.out.println("Enter the serial number of the dish: ");
                int n = iin.nextInt();
                System.out.println("Enter the quantity (number of plates): ");
                int q = iin.nextInt();
                item.add(beverages1[n - 1][0]);
                quantity.add(q);
                price.add(q * (Integer.parseInt(beverages1[n - 1][1])));
                System.out.println("Still Hungry! Try out our more delicious itmes :D");
                System.out.println("\t1. Breakfast");
                System.out.println("\t2. Sweets");
                System.out.println("\t3. Beverages");
                System.out.println("\t4. Starter");
                System.out.println("\t5. More from Main Course");
                System.out.println("\t0. Exit");
                int a = iin.nextInt();

            }
        }
            class sweets extends getDetails {
                static String[][] sweets1 = { { "Balushahi(1 piece)", "20" }, { "Gajar ka halwa", "50" },
                        { "Gulab jamun (1 piece)", "20" }, { "Jalebi", "15" }, { "Peda", "30" }, { "Barfi", "50" },
                        { "Pastery", "40" }, { "Milk cake", "50" }, { "Ice-Cream", "35" }, { "Rasmalai", "45" }

                };

                public void input() {
                    System.out.println("Sweets");
                    try {
                        for (int i = 0; i < 10; i++)
                            for (int j = 0; j < 2; j++) {
                                System.out.println(i + "\t" + sweets1[i][j]);

                            }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                    Scanner iin = new Scanner(System.in);
                    System.out.println("Enter the serial number of the dish: ");
                    int n = iin.nextInt();
                    System.out.println("Enter the quantity (number of plates): ");
                    int q = iin.nextInt();
                    item.add(sweets1[n - 1][0]);
                    quantity.add(q);
                    price.add(q * (Integer.parseInt(sweets1[n - 1][1])));
                    System.out.println("Still Hungry! Try out our more delicious itmes :D");
                    System.out.println("\t1. Breakfast");
                    System.out.println("\t2. Main Course");
                    System.out.println("\t3. Beverages");
                    System.out.println("\t4. Starter");
                    System.out.println("\t5. More from Main sweets");
                    System.out.println("\t0. Exit");
                    int a = iin.nextInt();
        

                    

                }
            }

class main1 {

                    public static void main(String[] args)
                    {
                        Scanner in = new Scanner(System.in);
    int a;
    getDetails b=new getDetails();
    b.input();
 //   b.output();
 do
    {
    System.out.println("Food Menu");
    System.out.println("\t1. Starter");
    System.out.println("\t2. Breakfast");
    System.out.println("\t3. Main Course");
    System.out.println("\t4. Sweets");
    System.out.println("\t5. Beverages");
    System.out.println("\t0. Exit");
    a=in.nextInt();
   
    

    if (a==1)
    {
        getDetails aa=new starter();
        aa.input();
     }
    else if(a==2)

    {
        getDetails bb=new breakfast();
        bb.input();
    }
    else if(a==3)
    {
        getDetails cc=new mainCourse();
        cc.input();
    }
    else if(a==4)
    {
        getDetails dd=new sweets();
        dd.input();
    }
    else if(a==5)
    {
        getDetails ee=new beverages();
        ee.input();

    }
    else if(a==0)
    {
       System.exit(0); 
    }
}while(true);

 }


}
