package com.example.calculating;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculating extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculating);
		findViews();
	}

	public void OnClick(View v) {

		switch (v.getId()) {
		case R.id.btn_0:
			displayview("0");
			break;
		case R.id.btn_1:
			displayview("1");
			break;
		case R.id.btn_2:
			displayview("2");
			break;
		case R.id.btn_3:
			displayview("3");
			break;
		case R.id.btn_4:
			displayview("4");
			break;
		case R.id.btn_5:
			displayview("5");
			break;
		case R.id.btn_6:
			displayview("6");
			break;
		case R.id.btn_7:
			displayview("7");
			break;
		case R.id.btn_8:
			displayview("8");
			break;
		case R.id.btn_9:
			displayview("9");
			break;
		case R.id.add:
			displayview("+");
			break;
		case R.id.subtract:

			displayview("-");
			break;
		case R.id.multiply:

			displayview("*");
			break;
		case R.id.divide:

			displayview("/");

			break;

		case R.id.equal:

			displayview("=");

			break;

		default:
			result.setText("");
			break;
		}

	}

	private void displayview(String s) {
		double total = 0;
		if (s.equals("+")) {
			a = result.getText().toString();
			result.setText(a + " " + s + " ");

		} else if (s.equals("-")) {
			a = result.getText().toString();
			result.setText(a + " " + s + " ");

		} else if (s.equals("*")) {
			a = result.getText().toString();
			result.setText(a + " " + s + " ");

		} else if (s.equals("/")) {
			a = result.getText().toString();
			result.setText(a + " " + s + " ");

		} else if (s.equals("=")) {
			b = result.getText().toString();
			
			Log.i("egg", "String a = " + a);	//logcat
			Log.i("egg", "String b = " + b);	//logcat
			
			String[] i = b.split(" ");

			if (i[1].equals("+")) {
				total = Integer.parseInt(i[0]) + Integer.parseInt(i[2]);
				result.setText("");
			} else if (i[1].equals("-")) {
				total = Integer.parseInt(i[0]) - Integer.parseInt(i[2]);
				result.setText("");
			}
			if (i[1].equals("*")) {
				total = Integer.parseInt(i[0]) * Integer.parseInt(i[2]);
				result.setText("");
			}
			if (i[1].equals("/")) {
				total = Integer.parseInt(i[0]) / Integer.parseInt(i[2]);
				result.setText("");
			}
			view.setText(b + " = " + String.valueOf(total));
			
			Toast toast = Toast.makeText(getApplicationContext(),"計算結果答案為："+String.valueOf(total) , Toast.LENGTH_LONG);
			toast.show();

		} else {
			str = result.getText().toString();
			result.setText(str + s);
		}

	}

	private EditText result;
	private TextView view;
	private Button btn_1, btn_2, btn_3, btn_add;
	private Button btn_4, btn_5, btn_6, btn_subtract;
	private Button btn_7, btn_8, btn_9, btn_multiply;
	private Button btn_0, btn_dat, btn_divide;
	private Button btn_equal;
	private String a, b,str;

	private void findViews() {
		view = (TextView) findViewById(R.id.view);
		result = (EditText) findViewById(R.id.edit_input);
		btn_1 = (Button) findViewById(R.id.btn_1);
		btn_2 = (Button) findViewById(R.id.btn_2);
		btn_3 = (Button) findViewById(R.id.btn_3);
		btn_4 = (Button) findViewById(R.id.btn_4);
		btn_5 = (Button) findViewById(R.id.btn_5);
		btn_6 = (Button) findViewById(R.id.btn_6);
		btn_7 = (Button) findViewById(R.id.btn_7);
		btn_8 = (Button) findViewById(R.id.btn_8);
		btn_9 = (Button) findViewById(R.id.btn_9);
		btn_0 = (Button) findViewById(R.id.btn_0);
		btn_add = (Button) findViewById(R.id.add);
		btn_subtract = (Button) findViewById(R.id.subtract);
		btn_multiply = (Button) findViewById(R.id.multiply);
		btn_divide = (Button) findViewById(R.id.divide);
		btn_equal = (Button) findViewById(R.id.equal);
		String a = " ", b = " ", tmp = " ";
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_calculating, menu);
		return true;
	}

}
