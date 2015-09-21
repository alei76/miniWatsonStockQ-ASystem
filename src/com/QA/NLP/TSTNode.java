package com.QA.NLP;



public final class TSTNode {

	/**���ڵ�*/
	public final static int PARENT = 0;
	/**����ӽڵ�*/
	public final static int LOKID = 1;
	/**�м��ӽڵ�*/
	public final static int EQKID = 2;
	/**�ұ��ӽڵ�*/
	public final static int HIKID = 3;
	/**�ڵ��ֵ*/
	public Object data=null;
	/** The relative nodes. */
	public TSTNode[] relatives = new TSTNode[4];
	/**���ڵ��ʾ���ַ�  */
	public char splitchar;
	/**
	 *  ���캯��
	 *@param  splitchar  �ýڵ��ʾ���ַ�
	 *@param  parent     ���ڵ�
	 */
	public TSTNode(char splitchar, TSTNode parent) {
		this.splitchar = splitchar;
		relatives[PARENT] = parent;
	}
	public String toString()
	{
		return String.valueOf(splitchar)+":"+data;
	}
}