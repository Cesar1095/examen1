
import javax.swing.*;

public class Ventana extends JFrame{
	
	private JButton btnBoton;

	public Ventana(){
		this.setTitle("prueba para examen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		btnBoton=new JButton("Nuevo boton");
		btnBoton.setBounds(120,100,120,70);
		add(btnBoton);		
		
	}
	public static void main(String ar[]){
	Ventana V =new Ventana();
	V.setBounds(0,0,300,200);
	V.setVisible(true);
	}
}
