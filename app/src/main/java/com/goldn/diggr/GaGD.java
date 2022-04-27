package com.goldn.diggr;

import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

import java.util.Random;

public class GaGD {
    private ImageView imageS1, imageS2, imageS3, imageS4, imageS5, imageS6;


    public GaGD(ImageView imageS1, ImageView imageS2, ImageView imageS3, ImageView imageS4, ImageView imageS5, ImageView imageS6) {
        this.imageS1 = imageS1;
        this.imageS2 = imageS2;
        this.imageS3 = imageS3;
        this.imageS4 = imageS4;
        this.imageS5 = imageS5;
        this.imageS6 = imageS6;
    }

    public void gaGd() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                imageS1.setTag(0);
                imageS2.setTag(0);
                imageS3.setTag(0);
                imageS4.setTag(0);
                imageS5.setTag(0);
                imageS6.setTag(0);
                Log.d("weq", "11");
                Random random = new Random();
                int a = random.nextInt(6);
                int b = random.nextInt(6);
                switch (a) {
                    case 0:
                        imageS1.setTag(1);
                        break;
                    case 1:
                        imageS2.setTag(1);
                        break;
                    case 2:
                        imageS3.setTag(1);
                        break;
                    case 3:
                        imageS4.setTag(1);
                        break;
                    case 4:
                        imageS5.setTag(1);
                        break;
                    case 5:
                        imageS6.setTag(1);
                        break;

                }
                switch (b) {
                    case 0:
                        if (imageS1.getTag().toString().equals("0")) {
                            imageS1.setTag(1);
                        } else {
                            imageS4.setTag(1);
                        }

                        break;
                    case 1:
                        if (imageS2.getTag().toString().equals("0")) {
                            imageS2.setTag(1);
                        } else {
                            imageS5.setTag(1);
                        }
                        break;
                    case 2:
                        if (imageS3.getTag().toString().equals("0")) {
                            imageS3.setTag(1);
                        } else {
                            imageS6.setTag(1);
                        }
                        break;
                    case 3:
                        if (imageS4.getTag().toString().equals("0")) {
                            imageS4.setTag(1);
                        } else {
                            imageS1.setTag(1);
                        }
                        break;
                    case 4:
                        if (imageS5.getTag().toString().equals("0")) {
                            imageS5.setTag(1);
                        }else {
                            imageS2.setTag(1);
                        }
                        break;
                    case 5:
                        if (imageS6.getTag().toString().equals("0")) {
                            imageS6.setTag(1);
                        }else {
                            imageS3.setTag(1);
                        }
                        break;

                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
