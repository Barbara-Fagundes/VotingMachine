package br.com.barbara.urnaeletronica.view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.com.ricardo.urnaeletronica.controller.Candidatos;
import br.com.ricardo.urnaeletronica.model.Candidato;


public class UrnaEletronica {

	private JFrame frame;
	private String numeroDigitado = new String();
	private JLabel lblFoto;
	private JLabel lblCandidato;
	private JLabel lblNumero;
	
	//-- Carregar os candidatos em memória
	private HashMap<String,Candidato>candidatos;
	
	//-----------------------------------------------------------------------
	private void capturarNumero(int numero)	{
		
		if(numeroDigitado.trim().length()<2) {
			
		numeroDigitado+=numero;
		lblNumero.setText(numeroDigitado);
		
		} 
		
		if(numeroDigitado.trim().length()==2)	{
			
			Candidato candidato =
					candidatos.get(numeroDigitado);
			
			lblFoto.setIcon(new ImageIcon(".\\candidatos\\"+candidato.getNumero()+".jpg"));
			
			lblCandidato.setText(candidato.getNome());
			lblFoto.setToolTipText(candidato.getApelido());
		}
	}
	
	//-----------------------------------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UrnaEletronica window = new UrnaEletronica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UrnaEletronica() {
		initialize();
		
		candidatos = (new Candidatos()).getCandidatos();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 552, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 1
			//-----------------------------------------
				
				
				capturarNumero (1);
				
				
			//-----------------------------------------	
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn1.setBounds(198, 45, 91, 73);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 2
			//-----------------------------------------
				
				
				capturarNumero (2);
				
				
			//-----------------------------------------	
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn2.setBounds(321, 45, 91, 73);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 3
			//-----------------------------------------
				
				
				capturarNumero (3);
				
				
			//-----------------------------------------	
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn3.setBounds(436, 45, 91, 73);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 6
			//-----------------------------------------
				
				
				capturarNumero (6);
				
				
			//-----------------------------------------	
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn6.setBounds(436, 141, 91, 73);
		frame.getContentPane().add(btn6);
		
		JButton btn4 = new JButton("4");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 4
			//-----------------------------------------
				
				capturarNumero (4);
				
				
				
			//-----------------------------------------	
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn4.setBounds(198, 141, 91, 73);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 5
			//-----------------------------------------
				
				
				capturarNumero (5);
				
				
			//-----------------------------------------	
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn5.setBounds(321, 141, 91, 73);
		frame.getContentPane().add(btn5);
		
		JButton btn9 = new JButton("9");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 9
			//-----------------------------------------
				
				
				capturarNumero (9);
				
				
			//-----------------------------------------	
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn9.setBounds(436, 242, 91, 73);
		frame.getContentPane().add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 7
			//-----------------------------------------
				
				capturarNumero (7);
				
				
				
			//-----------------------------------------	
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn7.setBounds(198, 242, 91, 73);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 8
			//-----------------------------------------
				
				
				capturarNumero (8);
				
				
			//-----------------------------------------	
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn8.setBounds(321, 242, 91, 73);
		frame.getContentPane().add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão 0
			//-----------------------------------------
				
				
				capturarNumero (0);
				
				
			//-----------------------------------------	
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 50));
		btn0.setBounds(321, 340, 91, 73);
		frame.getContentPane().add(btn0);
		
		lblFoto = new JLabel("");
		lblFoto.setIcon(new ImageIcon(".\\candidatos\\00.jpg"));
		lblFoto.setBounds(10, 98, 161, 225);
		frame.getContentPane().add(lblFoto);
		
		lblCandidato = new JLabel("");
		lblCandidato.setBounds(10, 340, 161, 28);
		frame.getContentPane().add(lblCandidato);
		
		JButton btnVotar = new JButton("VOTAR");
		btnVotar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão Votar
			//-----------------------------------------
				
				
				
				
				
			//-----------------------------------------	
			}
		});
		btnVotar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnVotar.setBounds(198, 340, 91, 73);
		frame.getContentPane().add(btnVotar);
		
		JButton btnCorrigir = new JButton("CORRIGIR");
		btnCorrigir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			//-----------------------------------------
			//-- Clicando no Botão Corrigir
			//-----------------------------------------
				
				
			numeroDigitado= "";
			lblFoto.setIcon(new ImageIcon(".\\candidatos\\00.jpg"));
			lblNumero.setText("");
			lblFoto.setToolTipText("");
			lblCandidato.setText("");
				
				
			//-----------------------------------------	
			}
		});
		btnCorrigir.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCorrigir.setBounds(436, 340, 91, 73);
		frame.getContentPane().add(btnCorrigir);
		
		lblNumero = new JLabel("");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setBounds(10, 45, 161, 28);
		frame.getContentPane().add(lblNumero);
	}
}
