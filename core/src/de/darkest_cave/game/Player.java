package de.darkest_cave.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player {
    Vector2 position;

    Texture img;

    Player(){

        position = new Vector2();
        position.x = 100;
        position.y = 100;


        img = new Texture("badlogic.jpg");
    }

    public Vector2 getPosition(){
        return position;
    }

    public void setPosition(Vector2 position){
        this.position = position;
    }


}
