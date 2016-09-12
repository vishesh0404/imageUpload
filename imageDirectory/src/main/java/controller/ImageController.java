package main.java.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import main.java.entity.Image;
import main.java.service.ImageService;

@Controller
@RequestMapping("/")
public class ImageController {

	@Autowired
	ImageService service;
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String displayImage(ModelMap model){
		List<Image> images = service.findAllImages();
		model.addAttribute("images", images);
		return "imageDisplay";
	}
	
	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public String saveImage( @ModelAttribute(value="file") MultipartFile file){
		
		FileOutputStream outputStream = null;
        String filePath = "D:/images" + "/" + file.getOriginalFilename();
        try {
            outputStream = new FileOutputStream(new File(filePath));
            outputStream.write(file.getBytes());
            outputStream.close();
            Image image = new Image();
            image.setPath(filePath);
            service.saveImage(image);
        } catch (Exception e) {
            System.out.println("Error while saving file");
            return "imageDisplay";
        }
        return "success";
		
	}
	
}
