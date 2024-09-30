package com.aksoyakin.shoppingcart.service;

import com.aksoyakin.shoppingcart.model.dto.ImageDto;
import com.aksoyakin.shoppingcart.model.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {

    Image getImageById(Long id);

    void deleteImageById(Long id);

    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);

    void updateImage(MultipartFile file, Long imageId);
}
