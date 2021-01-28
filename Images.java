import java.awt.Graphics2D;
import java.awt.RenderingHints;



import java.io.File;
import java.io.IOException;


import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;




public class Images {
	private ImageIcon icon;
	private BufferedImage img;
    public static void main(String avg[]) throws IOException
    {

    }

    public Images(String imageName) throws IOException
    {
    	if (imageName.equals("nameOfImage")) {
         img=ImageIO.read(new File("images\\Heart.jpg(file location picked later"));
        icon=new ImageIcon(img);
    	}

    }
    public ImageIcon getHeart() {
    	return getScaledImage();
    }
    private ImageIcon getScaledImage () {
    	BufferedImage scaledimg = new BufferedImage(50,50, BufferedImage.TYPE_INT_ARGB);
    	Graphics2D g2 = scaledimg.createGraphics();
    	g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    	g2.drawImage(img, 0, 0, 50, 50, null);
    	return new ImageIcon(scaledimg);
    	
    }
}
