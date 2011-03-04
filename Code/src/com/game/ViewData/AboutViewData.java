package com.game.ViewData;

import com.game.MessageHandler;
import com.game.MsgType;
import com.game.R;
import com.game.MessageHandler.MsgReceiver;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Specific view data class for the "About Us" screen.
 * @author Ying
 *
 */
public class AboutViewData extends ViewData 
{
	/**
	 * @see ViewData createXMLView(Activity activity) 
	 */
	@Override
	public View createXMLView(Activity activity) 
	{
		//Log.i("AboutViewData", "createXMLView");
		
		// Access xml layout
		LayoutInflater li = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View xmlLayout = (View) li.inflate(R.layout.about, null);
        
        // Callback for the buttons
        Button okButton = (Button) xmlLayout.findViewById(R.id.ok_about_but);
        okButton.setOnClickListener(new OnClickListener() 
        {
          @Override
          public void onClick(View v) 
          {
        	  //Log.i("ViewData", " Clicked OK button");            
            MessageHandler.Get().Send(MsgReceiver.LOGIC, MsgType.BUTTON_CLICK, R.id.ok_about_but);
          }
        });
        
		return xmlLayout;
	}

}
