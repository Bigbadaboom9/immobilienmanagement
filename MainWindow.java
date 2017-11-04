/**
  * MainWindow.java
  * main application for the graphical user interface
  * oszimt
  * @version 1.8 vom 04.11.2017
  * @ssloboda
  */

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Point;
import org.eclipse.wb.swt.SWTResourceManager;
//import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
//import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
/*
 * import org.eclipse.swt.layout.FillLayout;
 * import swing2swt.layout.BoxLayout;
 * import swing2swt.layout.FlowLayout;
 * import org.eclipse.swt.layout.RowLayout;
 * import org.eclipse.swt.layout.FormLayout;
 * import org.eclipse.swt.layout.FormData;
 * import org.eclipse.swt.layout.FormAttachment;
 * import org.eclipse.swt.events.SelectionAdapter;
 * import org.eclipse.swt.events.SelectionEvent;
*/

import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
//import java.awt.Dimension;

// load mysql connector
/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.sql.Date;
*/
// end of loading mysql connector

public class MainWindow {

	protected Shell shlApplicationtitle;
	private Text txtName;
	private Text txtVorname;
	private Text txtID;
	private Text txtAnschrift;
	private Text txtPlz;
	private Text txtStadt;
	private Text txtLand;
	private Text txtOutput;


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
			//window.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//start here for additional main commands
		/**
		 * test database connection
		 */
		
	
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		while (!shlApplicationtitle.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlApplicationtitle = new Shell();
		shlApplicationtitle.setText("Immobilienmanagement");
		shlApplicationtitle.setMinimumSize(new Point(560, 441));
		shlApplicationtitle.setSize(626, 445);
		shlApplicationtitle.setLayout(null);
		
		Label lblBesitzer = new Label(shlApplicationtitle, SWT.NONE);
		lblBesitzer.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblBesitzer.setAlignment(SWT.CENTER);
		lblBesitzer.setBounds(99, 23, 55, 15);
		lblBesitzer.setText("Besitzer");
		
		Label lblNewLabel_1 = new Label(shlApplicationtitle, SWT.NONE);
		lblNewLabel_1.setAlignment(SWT.CENTER);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNewLabel_1.setBounds(420, 23, 55, 15);
		lblNewLabel_1.setText("Haus");
		
		Label lblName = new Label(shlApplicationtitle, SWT.NONE);
		lblName.setAlignment(SWT.CENTER);
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblName.setBounds(21, 60, 55, 15);
		lblName.setText("Name");
		
		Label lblVorname = new Label(shlApplicationtitle, SWT.NONE);
		lblVorname.setAlignment(SWT.CENTER);
		lblVorname.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblVorname.setBounds(21, 87, 55, 15);
		lblVorname.setText("Vorname");
		
		Label lblID = new Label(shlApplicationtitle, SWT.NONE);
		lblID.setAlignment(SWT.CENTER);
		lblID.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblID.setBounds(21, 114, 55, 15);
		lblID.setText("ID");
		
		Label lblAnschrift = new Label(shlApplicationtitle, SWT.NONE);
		lblAnschrift.setAlignment(SWT.CENTER);
		lblAnschrift.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblAnschrift.setBounds(273, 60, 55, 15);
		lblAnschrift.setText("Anschrift");
		
		Label lblPlz = new Label(shlApplicationtitle, SWT.NONE);
		lblPlz.setAlignment(SWT.CENTER);
		lblPlz.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblPlz.setBounds(253, 114, 75, 15);
		lblPlz.setText("Postleitzahl");
		
		Label lblStadt = new Label(shlApplicationtitle, SWT.NONE);
		lblStadt.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblStadt.setAlignment(SWT.CENTER);
		lblStadt.setBounds(273, 87, 55, 15);
		lblStadt.setText("Stadt");
		
		Label lblLand = new Label(shlApplicationtitle, SWT.NONE);
		lblLand.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLand.setAlignment(SWT.CENTER);
		lblLand.setBounds(273, 138, 55, 15);
		lblLand.setText("Land");
		
		txtName = new Text(shlApplicationtitle, SWT.BORDER);
		txtName.setBounds(78, 57, 141, 21);
		
		txtVorname = new Text(shlApplicationtitle, SWT.BORDER);
		txtVorname.setBounds(78, 84, 141, 21);
		
		txtID = new Text(shlApplicationtitle, SWT.BORDER);
		txtID.setBounds(79, 111, 52, 21);
		
		txtAnschrift = new Text(shlApplicationtitle, SWT.BORDER);
		txtAnschrift.setBounds(334, 57, 249, 21);
		
		txtPlz = new Text(shlApplicationtitle, SWT.BORDER);
		txtPlz.setBounds(334, 111, 76, 21);
		
		txtStadt = new Text(shlApplicationtitle, SWT.BORDER);
		txtStadt.setBounds(334, 84, 183, 21);
		
		txtLand = new Text(shlApplicationtitle, SWT.BORDER | SWT.READ_ONLY | SWT.CENTER);
		txtLand.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		txtLand.setText("Deutschland");
		txtLand.setToolTipText("Dieses Feld kann nicht editiert werden.");
		txtLand.setBounds(334, 135, 141, 21);
		
		txtOutput = new Text(shlApplicationtitle, SWT.BORDER);
		txtOutput.setEditable(false);
		txtOutput.setBounds(21, 177, 562, 173);
		txtOutput.setToolTipText("Dieses Feld kann nicht editiert werden.");
		
		Menu menu = new Menu(shlApplicationtitle, SWT.BAR);
		shlApplicationtitle.setMenuBar(menu);
		
		MenuItem mntmDatei = new MenuItem(menu, SWT.NONE);
		mntmDatei.setText("Datei");
		
		MenuItem mntmBearbeiten = new MenuItem(menu, SWT.CASCADE);
		mntmBearbeiten.setText("Bearbeiten");
		
		Menu menu_1 = new Menu(mntmBearbeiten);
		mntmBearbeiten.setMenu(menu_1);
		
		MenuItem mntmItem_2 = new MenuItem(menu_1, SWT.NONE);
		mntmItem_2.setText("Item");
		
		MenuItem mntmEinstellungen = new MenuItem(menu, SWT.CASCADE);
		mntmEinstellungen.setText("Einstellungen");
		
		Menu menu_2 = new Menu(mntmEinstellungen);
		mntmEinstellungen.setMenu(menu_2);
		
		MenuItem mntmcheckdbcon = new MenuItem(menu_2, SWT.NONE);
		mntmcheckdbcon.setText("Check DB connection");
		
		MenuItem mntmItem = new MenuItem(menu_2, SWT.NONE);
		mntmItem.setText("Item");
		
		MenuItem mntmHilfe = new MenuItem(menu, SWT.NONE);
		mntmHilfe.setText("Hilfe");
		
		Button btnSuchen = new Button(shlApplicationtitle, SWT.NONE);
		btnSuchen.setBounds(508, 133, 75, 25);
		btnSuchen.setText("Suchen");

	}
}
