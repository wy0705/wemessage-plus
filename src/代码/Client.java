

import javax.swing.JOptionPane;

/*
 * �����ڱ����Ӷ�
 */
public class Client {
	private static Client client=new Client();
	private ClientOrderReceiver oRC=null;//���������
	private ClientMessageShow show=null;//��Ϣ��ʾ
	
	private Client(){
		try {
			oRC=new ClientOrderReceiver();//����UDP�˿�
			
		} catch (MyException e) {
			show.showWARNING("����",e.toString());
		}//����������ն���
		
	}
	public static Client getInstance(){
		return client;
		
	}
	
	
	/////////////////////////////////////////////////
	public ClientOrderReceiver getORC() {
		return oRC;
	}
	public void setORC(ClientOrderReceiver orc) {
		oRC = orc;
	}
	
}
