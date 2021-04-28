package de.darkest_cave.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class IngameScreen extends ScreenAdapter {

    SpriteBatch batch;
    float maxVelocity = 100f;
    BitmapFont font;
    Player player;

    public IngameScreen() {

        batch = new SpriteBatch();

        font = new BitmapFont();
        font.setColor(Color.OLIVE);
        player = new Player();
    }

    @Override
    public void render(float delta) {
        //LOGIGCS

        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            player.position.y += maxVelocity * delta;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            player.position.x -= maxVelocity * delta;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            player.position.y -= maxVelocity * delta;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            player.position.x += maxVelocity * delta;
        }

        //RENDER
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        batch.draw(player.img, player.position.x, player.position.y, player.img.getWidth()/100*75, player.img.getHeight()/100*75);
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
        player.img.dispose();
    }
}
