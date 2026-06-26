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
	#Feature102 Code changes by Shiva in his module Reports
	public Transaction(String ToAcc, String FromAcc, String Cust_ID, String Amt, String Trans_type) { //Constructor One with four parameters
		ToAccount = ToAcc;
		FromAccount = FromAcc;
		CustomerID = Cust_ID;
		TransactionType = Trans_type;
		Amount = Float.parseFloat(Amt);
	}
	#end of feature102

	public Account(String UN, String PassW) {
		Username = UN;
		Password = PassW;
	}