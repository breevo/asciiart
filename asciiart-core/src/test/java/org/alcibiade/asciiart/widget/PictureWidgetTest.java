package org.alcibiade.asciiart.widget;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.alcibiade.asciiart.coord.TextBoxSize;
import org.alcibiade.asciiart.raster.ExtensibleCharacterRaster;
import org.alcibiade.asciiart.raster.Raster;
import org.alcibiade.asciiart.raster.RasterContext;
import org.junit.Test;

public class PictureWidgetTest {

    @Test
    public void testPictureWidget() throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URL circleImageURL = classLoader.getResource("org/alcibiade/asciiart/raster/image/Sample_BlackCircle.png");
        BufferedImage circleImage = ImageIO.read(circleImageURL);

        TextWidget widget = new PictureWidget(new TextBoxSize(30, 10),
                circleImage);
        Raster raster = new ExtensibleCharacterRaster();

        widget.render(new RasterContext(raster));
        // System.out.println(raster);
    }
}
