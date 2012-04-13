package your.project.mediserve;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;
import android.view.View.OnClickListener;

public class FindPatients extends Activity {

	protected String[] patients = {"Christophe Coenraets", "John Smith"};

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.findmypatients);
        TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabSpec spec1=tabHost.newTabSpec("Find Patient");
        spec1.setContent(R.id.find_patients);
        spec1.setIndicator("Find Patient");

        TabSpec spec2=tabHost.newTabSpec("My Patient");
        spec2.setIndicator("My Patient");
        spec2.setContent(R.id.my_patients);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, patients);
        ListView patientList = (ListView) findViewById(R.id.list);
        patientList.setAdapter(adapter);

	}
}