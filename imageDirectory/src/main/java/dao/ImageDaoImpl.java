package main.java.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import main.java.entity.Image;

@Repository("imageDao")
public class ImageDaoImpl extends AbstractDao<Long, Image> implements ImageDao {

	@Override
	@SuppressWarnings("unchecked")
	public List<Image> findAllImage() {
		Criteria criteria = createEntityCriteria();
		return (List<Image>)criteria.list();
	}

	@Override
	public void saveImage(Image image) {
		persist(image);
	}

}
