package com.neuedu.day_08.text;

public class Computer {
    private Usb usbm;
    private Usb usbc;
    private Usb usbf;


    public Computer() {
    }


    public Usb getUsbm() {
        return usbm;
    }

    public void setUsbm(Usb usbm) {
        this.usbm = usbm;
    }

    public Usb getUsbc() {
        return usbc;
    }

    public void setUsbc(Usb usbc) {
        this.usbc = usbc;
    }

    public Usb getUsbf() {
        return usbf;
    }

    public void setUsbf(Usb usbf) {
        this.usbf = usbf;
    }


    public void work(){
        if (usbm!=null)
        usbm.useUsb();
        if (usbc!=null)
        usbc.useUsb();
        if (usbf!=null)
        usbf.useUsb();
        if(usbf==null&&usbc==null&&usbm==null)
            System.out.println("USB接口上什么都没有");
    }
}
