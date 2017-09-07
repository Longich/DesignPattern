package proxy.raw;


public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printerのインスタンスを作成中");
    }
    public Printer(String name) {
        this.name = name;
        heavyJob("Printerのインスタンス(" + name + ")を作成中");
    }
    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
   
    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(".");
        }
        System.out.println("完了");
    }

}
