package main.java.dao;

import java.util.List;

import main.java.entity.Image;

public interface ImageDao {

	List<Image> findAllImage();
	
	void saveImage(Image image);
}
