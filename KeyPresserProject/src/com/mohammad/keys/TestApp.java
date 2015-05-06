package com.mohammad.keys;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestApp {

	private JFrame frmByMohammadNajar;
	private JButton btnClickToEnable = new JButton("Click to ENABLE Win 8 Charms Bar");
	
	{System.out.println("Hello world");}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		KeyHook.blockWindowsKey();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestApp window = new TestApp();
					window.frmByMohammadNajar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmByMohammadNajar = new JFrame();
		frmByMohammadNajar.setTitle("by Mohammad Najar");
		frmByMohammadNajar.setBounds(100, 100, 335, 111);
		frmByMohammadNajar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmByMohammadNajar.getContentPane().setLayout(null);

		btnClickToEnable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (btnClickToEnable.getText().contains("ENABLE")) {
					KeyHook.unblockWindowsKey();
					btnClickToEnable.setText("Click to DISABLE Win 8 Charms Bar");
				} else {
					KeyHook.blockWindowsKey();
					btnClickToEnable.setText("Click to ENABLE Win 8 Charms Bar");
				}
			}
		});

		btnClickToEnable.setBounds(10, 11, 299, 42);
		frmByMohammadNajar.getContentPane().add(btnClickToEnable);
	}
}
