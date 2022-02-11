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

public class food {

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
	public void foods() {
		try {
			food window = new food(); //creates window in class food
			window.open(); //opens window
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
		output2 out = new output2();
		String[] part = { "Noun", "Verb", "Adjective", "Food", "Person", "Place" }; //Creating an array for the parts of speech
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		shell.setSize(750, 500);
		shell.setText("Food");
		
		Label lblLabel1 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel1.setAlignment(SWT.CENTER);
		lblLabel1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel1.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		lblLabel1.setBounds(58, 35, 605, 38);
		lblLabel1.setText("Here are the Food Madlibs!");
		
		Label lblLabel2 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel2.setAlignment(SWT.CENTER);
		lblLabel2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel2.setBounds(140, 79, 439, 20);
		lblLabel2.setText("Fill in each blank with the correct part of speech");
		
		Label lblLabel3 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel3.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel3.setBounds(58, 143, 43, 20);
		lblLabel3.setText("1. The");
		
		txtA = new Text(shell, SWT.BORDER);
		txtA.setTouchEnabled(true);
		txtA.setMessage(part[2]); //creates message from array part that disappears once clicked on text box
		txtA.setBounds(107, 140, 78, 26);
		
		Label lblLable4 = new Label(shell, SWT.NONE); //Creates new label
		lblLable4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLable4.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLable4.setBounds(187, 143, 231, 20);
		lblLable4.setText("smell on Thanksgiving makes me");
		
		txtB = new Text(shell, SWT.BORDER);
		txtB.setTouchEnabled(true);
		txtB.setMessage(part[1]); //creates message from array part that disappears once clicked on text box
		txtB.setBounds(424, 140, 78, 26);
		
		Label lblLabel5 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel5.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel5.setText(". I always go straight for the");
		lblLabel5.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel5.setBounds(502, 143, 204, 20);
		
		txtC = new Text(shell, SWT.BORDER);
		txtC.setTouchEnabled(true);
		txtC.setMessage(part[3]); //creates message from array part that disappears once clicked on text box
		txtC.setBounds(78, 166, 78, 26);
		
		Label lblLabel6 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel6.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel6.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel6.setBounds(159, 172, 70, 20);
		lblLabel6.setText("first.");
		
		Label lblLabel7 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel7.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel7.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel7.setBounds(58, 209, 155, 20);
		lblLabel7.setText("2. My favorite food is");
		
		txtD = new Text(shell, SWT.BORDER);
		txtD.setTouchEnabled(true);
		txtD.setMessage(part[3]); //creates message from array part that disappears once clicked on text box
		txtD.setBounds(214, 206, 78, 26);
		
		Label lblLabel8 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel8.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel8.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel8.setBounds(298, 209, 133, 20);
		lblLabel8.setText(". I love eating it at");
		
		txtE = new Text(shell, SWT.BORDER);
		txtE.setTouchEnabled(true);
		txtE.setMessage(part[5]); //creates message from array part that disappears once clicked on text box
		txtE.setBounds(435, 206, 78, 26);
		
		Label lblLabel9 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel9.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel9.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel9.setBounds(519, 209, 34, 20);
		lblLabel9.setText("with ");
		
		txtF = new Text(shell, SWT.BORDER);
		txtF.setTouchEnabled(true);
		txtF.setMessage(part[4]); //creates message from array part that disappears once clicked on text box
		txtF.setBounds(559, 206, 78, 26);
		
		Label lblLabel10 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel10.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel10.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel10.setBounds(58, 280, 71, 20);
		lblLabel10.setText("3. Pizza is");
		
		txtG = new Text(shell, SWT.BORDER);
		txtG.setTouchEnabled(true);
		txtG.setMessage(part[2]); //creates message from array part that disappears once clicked on text box
		txtG.setBounds(135, 277, 78, 26);
		
		Label lblLabel11 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel11.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel11.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel11.setBounds(214, 280, 170, 20);
		lblLabel11.setText(". My go to toppings are");
		
		txtH = new Text(shell, SWT.BORDER);
		txtH.setTouchEnabled(true);
		txtH.setMessage(part[3]); //creates message from array part that disappears once clicked on text box
		txtH.setBounds(383, 277, 78, 26);
		
		Label lblLabel12 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel12.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblLabel12.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION)); //Sets background color
		lblLabel12.setBounds(467, 280, 34, 20);
		lblLabel12.setText("and");
		
		txtI = new Text(shell, SWT.BORDER);
		txtI.setTouchEnabled(true);
		txtI.setMessage(part[3]); //creates message from array part that disappears once clicked on text box
		txtI.setBounds(501, 277, 78, 26);
		
		Button btnClickToSubmit = new Button(shell, SWT.NONE); //creates new button
		btnClickToSubmit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(e.getSource()==btnClickToSubmit) {
					
					out.outputs2();
				}//states if button is clicked open outputs2 from output2 class
			}
		});
		btnClickToSubmit.setForeground(SWTResourceManager.getColor(SWT.COLOR_MAGENTA));
		btnClickToSubmit.setBounds(549, 386, 114, 30);
		btnClickToSubmit.setText("Click to Submit"); //sets text to Click to Submit

	}

}
