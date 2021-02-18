package de.darkest_cave.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class DarkestCave extends Game {

	public static DarkestCave INSTANCE;

	public DarkestCave() {
		INSTANCE = this;
	}

	@Override
	public void create () {
		setScreen(new IngameScreen());
	}

}
