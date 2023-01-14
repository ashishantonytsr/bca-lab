public class MainActivity extends AppCompatActivity {
	Button btn;
	RadioGroup rg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);

			rg = (RadioGroup) findViewById(R.id.rg);
			btn = (Button) findViewById(R.id.btn);
			btn.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
							int selected = rg.getCheckedRadioButtonId();
							RadioButton rb = (RadioButton) findViewById(selected);
							Toast.makeText(MainActivity.this, "You have selected "+rb.getText(), Toast.LENGTH_SHORT).show();
					}
			});
	}
}