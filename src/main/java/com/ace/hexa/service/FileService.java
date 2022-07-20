package com.ace.hexa.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

	public void uploadFile(MultipartFile file) throws IllegalStateException, IOException {
		file.transferTo(
				new File("C:\\Users\\Ahkar Toe Maw\\Desktop\\hexa_project\\src\\main\\resources\\static\\img\\"
						+ file.getOriginalFilename()));
	}

	public boolean deleteFile(String news_img) {
		File fileToDelete = new File(
				"C:\\Users\\Ahkar Toe Maw\\Desktop\\hexa_project\\src\\main\\resources\\static\\img\\"
						+ news_img);
		return fileToDelete.delete();
	}

}
