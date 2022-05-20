package br.com.senai.manutencaosenaiapi.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaPesquisaDeTipo extends JFrame {

	private JPanel contentPane;
	private JTextField textParametro;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPesquisaDeTipo frame = new TelaPesquisaDeTipo();
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
	public TelaPesquisaDeTipo() {
		setTitle("Pesquisa de Tipo de Peça");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParametro = new JLabel("Parametro");
		lblParametro.setBounds(10, 11, 78, 14);
		contentPane.add(lblParametro);
		
		textParametro = new JTextField();
		textParametro.setBounds(10, 37, 453, 20);
		textParametro.setText("");
		contentPane.add(textParametro);
		textParametro.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(475, 34, 128, 26);
		contentPane.add(btnPesquisar);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(615, 34, 129, 26);
		contentPane.add(btnAdicionar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 734, 235);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setColumnHeaderView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(520, 316, 224, 86);
		contentPane.add(panel);
		
		JLabel lblAçõesParaALinhaSelecionada = new JLabel("Ações para a linha selecionada");
		panel.add(lblAçõesParaALinhaSelecionada);
		
		JButton btnEditar = new JButton("Editar");
		panel.add(btnEditar);
		
		JButton btnNewButton = new JButton("Excluir");
		panel.add(btnNewButton);
	}
}
