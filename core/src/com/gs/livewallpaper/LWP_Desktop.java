package com.gs.livewallpaper;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class LWP_Desktop {
	public static void main(String[] argv) {
		final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title   = "LWP";
		config.width   = 480;
		config.height  = 800;
		config.samples = 0;
		config.useGL30      = false;
		config.vSyncEnabled = false;
		config.resizable    = false;
		config.fullscreen   = false;
		config.foregroundFPS = 61;
		config.backgroundFPS = -1;

		new LwjglApplication(new LWP(), config);
	}
}
