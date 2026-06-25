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
	#first changes at 11am by Developer1
	 public static void main(String[] args) 
       {
            try {
              UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            }catch(Exception e) {
                  e.printStackTrace();
            }
            Login l = new Login("NDS Login Using Query Bean");
            l.addWindowListener( new WindowAdapter() {
                                       public void windowClosing(WindowEvent e) {
                                          System.exit(0);
                                       }
                                     }
                                );
      
       }
	   #end of 11am changes
