package command.raw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import command.raw.command.Command;
import command.raw.command.MacroCommand;
import command.raw.drawer.DrawCanvas;
import command.raw.drawer.DrawCommand;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    //描画履歴
    private MacroCommand history = new MacroCommand();
    //描画領域
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    //消去ボタン
    private JButton clearButton = new JButton("clear");
    
    public Main(String title) {
        super(title);
        
        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        
        pack();
        setVisible(true);
    }
    
    //ActionListenr用
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }
    
    //MouseMotionListener用
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }
    //WindowListener用
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    
    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
