import javax.swing.*;  
import java.awt.event.*;  
import java.awt.*;  
public class HitungVolumeTabung extends JFrame implements ActionListener{  
	double jarijari,tinggi;
	JPanel pl = new JPanel();  
	JLabel lbl0 = new JLabel ("HITUNG VOLUME BOLA");  
	JLabel lbl1 = new JLabel ("Jari-jari");  
	JLabel lbl2 = new JLabel ("Tinggi");  
	JLabel lbl3 = new JLabel ("Hasil");  

	JTextField txt1 = new JTextField();  
	JTextField txt2 = new JTextField();  
	JTextField txt3 = new JTextField();  

	JButton bthitung = new JButton ("Hitung");  
	JButton btnHtngKerucut = new JButton ("Hitung");  
	JButton btnHtngTabung = new JButton ("Hitung");  
	JButton btbatal = new JButton ("Reset");  
	JButton btclose = new JButton ("Close");
	JButton btntabung = new JButton ("Tabung");
	JButton btnkerucut = new JButton ("Kerucut");  

public HitungVolumeTabung() {  
	pl.setLayout(null);
	add (pl);
	lbl0.setBounds(70,35,200,25);    
	lbl1.setBounds(15,70,80,25);  
	lbl2.setBounds(15,110,80,25);  
	lbl3.setBounds(15,180,80,25);  
	
	txt1.setBounds(120,70,100,25);
	txt2.setBounds(120,110,100,25);
	txt3.setBounds(120,180,150,25);
	txt3.setEditable(false); 
	
	bthitung.setBounds(120,145,70,25);  
	btnHtngKerucut.setBounds(120,145,70,25);  
	btnHtngTabung.setBounds(120,145,70,25);  
	btbatal.setBounds(50,230,70,25);  
	btclose.setBounds(175,230,70,25);  

	btntabung.setBounds(30,5,100,25);
	btnkerucut.setBounds(150,5,100,25);

	pl.add(lbl0).setFont(new java.awt.Font("Tahoma", 1, 14));
	pl.add(lbl1);
	pl.add(lbl2).setVisible(false);
	pl.add(lbl3);
	pl.add(txt1);
	pl.add(txt2).setVisible(false);
	pl.add(txt3);
	pl.add(bthitung);
	pl.add(btnHtngKerucut).setVisible(false);
	pl.add(btnHtngTabung).setVisible(false);
	pl.add(btbatal);
	pl.add(btclose);  
	pl.add(btntabung);
	pl.add(btnkerucut);

	setTitle("Program Hitung Volume");  
	setBounds(100,100,300,300);  
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JButton[] tombol = {bthitung,btbatal,btclose,
	btntabung,btnkerucut,btnHtngTabung,btnHtngKerucut};
		for(int i=0;i<7;i++){
			tombol[i].addActionListener(this);
		}
}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==bthitung){
			hitungNilaiBola();
		}
		else if (e.getSource()==btbatal){
			hapusdata();
		}
		else if(e.getSource()==btntabung){
			hitungTabung();
		}
		else if(e.getSource()==btnkerucut){
			hitungKerucut();
		}
		else if(e.getSource()==btnHtngKerucut){
			hitungNilaiKerucut();
		}
		else if(e.getSource()==btnHtngTabung){
			hitungNilaiTabung();
		}
		else {
			System.exit(0);
		}
	}
public void hitungNilaiTabung(){  
	jarijari = Double.parseDouble(txt1.getText());
	tinggi = Double.parseDouble(txt2.getText());  
	double nilai2= ((jarijari*jarijari*3.14)*(tinggi));
	String nilaiB = Double.toString(nilai2);
	txt3.setText(nilaiB);
}
public void hitungNilaiBola(){
	jarijari = Double.parseDouble(txt1.getText());
	double nilai1= ((jarijari*jarijari*jarijari*3.14));
	String nilaiA = Double.toString(nilai1);
	txt3.setText(nilaiA);
}
public void hitungNilaiKerucut(){  
	jarijari = Double.parseDouble(txt1.getText());
	tinggi = Double.parseDouble(txt2.getText());  
	double nilai3= ((jarijari*jarijari*3.14)*(tinggi)*0.3);
	String nilaiC = Double.toString(nilai3);
	txt3.setText(nilaiC);
}
public void hapusdata(){  
	lbl0.setText("HITUNG VOLUME BOLA");
	txt1.setText("");  
	txt2.setVisible(false);
	lbl2.setVisible(false);
	txt3.setText("");
	bthitung.setVisible(true);  
}
public void hitungTabung(){
	lbl0.setText("HITUNG VOLUME TABUNG");
	lbl2.setVisible(true);
	txt1.setText("");
	txt2.setText("");
	txt2.setVisible(true);
	txt3.setText("");
	bthitung.setVisible(false);
	btnHtngKerucut.setVisible(false);
	btnHtngTabung.setVisible(true);
}
public void hitungKerucut(){  
	lbl0.setText("HITUNG VOLUME KERUCUT");
	txt1.setText("");
	lbl2.setVisible(true);
	txt2.setText("");
	txt2.setVisible(true);
	txt3.setText("");
	bthitung.setVisible(false);
	btnHtngTabung.setVisible(false);
	btnHtngKerucut.setVisible(true);
}
public static void main (String [] args){  
	HitungVolumeTabung obj = new HitungVolumeTabung();  
	obj.setVisible(true);  
	}
}