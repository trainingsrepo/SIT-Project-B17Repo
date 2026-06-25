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
#appending new code changes at 1pm
collateral
current account
debit card
