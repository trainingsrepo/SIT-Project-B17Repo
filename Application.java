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

	public Account(String UN, String PassW) {
		Username = UN;
		Password = PassW;
	}