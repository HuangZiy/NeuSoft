package com.neuedu.day_08.text;

public class Camera implements Usb {
    @Override
    public void useUsb() {
        System.out.println("使用了摄像头");
    }
}
