package com.sugarbeats.game;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import com.sugarbeats.SugarBeats;

public class AndroidLauncher extends AndroidApplication {

    private LogIn logIn;

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		logIn = new LogIn(this);
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new SugarBeats(logIn), config);


	}

    @Override
    protected void onResume() {
        super.onResume();
        logIn.signInSilently();

    }













}


