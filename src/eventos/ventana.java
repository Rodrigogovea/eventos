
package eventos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class ventana extends JFrame
{
    private JLabel lblalgo,lblresultado;
    private JTextField txtBox,txtBox2;
    private JButton btnOk;
    private int x,y;
   
    
    ventana()
    {
        super();
        this.setTitle("Eventos");
        this.setSize(500,500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void iniciarComponentes()
    {
        operaciones op = new operaciones();
        x = 0;
        y = 0;
        lblalgo = new JLabel();
        lblalgo.setText("Suma:");
        lblalgo.setBounds(20, 20, 80, 10);
        this.add(lblalgo);
        lblresultado = new JLabel();
        lblresultado.setText("0");
        lblresultado.setBounds(310,20,20,20);
        this.add(lblresultado);
        
        txtBox = new JTextField();
        txtBox.setEditable(false);
        txtBox.setBounds(100, 20, 100, 30);
        this.add(txtBox);
        
        txtBox2 = new JTextField();
        txtBox2.setBounds(202,20,100,30);
        this.add(txtBox2);
        
        btnOk = new JButton();
        btnOk.setText("Suma");
        btnOk.setBounds(20,60,100,40);
        this.add(btnOk);
        
        btnOk.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               int res;
               x = Integer.valueOf(txtBox.getText());
               y = Integer.valueOf(txtBox2.getText());
               res = op.suma(x,y);
               lblresultado.setText(String.valueOf(res));
            }
        }        
        );
    }
}
