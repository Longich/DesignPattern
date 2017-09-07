package memento.raw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

import memento.raw.game.Gamer;
import memento.raw.game.Memento;

public class Main {
    public static final String SAVEFILENAME = "game.dat";
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();
        if (memento != null) {
            System.out.println("前回保存したデータからスタートします。");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新規にスタートします");
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);
            System.out.println("現状：" + gamer);
            
            gamer.bet();
            
            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");
            
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("　　　　（だいぶ増えたので現在の状態を保存しておこう");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney()) {
                System.out.println("　　　　（だいぶ減ったので、以前の状態に復帰しよう");
                gamer.restoreMemento(memento);
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
    public static void saveMemento(Memento memento) {
        try (
            FileOutputStream fos = new FileOutputStream(SAVEFILENAME);
            DeflaterOutputStream dos = new DeflaterOutputStream(fos);
            ObjectOutput out = new ObjectOutputStream(dos);
        ){
            out.writeObject(memento);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Memento loadMemento() {
        Memento memento = null;
        try (
            FileInputStream fis = new FileInputStream(SAVEFILENAME);
            InflaterInputStream iis = new InflaterInputStream(fis);
            ObjectInput ois = new ObjectInputStream(iis);
        ){
            memento = (Memento)ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
