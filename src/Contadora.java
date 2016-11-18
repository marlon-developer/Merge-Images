
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Contadora extends Thread {

    private int colunaInicial, LinhaInicial, numThreads;
    private Graphics g;
    BufferedImage bi[][];

    public Contadora(int _inicio, int _fim, Graphics g, BufferedImage bi[][], int numThreads) {
        this.colunaInicial = _inicio;
        this.LinhaInicial = _fim;
        this.g = g;
        this.bi = bi;
        this.numThreads = numThreads;
    }

    @Override
    public void run() {
        int auxX, auxY = 0;
        for (int i = 0; i < 64; i++) {
            auxX = 256 * colunaInicial;
            for (int j =colunaInicial; j < colunaInicial+numThreads; j++) {
                g.drawImage(bi[j][i], auxX, auxY, null);
                auxX += 256;
            }
            auxY += 256;
        }
    }
}
