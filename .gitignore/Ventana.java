package graficos2;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import graficos2.Parabola;
/**
 *
 * @author jorge
 */
public class Ventana extends JFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

       Parabola.plano.paintSQRFunc(Parabola.plano.getGraphics(),-0.2,2,-15,-200,200);
    }

}