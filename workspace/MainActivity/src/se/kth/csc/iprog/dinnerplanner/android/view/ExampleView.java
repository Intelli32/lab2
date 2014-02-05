package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.widget.TextView;

public class ExampleView {

	View view;

	public ExampleView(View view) {

		// store in the class the reference to the Android View
		this.view = view;
<<<<<<< HEAD
=======
		
		TextView example = (TextView) view.findViewById(R.id.example_text);
		example.setText(plice);
		
		TextView example2 = (TextView) view.findViewById(R.id.lole);
		example2.setText(lol);
>>>>>>> ab71b0c314ab4341080d01ed0a0b5460226f7cba

		TextView example = (TextView) view.findViewById(R.id.example_text);
		example.setText("Hello world");

		// Setup the rest of the view layout
	}

}
