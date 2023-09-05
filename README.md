# Customer_management_system

Importing Essential Libraries
Main Class - MainMenu: This class defines the main menu for the customer management system. It has a menu() method that prints various options for the user.
Customer_Add Class: This class handles the addition of customer details. It prompts the user to enter customer information, creates a text file with the customer's ID as the filename, and writes the details to the file.
CustomerDetail Class: This class defines a data structure for storing customer details like name, father's name, email, etc. It has a method getInfo() to input these details from the user.
Customer_Show Class: This class is responsible for viewing customer details. It reads and displays the content of a customer's file based on the customer's ID.

Customer_Remove Class: This class handles the removal of customer files based on the customer's ID.
Customer_Update Class: This class is used to update customer details. It reads the existing details from a file, replaces a specified part of the content with new information, and writes it back to the file.
CodeExit Class: This class provides a method to exit the program when called.
CustomerManagementSystem Class (Main): This is the main class where the program execution begins. It displays the main menu and handles user input, invoking the relevant methods from the above classes based on the user's choice.
