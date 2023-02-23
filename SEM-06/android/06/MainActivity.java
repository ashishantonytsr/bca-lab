public class MainActivity extends AppCompatActivity {
	CheckBox pizza, burger, coffee;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pizza = (CheckBox) findViewById(R.id.checkbox1);
		burger = (CheckBox) findViewById(R.id.checkbox2);
		coffee = (CheckBox) findViewById(R.id.checkbox3);

		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				StringBuilder result = new StringBuilder();
				result.append("Selected Items are ");
				if (pizza.isChecked())
					result.append("\n Pizza");
				if (burger.isChecked())
					result.append("\n Burger");
				if (coffee.isChecked())
					result.append("\n Coffee");

				Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
			}
		});
	}
}