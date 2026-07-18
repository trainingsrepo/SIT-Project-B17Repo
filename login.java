public class Login {

	private JFrame frmLoginSystem;
	private JTextField txtUN;
	private JPasswordField txtPW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLoginSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	#Webhook Job Demo
	#Following new changes done by Developer Shiva
	 private static AdminPortType getStatelessWebServiceClient(
    String webServiceURL) throws Exception
  {
    AdminService adminService = new AdminService(
      new URL( webServiceURL ),
      new QName(
        "http://search.oracle.com/Admin",
        "AdminService"
      )
    );
 
    return adminService.getAdmin();
  }
}
#18-JUL-2026 by developer Shiva
