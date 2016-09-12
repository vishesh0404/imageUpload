package main.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.dao.ImageDao;
import main.java.entity.Image;

@Service("imageService")
@Transactional
public class ImageServiceImpl implements ImageService{

	@Autowired
	ImageDao dao;
	
	@Override
	public List<Image> findAllImages() {
		return dao.findAllImage();
	}

	@Override
	public void saveImage(Image image) {
		dao.saveImage(image);
	}

	
}
