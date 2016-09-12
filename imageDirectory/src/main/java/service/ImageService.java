package main.java.service;

import java.util.List;

import main.java.entity.Image;

public interface ImageService {

	List<Image> findAllImages();
	
	void saveImage(Image image);
	
}
