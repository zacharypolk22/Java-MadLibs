package madlibs;
//Zachary Polk
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class music {

	public static Shell shell; //Makes the shell public and static so I can call it in other classes
	public static Text txtA; //Makes text public and static so I can call it in another class
	public static Text txtB; //Makes text public and static so I can call it in another class
	public static Text txtC; //Makes text public and static so I can call it in another class
	public static Text txtD; //Makes text public and static so I can call it in another class
	public static Text txtG; //Makes text public and static so I can call it in another class
	public static Text txtI; //Makes text public and static so I can call it in another class
	public static Text txtF; //Makes text public and static so I can call it in another class
	public static Text txtE; //Makes text public and static so I can call it in another class
	public static Text txtH; //Makes text public and static so I can call it in another class

	/**
	 * Launch the application.
	 * @param args
	 */
	public void genre() {
		try {
			music window = new music(); //creates window in class music
			window.open(); //Opens Window
		} catch (Exception e) {
			e.printStackTrace(); //Prints error if doesn't open
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents(); //Calls create Contents to open
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
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		output1 out = new output1();
		String[] parts = { "Noun", "Verb", "Adjective", "Place", "Genre", "Artist", "Song" }; //Creating an array for the parts of speech
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		shell.setSize(750, 500);
		shell.setText("Music");
		
		Label lblLabel1 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel1.setAlignment(SWT.CENTER);
		lblLabel1.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		lblLabel1.setBounds(58, 35, 605, 38);
		lblLabel1.setText("Here are the Music Madlibs!");
		
		Label lblLabel2 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel2.setAlignment(SWT.CENTER);
		lblLabel2.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel2.setBounds(140, 79, 439, 20);
		lblLabel2.setText("Fill in each blank with the correct part of speech");

		Label lblLabel3 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel3.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel3.setBounds(58, 143, 134, 20);
		lblLabel3.setText("1. Country Music is");
		
		txtA = new Text(shell, SWT.BORDER);
		txtA.setTouchEnabled(true);
		txtA.setMessage(parts[2]); //creates message from array parts that disappears once clicked on text box
		txtA.setBounds(194, 140, 78, 26);
		
		
		Label lblLabel4 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel4.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel4.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel4.setBounds(276, 143, 176, 20);
		lblLabel4.setText(". The concerts are always");
		
		txtB = new Text(shell, SWT.BORDER);
		txtB.setTouchEnabled(true);
		txtB.setMessage(parts[2]); //creates message from array parts that disappears once clicked on text box
		txtB.setBounds(452, 140, 78, 26);
		
		Label lblLabel5 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel5.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel5.setText("in");
		lblLabel5.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel5.setBounds(536, 143, 20, 20);
		
		txtC = new Text(shell, SWT.BORDER);
		txtC.setTouchEnabled(true);
		txtC.setMessage(parts[3]); //creates message from array parts that disappears once clicked on text box
		txtC.setBounds(556, 140, 78, 26);
		
		Label lblLabel6 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel6.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel6.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD)); 
		lblLabel6.setBounds(58, 209, 164, 20);
		lblLabel6.setText("2. My favorite genre is");
		
		txtD = new Text(shell, SWT.BORDER);
		txtD.setTouchEnabled(true);
		txtD.setMessage(parts[4]); //creates message from array parts that disappears once clicked on text box
		txtD.setBounds(223, 206, 78, 26);
		
		Label lblLabel7 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel7.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel7.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel7.setBounds(307, 209, 160, 20);
		lblLabel7.setText(". I mainly listen to it at");
		
		txtE = new Text(shell, SWT.BORDER);
		txtE.setTouchEnabled(true);
		txtE.setMessage(parts[3]); //creates message from array parts that disappears once clicked on text box
		txtE.setBounds(473, 206, 78, 26);
		
		Label lblLabel8 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel8.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel8.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel8.setBounds(553, 209, 110, 20);
		lblLabel8.setText("while doing");
		
		txtF = new Text(shell, SWT.BORDER);
		txtF.setTouchEnabled(true);
		txtF.setMessage(parts[1]); //creates message from array parts that disappears once clicked on text box
		txtF.setBounds(78, 235, 78, 26);
	
		Label lblLabel9 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel9.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel9.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel9.setBounds(58, 280, 164, 20);
		lblLabel9.setText("3. My favorite artist is");
		
		txtG = new Text(shell, SWT.BORDER);
		txtG.setTouchEnabled(true);
		txtG.setMessage(parts[5]); //creates message from array parts that disappears once clicked on text box
		txtG.setBounds(223, 277, 78, 26);
		
		Label lblLabel10 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel10.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel10.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel10.setBounds(307, 280, 89, 20);
		lblLabel10.setText(". They make ");
		
		txtH = new Text(shell, SWT.BORDER);
		txtH.setTouchEnabled(true);
		txtH.setMessage(parts[4]); //creates message from array parts that disappears once clicked on text box
		txtH.setBounds(396, 277, 78, 26);
		
		Label lblLabel11 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel11.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel11.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel11.setBounds(480, 280, 190, 20);
		lblLabel11.setText("music. My favorite song by");
		
		txtI = new Text(shell, SWT.BORDER);
		txtI.setTouchEnabled(true);
		txtI.setMessage(parts[6]); //creates message from array parts that disappears once clicked on text box
		txtI.setBounds(144, 311, 78, 26);
		
		Label lblLabel12 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel12.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN)); //Sets background color
		lblLabel12.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel12.setBounds(78, 314, 60, 20);
		lblLabel12.setText("them is");
		
		Button btnClickToSubmit = new Button(shell, SWT.NONE); //Creates new button
		btnClickToSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(e.getSource()==btnClickToSubmit) {
					
					out.outputs1();
				}//states if button is clicked open outputs1 from output1 class
			}
		});
		btnClickToSubmit.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		btnClickToSubmit.setBounds(549, 386, 114, 30);
		btnClickToSubmit.setText("Click to Submit"); //sets text to Click to Submit
	}

}
