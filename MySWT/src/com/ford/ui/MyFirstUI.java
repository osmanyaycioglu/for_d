package com.ford.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstUI {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private HikariDataSource dataSource;
	private Text arabaId;
	private Text arabaKM;

	
	public MyFirstUI() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl(
				"jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		config.setUsername("root");
		config.setMaximumPoolSize(5);
		dataSource = new HikariDataSource(config);

	}
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstUI window = new MyFirstUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(null);
		FormData fd_composite = new FormData();
		fd_composite.bottom = new FormAttachment(0, 261);
		fd_composite.right = new FormAttachment(0, 434);
		fd_composite.top = new FormAttachment(0);
		fd_composite.left = new FormAttachment(0);
		composite.setLayoutData(fd_composite);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 55, 15);
		lblNewLabel.setText("Araba Ismi");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(85, 10, 101, 21);
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setBounds(10, 46, 55, 15);
		lblNewLabel_1.setText("Marka");
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(85, 46, 101, 21);
		
		Button btnBas = new Button(composite, SWT.NONE);
		btnBas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				System.out.println("Hello World Isim : " + text.getText() 
									+ " soy isim : " + text_1.getText());

				try {
					Connection connection = dataSource.getConnection();
					String insertSQL = "INSERT INTO araba (araba_id, araba_ismi, araba_nodel, araba_km) VALUES (?, ?, ?, ?)";
					PreparedStatement insert = connection.prepareStatement(insertSQL);
					insert.setLong(1, Long.parseLong(arabaId.getText()));
					insert.setString(2, text.getText());
					insert.setString(3, text_1.getText());
					insert.setInt(4, Integer.parseInt(arabaKM.getText()));
					
					insert.executeUpdate();
					
				} catch (Exception exp) {
					exp.printStackTrace();
				}
			
			
			}
		});
		btnBas.setBounds(10, 160, 75, 25);
		btnBas.setText("Bas");
		
		Label lblArabaid = new Label(composite, SWT.NONE);
		lblArabaid.setBounds(10, 83, 55, 15);
		lblArabaid.setText("ArabaId");
		
		arabaId = new Text(composite, SWT.BORDER);
		arabaId.setBounds(85, 83, 101, 21);
		
		Label lblArabaKm = new Label(composite, SWT.NONE);
		lblArabaKm.setBounds(10, 122, 55, 15);
		lblArabaKm.setText("Araba KM");
		
		arabaKM = new Text(composite, SWT.BORDER);
		arabaKM.setBounds(85, 116, 101, 21);

	}
}
