package br.com.senai.manutencaosenaiapi.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroDeTipo extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textDescrição;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroDeTipo frame = new TelaCadastroDeTipo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroDeTipo() {
		setTitle("Cadastro deTipos de Peça");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(12, 12, 55, 16);
		contentPane.add(lblId);
		
		textId = new JTextField();
		textId.setEnabled(false);
		textId.setBounds(12, 40, 34, 20);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblDescrição = new JLabel("Descrição");
		lblDescrição.setBounds(59, 12, 87, 16);
		contentPane.add(lblDescrição);
		
		textDescrição = new JTextField();
		textDescrição.setBounds(58, 40, 516, 20);
		contentPane.add(textDescrição);
		textDescrição.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setBounds(476, 81, 98, 26);
		contentPane.add(btnSalvar);
	}
}
