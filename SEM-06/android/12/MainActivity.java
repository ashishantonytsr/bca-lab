public class MainActivity extends AppCompatActivity {
	Button btn;
	AlertDialog.Builder builder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		builder = new AlertDialog.Builder(this);
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				builder.setMessage("Do you want to close the application? ")
					.setCancelable(false)
					.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialogInterface, int i) {
							finish();
							Toast.makeText(getApplicationContext(), "You choosed 'Yes' action", Toast.LENGTH_SHORT).show();
						}
					})
					.setNegativeButton("No", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialogInterface, int i) {
							dialogInterface.cancel();
							Toast.makeText(getApplicationContext(), "You choosed 'No' action", Toast.LENGTH_SHORT).show();
						}
					});
				AlertDialog alert = builder.create();
				alert.setTitle("Close app");
				alert.show();
			}
		});
	}
}