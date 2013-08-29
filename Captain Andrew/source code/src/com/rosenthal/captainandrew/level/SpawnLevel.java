package com.rosenthal.captainandrew.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.rosenthal.captainandrew.level.tile.Tile;

public class SpawnLevel extends Level {
	
	@SuppressWarnings("unused")
	private Tile[] tiles;
	private int[] levelPixels;

	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path) {		
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			tiles = new Tile[w * h];
			image.getRGB(0, 0, w, h, levelPixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception! Could Not Load Level File!");
		}
	}
	
	protected void generateLevel() {
		
	}

}
