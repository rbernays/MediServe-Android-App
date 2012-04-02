package your.project.mediserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class ChangePass extends Activity {
	private EditText etUsername;
	private EditText etOldPassword;
	private EditText etNewPassword;
	private EditText etConfirmPassword;
	private Button btnOK;
	private Button btnCancel;
	private Button btnChangePass;
	private TextView lblResult;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.changepass);
        etUsername = (EditText)findViewById(R.id.username);
        etOldPassword = (EditText)findViewById(R.id.oldpassword);
        etNewPassword = (EditText)findViewById(R.id.newpassword);
        etConfirmPassword = (EditText)findViewById(R.id.confirmpassword);
        btnOK = (Button)findViewById(R.id.ok_button);
        btnCancel = (Button)findViewById(R.id.cancel_button);
        btnChangePass = (Button)findViewById(R.id.changePass_button);
        lblResult = (TextView)findViewById(R.id.result);
        btnOK.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		//Check Login
        		String username = etUsername.getText().toString();
        		String oldpassword = etOldPassword.getText().toString();
        		String newpassword = etNewPassword.getText().toString();
        		String confirmpassword = etConfirmPassword.getText().toString();
        		
        		if(username.equals("guest") && oldpassword.equals("guest") && (newpassword == confirmpassword)){
        			lblResult.setText("Password changed successfully.");
        			
        		} else {
        			lblResult.setText("Change password failed. Username and/or password doesn't match.");
        		}
        	}
        });
        btnCancel.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        		//Close the application
        		finish();
        	}
        });
        btnChangePass.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
        	}
        });
    }
}