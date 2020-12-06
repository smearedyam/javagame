package com.smearedyam.javagame.world;

import java.util.HashMap;

public enum TileType {
	
	GRASS(1,true, "Grass"),
	DIRT(2,true, "Dirt"),
	SKY(31,true, "Sky"),
	LAVA(4,true, "Lava"),
	CLOUD(5,true, "Cloud"),
	STONE(6,true, "Stone");
	
	
	
	private int id;
	private boolean collidable;
	private String name;
	private float damage;
	
	private TileType (int id, boolean collidable, String name) {
		this (id, collidable, name, 0);
	}
	
	private TileType (int id, boolean collidable, String name, float damage) {
	
			this.id = id;
			this.collidable = collidable;
			this.name = name;
			this.damage = damage;
		
	}

	public int getId() {
		return id;
	}

	public boolean isCollidable() {
		return collidable;
	}

	public String getName() {
		return name;
	}

	public float getDamage() {
		return damage;
	}
	
	private static HashMap<Integer, TileType> tileMap;
	
	static {
		for (TileType tileType : TileType.values()) {
			tileMap.put(tileType.getId(), tileType);
		}
	}
	
	public static TileType getTileTypeById (int id) {
		return tileMap.get(id);
	}
	
}
