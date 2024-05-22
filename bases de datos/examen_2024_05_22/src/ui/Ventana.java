package ui;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.DAOInmueble;
import dao.DAOVendedor;
import dao.DAOVenta;
import entidades.Inmueble;
import entidades.Vendedor;
import entidades.Venta;

public class Ventana extends JFrame {
	private DAOInmueble daoInmueble = new DAOInmueble();
	private DAOVendedor daoVendedor = new DAOVendedor();
	private DAOVenta daoVenta = new DAOVenta();
	private JPanel contentPane;
	private JTable tablaInmueble;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Ventana frame = new Ventana();
					frame.setLocationRelativeTo(null);
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
	public Ventana() {
		setTitle("Inmobiliaria Azarquiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 45, 500, 100);
		contentPane.add(scrollPane);

		tablaInmueble = new JTable();
		tablaInmueble.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tablaInmueble.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				cargarTablaInmueble();
			}
		});
		tablaInmueble.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null, null, null, null, null, null },
				},
				new String[] {
						"Referencia", "Fecha de Alta", "Tipo", "Provincia", "Superficie", "Precio", "Fecha de Venta",
						"Vendedor"
				}) {
			Class[] columnTypes = new Class[] {
					String.class, Integer.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaInmueble.getColumnModel().getColumn(0).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(1).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(2).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(3).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(4).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(5).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(6).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(7).setResizable(false);
		scrollPane.setViewportView(tablaInmueble);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(45, 188, 527, 92);
		contentPane.add(scrollPane_1);

		cargarTablaInmueble();
	}

	private void cargarTablaInmueble() {
		ArrayList<Inmueble> lista;
		lista = daoInmueble.get();

		Object[][] datos = new Object[lista.size()][8];
		for (int i = 0; i < lista.size(); i++) {
			Inmueble inmueble = lista.get(i);
			Venta venta = daoVenta.get(inmueble.getReferencia());
			Vendedor vendedor = null;
			if (venta != null) {
				vendedor = daoVendedor.get(venta.getVendedor());
			}

			datos[i][0] = inmueble.getReferencia();
			datos[i][1] = inmueble.getFechaAlta();
			datos[i][2] = inmueble.getTipo();
			datos[i][3] = inmueble.getProvincia();
			datos[i][4] = inmueble.getSuperficie();
			datos[i][5] = inmueble.getPrecio();
			datos[i][6] = null;
			if (venta != null) {
				datos[i][6] = venta.getFechaVenta();
			}
			datos[i][7] = null;
			if (vendedor != null) {
				datos[i][7] = vendedor.getNombre();
			}
		}
		tablaInmueble.setModel(new DefaultTableModel(
				datos,
				new String[] {
						"Referencia", "Fecha de Alta", "Tipo", "Provincia", "Superficie", "Precio", "Fecha de Venta",
						"Vendedor"
				}) {
			Class[] columnTypes = new Class[] {
					Integer.class, DateFormat.class, String.class, String.class, Integer.class, Float.class,
					DateFormat.class, String.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}

			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tablaInmueble.getColumnModel().getColumn(0).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(1).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(2).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(3).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(4).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(5).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(6).setResizable(false);
		tablaInmueble.getColumnModel().getColumn(7).setResizable(false);
	}
}