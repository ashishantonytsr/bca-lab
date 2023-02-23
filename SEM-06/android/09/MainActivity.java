public class MainActivity extends AppCompatActivity {
	TextView ipView;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ipView = (TextView) findViewById(R.id.ipView);
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				WifiManager wm = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
				String ipAddress = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
				ipView.setText("Your IP Address is "+ ipAddress);
			}
		});
	}
}


// In /manifests/AndroidManifest.xml
/* 
	<uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>  
*/