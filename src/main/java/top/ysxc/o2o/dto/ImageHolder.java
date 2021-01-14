package top.ysxc.o2o.dto;

import java.io.InputStream;

/**
 * @author ysxc
 * @create 2021-01-14 9:35 下午
 */
public class ImageHolder {

    private String imageName;
    private InputStream image;

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public InputStream getImage() {
        return image;
    }

    public void setImage(InputStream image) {
        this.image = image;
    }

    public ImageHolder(String imageName, InputStream image) {
        this.imageName = imageName;
        this.image = image;
    }
}
