
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class MergeImages {

    BufferedImage imagem[][];
    Graphics g;

    BufferedImage imagemCombinada;

    private void carregaImagens(int num) {
        try {
            //LER OS ARQUIVOS DAS IMAGENS
            imagem = new BufferedImage[64][64];

            if (num == 1) {
                for (int i = 0; i < 64; i++) {
                    for (int j = 0; j < 64; j++) {
                        imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                    }
                }
            }

            if (num == 2) {
                Thread t1 = new Thread() {
                    public void run() {
                        for (int i = 0; i < 32; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t1.start();

                Thread t2 = new Thread() {
                    public void run() {
                        for (int i = 32; i < 64; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t2.start();

                try {
                    t1.join();
                    t2.join();
                } catch (Exception e) {

                }
            }

            if (num == 4) {
                Thread t1 = new Thread() {
                    public void run() {
                        for (int i = 0; i < 16; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t1.start();

                Thread t2 = new Thread() {
                    public void run() {
                        for (int i = 16; i < 32; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t2.start();

                Thread t3 = new Thread() {
                    public void run() {
                        for (int i = 32; i < 48; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t3.start();

                Thread t4 = new Thread() {
                    public void run() {
                        for (int i = 48; i < 64; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t4.start();

                try {
                    t1.join();
                    t2.join();
                    t3.join();
                    t4.join();
                } catch (Exception e) {

                }
            }

            if (num == 8) {
                Thread t1 = new Thread() {
                    public void run() {
                        for (int i = 0; i < 8; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t1.start();

                Thread t2 = new Thread() {
                    public void run() {
                        for (int i = 8; i < 16; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t2.start();

                Thread t3 = new Thread() {
                    public void run() {
                        for (int i = 16; i < 24; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t3.start();

                Thread t4 = new Thread() {
                    public void run() {
                        for (int i = 24; i < 32; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t4.start();

                Thread t5 = new Thread() {
                    public void run() {
                        for (int i = 32; i < 40; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t5.start();

                Thread t6 = new Thread() {
                    public void run() {
                        for (int i = 40; i < 48; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t6.start();

                Thread t7 = new Thread() {
                    public void run() {
                        for (int i = 48; i < 56; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t7.start();

                Thread t8 = new Thread() {
                    public void run() {
                        for (int i = 56; i < 64; i++) {
                            for (int j = 0; j < 64; j++) {
                                try {
                                    imagem[j][i] = ImageIO.read(new File("img/" + j + "_" + i + ".jpg"));
                                } catch (IOException ex) {
                                    Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                };
                t8.start();

                try {
                    t1.join();
                    t2.join();
                    t3.join();
                    t4.join();
                    t5.join();
                    t6.join();
                    t7.join();
                    t8.join();
                } catch (Exception e) {

                }
            }

            imagemCombinada = new BufferedImage(256 * 64, 256 * 64, BufferedImage.TYPE_INT_RGB);

            //desenha, na imagemCombinada, na posição (0,0) a imagem1 e na posiçao (imagem1.getHeight(),0) a imagem2
            g = imagemCombinada.getGraphics();

            System.out.println("Imagens carregadas");
        } catch (Exception e) {

        }
    }

    public void MergeImages() {

        try {
            //salva a nova imagem em um arquivo
            ImageIO.write(imagemCombinada, "JPG", new File("combinadas.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(MergeImages.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {

        int qtdThreads = 1;

        MergeImages m = new MergeImages();

        m.carregaImagens(qtdThreads);
        m.MergeImages();

    }
}
