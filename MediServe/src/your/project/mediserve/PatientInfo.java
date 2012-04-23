package your.project.mediserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class PatientInfo extends Activity{
	private String patientname;
	private EditText patient;

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patientinformation);
        patientname = getIntent().getStringExtra("PATIENT_NAME");
        patient = (EditText)findViewById(R.id.patientname);
        
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabSpec spec1=tabHost.newTabSpec("Tab 1");
        spec1.setContent(R.id.planofcare);
        spec1.setIndicator("Tab 1");

        TabSpec spec2=tabHost.newTabSpec("Tab 2");
        spec2.setIndicator("Tab 2");
        spec2.setContent(R.id.education);

        TabSpec spec3=tabHost.newTabSpec("Tab 3");
        spec3.setIndicator("Tab 3");
        spec3.setContent(R.id.information);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);

	}
}
