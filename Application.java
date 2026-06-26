import java.lang.*; //including Java packages used by this program
import java.sql.*;
import com.mishra.*;

public class Account
{
	private String Username, Password, Password1, Name;

	public Account(String UN, String PassW, String PassW1, String NM) {
		Username = UN;
		Password = PassW;
		Password1 = PassW1;
		Name = NM;
	}
	#Feature101 code changes by Akshat on Accounts Module 
	public SavingAccount(String SA_Num, String Cust_Name, String Cust_ID, String Amt) { //Constructor One with three parameters
		SavingAccountNumber = SA_Num;
		CustomerName = Cust_Name;
		CustomerID = Cust_ID;
		Amount = Float.parseFloat(Amt);
	}
	#end of feature101

	public Account(String UN, String PassW) {
		Username = UN;
		Password = PassW;
	}