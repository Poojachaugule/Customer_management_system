/******************** Importing Essential Libraries ************************/

import java.util.*;
import java.io.*;

class MainMenu
{
  public void menu()
  {
    System.out.println("\t\t\t  Customer_Management_system ");
    System.out.println("\t\t\t    --------------------");
    System.out.println("\t\t\t     ~$ pooja");
    System.out.println("\t\t\t    --------------------");
    System.out.println("\n\nPress 1 : To Add an customer Details");
    System.out.println("Press 2 : To See an customer Details ");
    System.out.println("Press 3 : To Remove an customer");
    System.out.println("Press 4 : To Update customer Details");
    System.out.println("Press 5 : To Exit the CMS Portal");

  }
}



class Customer_Add
{
    public void createFile()
    {
        Scanner sc=new Scanner(System.in);

        CustomerDetail cus=new CustomerDetail();
        cus.getInfo();
        try{
            File f1=new File("file"+cus.customer_id+".txt");
            if(f1.createNewFile()){
                FileWriter myWriter = new FileWriter("file"+cus.customer_id+".txt");
                myWriter.write("Customer ID:"+cus.customer_id+"\n"+"Customer Name     :"+cus.name+"\n"+
                "Father's Name     :"+cus.father_name+"\n"+"Customer Contact  :"+cus.customer_contact+"\n"+
                "Email Information :"+cus.email+"\n"+"Customer position :"+cus.position+"\n"+
                "Customer Salary   :"+cus.customer_salary);
                myWriter.close();
                System.out.println("\nCustomer has been Added :)\n");

                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
            else {
                System.out.println("\nCustomer already exists :(");
                System.out.print("\nPress Enter to Continue...");
                sc.nextLine();
            }
        }
        catch(Exception e){System.out.println(e);}
    }
}


class CustomerDetail
{
    String name;
    String father_name;
    String email;
    String position;
    String customer_id;
    String customer_salary;
    String customer_contact;
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter customers's name --------: ");
        name=sc.nextLine();
        System.out.print("Enter customers's Father name -: ");
        father_name=sc.nextLine();
        System.out.print("Enter customers's ID ----------: ");
        customer_id=sc.nextLine();
        System.out.print("Enter customers's Email ID ----: ");
        email=sc.nextLine();
        System.out.print("Enter customers's Position ----: ");
        position=sc.nextLine();
        System.out.print("Enter customers's contact Info --: ");
        customer_contact=sc.nextLine();
        System.out.print("Enter customers's Salary ------: ");
        customer_salary=sc.nextLine();
    }
}


class Customer_Show
{
  public void viewFile(String s) throws Exception
  {
    File file = new File("file"+s+".txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine())
     {
       System.out.println(sc.nextLine());
     }
   }
}



class Customer_Remove
{
    public void removeFile(String ID)
    {

    File file = new File("file"+ID+".txt");
      if(file.exists())
       {
         if(file.delete());
         {
           System.out.println("\nCustomer has been removed Successfully");
         }
       }
      else
       {
            System.out.println("\nCustomer does not exists :( ");
       }
     }
}



class Customer_Update
{
  public void updateFile(String s,String o,String n) throws IOException
  {
   File file = new File("file"+s+".txt");
   Scanner sc = new Scanner(file);
   String fileContext="";
   while (sc.hasNextLine())
       {
         fileContext =fileContext+"\n"+sc.nextLine();
       }
   FileWriter myWriter = new FileWriter("file"+s+".txt");
   fileContext = fileContext.replaceAll(o,n);
   myWriter.write(fileContext);
   myWriter.close();

  }
}




class CodeExit
{
  public void out()
  {
    System.out.println("\n*****************************************");
    System.out.println("$ cat Thank You For Using my Software :) ");
    System.out.println("*****************************************");
    
    System.exit(0);
  }
}



class EmployManagementSystem
{
  public static void main(String arv[])
  {
    /** To clear the output Screen **/
    System.out.print("\033[H\033[2J");

    Scanner sc=new Scanner(System.in);
    Customer_Show epv =new Customer_Show();

    int i=0;

    /*** Callining Mainmenu Class function ****/
    MainMenu obj1 = new MainMenu();
    obj1.menu();

    /*** Initialising loop for Menu Choices ***/
    while(i<6)
    {

      System.out.print("\nPlease Enter choice :");
      i=Integer.parseInt(sc.nextLine());

      /** Switch Case Statements **/
      switch(i)
      {
        case 1:
        {
        /** Creating class's object and calling Function using that object **/
        Customer_Add ep =new Customer_Add();
        ep.createFile();

        System.out.print("\033[H\033[2J");
        obj1.menu();
        break;
        }
        case 2:
        {
          System.out.print("\nPlease Enter customer's ID :");
          String s=sc.nextLine();
          try
          {
            epv.viewFile(s);}
            catch(Exception e){System.out.println(e);}


            System.out.print("\nPress Enter to Continue...");
            sc.nextLine();
            System.out.print("\033[H\033[2J");
            obj1.menu();
            break;
          }

        case 3:
        {
          System.out.print("\nPlease Enter Customer's ID :");
          String s=sc.nextLine();
          Customer_Remove epr =new Customer_Remove();
          epr.removeFile(s);

          System.out.print("\nPress Enter to Continue...");
          sc.nextLine();
          System.out.print("\033[H\033[2J");
          obj1.menu();
          break;
        }
        case 4:
        {
            System.out.print("\nPlease Enter Customer's ID :");
            String I=sc.nextLine();
            try
            {
              epv.viewFile(I);
            }
            catch(Exception e)
            {
              System.out.println(e);
            }
            Customer_Update epu = new Customer_Update();
            System.out.print("Please Enter the detail you want to Update :");
    	      System.out.print("\nFor Example :\n");
            System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
            String s=sc.nextLine();
            System.out.print("Please Enter the Updated Info :");
            String n=sc.nextLine();
            try
            {
              epu.updateFile(I,s,n);

              System.out.print("\nPress Enter to Continue...");
              sc.nextLine();
              System.out.print("\033[H\033[2J");
              obj1.menu();
              break;
            }
            catch(IOException e)
            {
              System.out.println(e);
            }
        }
        case 5:
        {
          CodeExit obj = new CodeExit();
          obj.out();
        }
      }
    }
  }
}


