package de.darkest_cave.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class IngameScreen extends ScreenAdapter {

    SpriteBatch batch;
    Texture img;
    BitmapFont font;

    public IngameScreen() {

        batch = new SpriteBatch();
        img = new Texture("badlogic.jpg");
        font = new BitmapFont();
        font.setColor(Color.OLIVE);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(img, 0, 0);
        font.draw(batch, "Hello World!", 300, 100);
        batch.end();
    }

    @Override
    public void hide() {
        super.hide();
        this.dispose();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
