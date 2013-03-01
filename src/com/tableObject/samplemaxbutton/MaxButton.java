package com.tableObject.samplemaxbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.widget.Button;

/**
 * 
 * @author Max MONTET
 * @company Overscan
 *	A button custom class to change opacity on touch
 *
 */
public class MaxButton extends Button implements OnTouchListener
{

	/**
	 * Call super constructor, and add OnTouchListener
	 * @param context
	 */
	public MaxButton(Context context) 
	{
		super(context);
		setOnTouchListener(this);
	}
	/**
	 * Call super constructor, and add OnTouchListener
	 * @param context
	 */
	public MaxButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		setOnTouchListener(this);
	}
	/**
	 * Call super constructor, and add OnTouchListener
	 * @param context
	 */
	public MaxButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		setOnTouchListener(this);
	}

	// The opacity on touch Down (default = 0.75)
	private float opacityDown =0.75f;
	// The opacity on touch up (Default = 1)
	private float opacityUp=1.0f;

	//On touch, change design button
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		Button mButton = (Button) v;
		changeAlpha(mButton, event);
		return false;
	}
	
	//Change button design on touch 
	private void changeAlpha(Button mButton, MotionEvent event) 
	{
		if(event.getAction() == MotionEvent.ACTION_DOWN)
		{
			AlphaAnimation alphaUp = new AlphaAnimation(opacityDown, opacityDown);
	        alphaUp.setFillAfter(true);
	        mButton.startAnimation(alphaUp);
		}
		if(event.getAction() == MotionEvent.ACTION_UP)
		{
			AlphaAnimation alphaUp = new AlphaAnimation(opacityUp, opacityUp);
	        alphaUp.setFillAfter(true);
	        mButton.startAnimation(alphaUp);
		}		
	}
	/**
	 * @return the opacityDown
	 */
	public float getOpacityDown() {
		return opacityDown;
	}

	/**
	 * @param opacityDown the opacityDown to set
	 */
	public void setOpacityDown(float opacityDown) {
		this.opacityDown = opacityDown;
	}

	/**
	 * @return the opacityUp
	 */
	public float getOpacityUp() {
		return opacityUp;
	}

	/**
	 * @param opacityUp the opacityUp to set
	 */
	public void setOpacityUp(float opacityUp) {
		this.opacityUp = opacityUp;
	}

}
