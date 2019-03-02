/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.Date;
import java.io.*;

public class ChatServer2 extends Frame implements ActionListener,Runnable  {
	
	private Label label1,label2;
	private Button button1;
	private TextArea textarea1,textarea2;
	ServerSocket socket;
	Socket insocket;
	int port=13;
	Thread thread;
	
   	ServerSocket server;
	Socket connection=null;
	
	InputStream in;
	OutputStream out;
	
		
	public static void main(String[] arg)
	{
		new ChatServer2();
	}
	public ChatServer2()
	{
		setLayout(null);
		
		label2=new Label("Chat Server");
		label2.setBounds(100,35,200,30);
		label2.setFont(new Font("Times New Roman",Font.BOLD,36));
        add(label2);
        
		setSize(400,400);
        setVisible(true);
        setTitle("Chat Server");
        
        button1 = new Button("Send");
        button1.setBounds(160, 360, 60, 20);
        add(button1);
        button1.addActionListener(this);
        
        textarea1 = new TextArea("", 7, 45, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textarea1.setBounds(20, 80, 340, 100);
        //textarea1.setText("hi");
        add(textarea1); 
        
        label1=new Label();
        label1.setBounds(20,210,100,20);
        label1.setText("Type Here");
        add(label1);
        
        textarea2 = new TextArea("", 7, 45, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textarea2.setBounds(20, 230, 340, 120);
        textarea2.setForeground(Color.RED);
        add(textarea2); 
        
        this.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent e)
        	{
        		System.exit(0);
        		try
        		{
        			socket.close();
        		}catch(Exception ex){}
        	}
        });
    
        try 
    	{
    		socket = new ServerSocket(port);
    		insocket = null;
    		
    			try {
    				insocket = socket.accept( );
    				//OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream( ));
    				in=insocket.getInputStream();
    				out=insocket.getOutputStream();
    				
    				thread=new Thread(this);
    				thread.start();

    				
    			}catch (IOException e) {}
    		
    	}catch (IOException e)
    	{
    		System.err.println(e);
    	}
	}
	
	public void actionPerformed(ActionEvent event)
    {
		if(event.getSource()==button1)
		{
			try
			{
				String str = textarea2.getText() + "\n";
	            byte buffer[] = str.getBytes();
	            out.write(buffer);
	            textarea1.setForeground(Color.RED);
	            textarea1.append(str+"\n");
	            textarea2.setText("");
	            textarea2.requestFocus();
			}catch(Exception e){}
		}
			
    }
	
	public void run()
	{
		String instring;
        try {

            BufferedReader in = new BufferedReader (new InputStreamReader(insocket.getInputStream()));

            textarea1.setForeground(Color.BLUE);
            
            while((instring = in.readLine()) != null){
                textarea1.append(instring + "\n");
            }

        }catch (Exception e) 
        {
            textarea1.setText(e.getMessage());
        }
		
	}
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

