public class MainActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
			getMenuInflater().inflate(R.menu.options, menu);
			return true;
	}

	public boolean onOptionsItemSelected(MenuItem item) {
			switch (item.getItemId()) {
					case R.id.mail:
							Toast.makeText(getApplicationContext(), "Mail selected", Toast.LENGTH_LONG).show();
							return true;
					case R.id.upload:
							Toast.makeText(getApplicationContext(), "Upload selected", Toast.LENGTH_LONG).show();
							return true;
					case R.id.share:
							Toast.makeText(getApplicationContext(), "Share selected", Toast.LENGTH_LONG).show();
							return true;
					default:
							return super.onOptionsItemSelected(item);
			}

	}
}