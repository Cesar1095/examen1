
import javax.swing.*;

public class Ventana extends JFrame{
	
	private JButton btnBoton;

	public Ventana(){
		this.setTitle("prueba para examen");
		setDefaultClose(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		btnBoton=new JButton("Nuevo boton");
		btnBoton.setBounds(120,100,120,70);
		add(btnBoton);		
	
	}
}
