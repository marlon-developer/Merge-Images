

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ClasseSequencial {

    public ClasseSequencial() {
        try {
            //LER OS ARQUIVOS DAS IMAGENS
            BufferedImage imagem[][] = new BufferedImage[64][64];
            
                for (int i = 0; i < 64; i++) {
                    for (int j = 0; j < 64; j++) {
                        imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                    }
                }

            BufferedImage imagemCombinada = new BufferedImage(256*64, 256*64, BufferedImage.TYPE_INT_ARGB);

            //desenha, na imagemCombinada, na posição (0,0) a imagem1 e na posiçao (imagem1.getHeight(),0) a imagem2
            Graphics g = imagemCombinada.getGraphics();
            
            int auxX, auxY=0;
            for (int i = 0; i < 64; i++) {
                auxX = 0;
                for (int j = 0; j < 64; j++) {
                    g.drawImage(imagem[j][i], auxX, auxY, null);
                    auxX+=256;
                }
                auxY+= 256;
            }
            
            
            
            //salva a nova imagem em um arquivo
            ImageIO.write(imagemCombinada, "PNG", new File("combinadas.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ClasseSequencial m = new ClasseSequencial();
    }

}
