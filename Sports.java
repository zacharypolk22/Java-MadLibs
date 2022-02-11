package madlibs;
//Zachary Polk
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Sports {

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
	public void sports() {
		try {
			Sports window = new Sports(); //creates window in class Sports
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
		output out = new output(); //creating a variable for the output class
		
		String[] speech = { "Noun", "Verb", "Adjective", "Sport", "Weather" }; //Creating an array for the parts of speech
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		shell.setSize(750, 500);
		shell.setText("Sports");
		
		Label lblLabel1 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel1.setAlignment(SWT.CENTER);
		lblLabel1.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		lblLabel1.setBounds(58, 35, 605, 38);
		lblLabel1.setText("Here are the Sports Madlibs!");
		
		Label lblLabel2 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel2.setAlignment(SWT.CENTER);
		lblLabel2.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel2.setBounds(140, 79, 439, 20);
		lblLabel2.setText("Fill in each blank with the correct part of speech");
		
		
		Label lblLabel3 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel3.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel3.setBounds(58, 143, 94, 20);
		lblLabel3.setText("1. Soccer is a");
		
		txtA = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtA.setTouchEnabled(true); //sets touch enabled
		txtA.setMessage(speech[2]); //creates message from array speech that disappears once clicked on text box
		txtA.setBounds(152, 140, 78, 26);
		
		
		Label lblLabel4 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel4.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel4.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel4.setBounds(236, 143, 120, 20);
		lblLabel4.setText("sport. I prefer to ");
		
		txtB = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtB.setTouchEnabled(true); //sets touch enabled
		txtB.setMessage(speech[1]); //creates message from array speech that disappears once clicked on text box
		txtB.setBounds(356, 140, 78, 26);
		
		Label lblLabel5 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel5.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel5.setText("soccer rather than ");
		lblLabel5.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel5.setBounds(440, 143, 132, 20);
		
		txtC = new Text(shell, SWT.BORDER); //Creates new text box for user input 
		txtC.setTouchEnabled(true); //sets touch enabled
		txtC.setMessage(speech[1]); //creates message from array speech that disappears once clicked on text box
		txtC.setBounds(572, 140, 78, 26);
		
		Label lblLabel6 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel6.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel6.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel6.setBounds(68, 169, 70, 20);
		lblLabel6.setText("soccer. ");
		
		Label lblLabel7 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel7.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel7.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel7.setBounds(58, 209, 114, 20);
		lblLabel7.setText("2. I love to play");
		
		txtD = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtD.setTouchEnabled(true); //sets touch enabled
		txtD.setMessage(speech[3]); //creates message from array speech that disappears once clicked on text box
		txtD.setBounds(174, 206, 78, 26);
		
		Label lblLabel8 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel8.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel8.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel8.setBounds(258, 209, 160, 20);
		lblLabel8.setText(". Nothing can beat the ");
		
		txtE = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtE.setTouchEnabled(true); //sets touch enabled
		txtE.setMessage(speech[2]); //creates message from array speech that disappears once clicked on text box
		txtE.setBounds(418, 206, 78, 26);
		
		Label lblLabel9 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel9.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel9.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel9.setBounds(502, 209, 110, 20);
		lblLabel9.setText("fans when they ");
		
		txtF = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtF.setTouchEnabled(true); //sets touch enabled
		txtF.setMessage(speech[1]); //creates message from array speech that disappears once clicked on text box
		txtF.setBounds(613, 206, 78, 26);
		
		Label lblLabel10 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel10.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel10.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel10.setBounds(80, 235, 194, 20);
		lblLabel10.setText("your name.");
		
		Label lblLabel11 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel11.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel11.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel11.setBounds(58, 280, 114, 20);
		lblLabel11.setText("3. Football is a ");
		
		txtG = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtG.setTouchEnabled(true); //sets touch enabled
		txtG.setMessage(speech[2]); //creates message from array speech that disappears once clicked on text box
		txtG.setBounds(174, 277, 78, 26);
		
		Label lblLabel12 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel12.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel12.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel12.setBounds(258, 280, 190, 20);
		lblLabel12.setText("sport. The best weather to ");
		
		txtH = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtH.setTouchEnabled(true); //sets touch enabled
		txtH.setMessage(speech[1]); //creates message from array speech that disappears once clicked on text box
		txtH.setBounds(447, 277, 78, 26);
		
		Label lblLabel13 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel13.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel13.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED)); //Sets background color
		lblLabel13.setBounds(531, 280, 85, 20);
		lblLabel13.setText("football is ");
		
		txtI = new Text(shell, SWT.BORDER); //Creates new text box for user input
		txtI.setTouchEnabled(true); //sets touch enabled
		txtI.setMessage(speech[4]); //creates message from array speech that disappears once clicked on text box
		txtI.setBounds(78, 311, 78, 26);
		
		Button btnClickToSubmit = new Button(shell, SWT.NONE); //Creates new button
		btnClickToSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(e.getSource()==btnClickToSubmit) {
					out.outputs();
				}
				//states if button is clicked open outputs from output class
			}
		});
		btnClickToSubmit.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA)); //text color
		btnClickToSubmit.setBounds(549, 386, 114, 30);
		btnClickToSubmit.setText("Click to Submit"); //sets text to Click to Submit
		
	}

}
