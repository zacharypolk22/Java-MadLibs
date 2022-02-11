package madlibs;
//Zachary Polk
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class output2 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public void outputs2() {
		try {
			output2 window = new output2(); //creates window in class output2
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
		
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		shell.setSize(750, 500);
		shell.setText("Madlibs");
		
		Label lblLabel1 = new Label(shell, SWT.NONE);//Creates new label
		lblLabel1.setAlignment(SWT.CENTER);
		lblLabel1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		lblLabel1.setFont(SWTResourceManager.getFont("Segoe UI", 22, SWT.BOLD));
		lblLabel1.setBounds(22, 27, 676, 51);
		lblLabel1.setText("Congrats on Completing your Madlibs!");
		
		Label lblLabel2 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel2.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		lblLabel2.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblLabel2.setBounds(33, 91, 278, 23);
		lblLabel2.setText("Here are the Madlibs you created:");
		
		Label lblLabel3 = new Label(shell, SWT.WRAP); //Creates new label with wrapping ability
		lblLabel3.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		lblLabel3.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblLabel3.setBounds(33, 133, 665, 74);
		lblLabel3.setText("1. The " + food.txtA.getText() + " smell on Thanksgiving makes me " + food.txtB.getText() + 
				". I always go straight for the " + food.txtC.getText() + " first.");
		//Makes the label print what is said and also gets the text from the Sports class
		
		Label lblLabel4 = new Label(shell, SWT.WRAP); //Creates new label with wrapping ability
		lblLabel4.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblLabel4.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		lblLabel4.setBounds(33, 215, 665, 74);
		lblLabel4.setText("2. My favorite food is " + food.txtD.getText() + ". I love eating it at " + 
				food.txtE.getText() + " with " + food.txtF.getText() + ".");
		//Makes the label print what is said and also gets the text from the Sports class
		
		Label lblLabel5 = new Label(shell, SWT.WRAP); //Creates new label with wrapping ability
		lblLabel5.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblLabel5.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		lblLabel5.setBounds(33, 305, 665, 74);
		lblLabel5.setText("3. Pizza is " + food.txtG.getText() + ". My go to toppings are "
				+ food.txtH.getText() + " and " + food.txtI.getText() + ".");
		//Makes the label print what is said and also gets the text from the Sports class
		
		Label lblLabel6 = new Label(shell, SWT.NONE); //Creates new label
		lblLabel6.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND)); //Sets background color
		lblLabel6.setFont(SWTResourceManager.getFont("Segoe UI", 15, SWT.BOLD));
		lblLabel6.setBounds(22, 403, 493, 40);
		lblLabel6.setText("Would you like to create another Madlib?");
	
		Button btnYes = new Button(shell, SWT.NONE);//creates new button
		btnYes.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(e.getSource()==btnYes) {
					food.shell.dispose();
					shell.dispose();
					madlib.main(null);
				}//states if button is pressed dispose food shell and current shell and open main from madlib class
			}
		});
		btnYes.setBounds(521, 410, 90, 30);
		btnYes.setText("Yes!");
		
		Button btnNo = new Button(shell, SWT.NONE);//creates new button
		btnNo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(e.getSource()==btnNo) {
					food.shell.dispose();
					shell.dispose();
				}//states if button is pressed dispose Sports shell and current shell
			}
		});
		btnNo.setBounds(617, 410, 90, 30);
		btnNo.setText("No");
		
		
		
	}

	

}
